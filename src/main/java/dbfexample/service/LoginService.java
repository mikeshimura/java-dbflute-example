package dbfexample.service;

import static org.seasar.util.beans.util.CopyOptionsUtil.include;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.seasar.util.beans.util.BeanUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Inject;
import com.mssoftech.web.exception.ErrorMessageException;
import com.mssoftech.web.util.CommonUtil;
import com.mssoftech.web.util.DBFluteUtil;
import com.mssoftech.web.util.DbUtil;
import com.mssoftech.web.util.WebUtil;
import dbfexample.dbflute.cbean.LoginCB;
import dbfexample.dbflute.exbhv.LoginBhv;
import dbfexample.dbflute.exbhv.SessionBhv;
import dbfexample.dbflute.exentity.Login;
import dbfexample.dbflute.exentity.Session;

public class LoginService {
	private static final Logger log = LoggerFactory
			.getLogger(LoginService.class);
	@Inject
	private LoginBhv loginBhv;
	@Inject
	private SessionBhv sessionBhv;

	public HashMap loginAuth(HashMap params, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return loginAuthSub(params, request, response, true);
	}

	public HashMap loginAuthSub(HashMap params, HttpServletRequest request,
			HttpServletResponse response, boolean useCookie) throws Exception {
		Login login = getLoginFromLoginIｄ(params);
		// not found
		if (login == null) {
			throw new ErrorMessageException("ユーザー IDが見つかりません");
		}
		if (!(DbUtil.createMd5((String) params.get("password"))).equals(login
				.getPassword())) {
			throw new ErrorMessageException("パスワードが違います");
		}
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(),
				"loginAuth");
		Session session = createNewSession(login);
		HashMap loginInfo = createLoginInfo(login, session);
		if (useCookie) {
			addUuidCookie(response, session);
		} else {
			loginInfo.put("uuid", session.getUuid());
		}
		return WebUtil.setSingleFetchResult(loginInfo);
	}

	public HashMap logout(HashMap params, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Session session = getSessionFromRequestCookie(request);
		clearUuidCookie(response);
		if (session == null) {
			throw new ErrorMessageException("login not found. Already Logout");
		}
		if (session.getDelFlag() > 0) {
			throw new ErrorMessageException("Already Logout");
		}
		Login emp = getLoginFromSession(session);
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(), "logout");
		session.setDelFlag(1);
		sessionBhv.update(session);
		return WebUtil.setSingleFetchResult("OK");
	}

	public Login getLoginFromSession(Session session) {
		if (session == null) {
			return null;
		}

		OptionalEntity<Login> login = loginBhv.selectEntity(cb -> {
			cb.query().setId_Equal(session.getLoginId());
		});
		if (login.isPresent()) {
			return login.get();
		}
		return null;
	}

	public Session getSessionFromRequestCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		String uuid = null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("uuid")) {
				uuid = cookie.getValue();
			}
		}
		;
		return getSession(uuid);
	}

	private Session getSession(String uuid) {
		if (uuid == null || uuid.equals("")) {
			return null;
		}

		ListResultBean<Session> list = sessionBhv.selectList(cb -> {
			cb.query().setUuid_Equal(uuid);
			cb.query().setDelFlag_Equal(0);
		});
		if (list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	private void clearUuidCookie(HttpServletResponse response) {
		Cookie cuuid = new Cookie("uuid", "");
		cuuid.setPath("/");
		response.addCookie(cuuid);
	}

	private void addUuidCookie(HttpServletResponse response, Session session) {
		Cookie cuuid = new Cookie("uuid", session.getUuid());
		cuuid.setPath("/");
		response.addCookie(cuuid);
	}

	private HashMap createLoginInfo(Login login, Session session) {
		HashMap loginInfo = new HashMap();
		loginInfo.put("uid", login.getId());
		loginInfo.put("name", login.getName());
		return loginInfo;
	}

	private Session createNewSession(Login login) {
		String uuid = UUID.randomUUID().toString();
		Session session = new Session();
		session.setUuid(uuid);
		session.setLoginId(login.getId());
		sessionBhv.insert(session);
		return session;
	}

	private Login getLoginFromLoginIｄ(HashMap params) {
		ListResultBean<Login> selectList = loginBhv.selectList(cb -> {
			cb.query().setLoginId_Equal((String) params.get("loginId"));
			cb.query().setDelFlag_Equal(0);
		});
		if (selectList.size() == 1) {
			return selectList.get(0);
		}
		return null;
	}

	public void checkLogin(Session session, HashMap params) throws Exception {
		if (session == null) {
			throw new ErrorMessageException("ログインは有効ではありません");
		}
	}
	public HashMap execute(HashMap params, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Session session = getSessionFromRequestCookie(request);
		if (session == null) {
			throw new ErrorMessageException("セッションがありません。再度ログインして下さい。");
		}
		Login emp = getLoginFromSession(session);
		checkLogin(session, params);
		String op = (String) params.get("operationType");
		if (op.equals("fetch")) {
			return fetchProc(params, request, session, emp);
		}
		if (op.equals("update")) {
			return updateProc(params, request, session, emp);
		}
		if (op.equals("remove")) {
			return deleteProc(params, request, session, emp);
		}
		if (op.equals("add")) {
			return insertProc(params, request, session, emp);
		}
		throw new ErrorMessageException("operationType notfound :" + op);
	}

	private HashMap deleteProc(HashMap params, HttpServletRequest request,
			Session session, Login emp) {
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(),
				"login:delete");
		BigDecimal bid = (BigDecimal) params.get("data");
		Integer id = bid.intValue();
		final OptionalEntity<Login> del = loginBhv.selectByPK(id);
		if (!del.isPresent()) {
			throw new ErrorMessageException("id=" + String.valueOf(id)
					+ " が見つかりません");
		}
		del.get().setDelFlag(getDelFlagMaxValue(del.get()) + 1);
		loginBhv.update(del.get());
		return WebUtil.setSingleFetchResult(entityToMap(del.get()));
	}

	private int getDelFlagMaxValue(Login login) {
		ListResultBean<Login> list = loginBhv.selectList(cb -> {
			cb.query().setLoginId_Equal(login.getLoginId());
			cb.query().addOrderBy_DelFlag_Desc();
			cb.fetchFirst(1);
		});
		if (list.size() == 0) {
			return 1;
		}
		return list.get(0).getDelFlag();
	}

	private HashMap updateProc(HashMap params, HttpServletRequest request,
			Session session, Login emp) throws Exception {
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(),
				"login:update");
		Map updateInput = (Map) params.get("data");
		Login upd = null;
		try {
			upd = BeanUtil.copyMapToNewBean(updateInput, Login.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		convertPassword(upd);
		OptionalEntity<Login> oldOpt = loginBhv.selectByPK(upd.getId());
		if (!oldOpt.isPresent()) {
			throw new ErrorMessageException("id="
					+ String.valueOf(upd.getId()) + " が見つかりません");
		}
		Login old = oldOpt.get();
		if ( !upd.getLoginId().equals(old.getLoginId()) && dupCheck(upd)) {
			throw new ErrorMessageException("この Login Idは既に使用されています。");
		}
		loginBhv.update(upd);
		return WebUtil.setSingleFetchResult(entityToMap(upd));
	}

	private void convertPassword(Login upd) {
		if(upd.getPassword()!=null && !upd.getPassword().equals("")){
			upd.setPassword(DbUtil.createMd5(upd.getPassword()));
		}
		
	}

	private HashMap insertProc(HashMap params, HttpServletRequest request,
			Session session, Login login) throws Exception {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(),
				"login:insert");
		Map newLogin = (Map) params.get("data");
		Login entity = null;
		try {
			entity = BeanUtil.copyMapToNewBean(newLogin, Login.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		if (dupCheck(entity)) {
			throw new ErrorMessageException("このLogin Idは既に使用されています。");
		}
		entity.setPassword(DbUtil.createMd5(entity.getPassword()));
		loginBhv.insert(entity);
		return WebUtil.setSingleFetchResult(entityToMap(entity));
	}

	private boolean dupCheck(Login entity) {
		ListResultBean<Login> selectList = loginBhv.selectList(cb -> {
			cb.query().setLoginId_Equal(entity.getLoginId());
			cb.query().setDelFlag_Equal(0);
		});
		return (selectList.size() > 0);
	}

	private HashMap fetchProc(HashMap params, HttpServletRequest request,
			Session session, Login login) {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(),
				"login:fetch");
		HashMap data = (HashMap) params.get("data");
		int maxRecord = Integer.parseInt((String) data.get("maxRecord"));
		ListResultBean<Login> res = loginBhv.selectList(cb -> {
			cb.query().setDelFlag_Equal(0);
			cb.query().addOrderBy_LoginId_Asc();
			cb.paging(maxRecord, 1);

			try {
				setupQueryCriteria(cb, data);
			} catch (Exception e) {

				CommonUtil.putStacktraceToLog(log, e);
				throw new ErrorMessageException(e.getMessage());
			}
		});
		List<Map> ar = res.stream().map(entity -> entityToMap(entity))
				.collect(Collectors.toList());
		return WebUtil.setFetchResult(ar, 0, 0, res.size());
	}

	private Map entityToMap(Login entity) {
		Map map = BeanUtil.copyBeanToNewMap(
				entity,
				include("loginId","name","id","versionNo"));
		return map;
	}

	private void setupQueryCriteria(LoginCB cb, HashMap data)
			throws Exception {
		if (data != null) {
			List<Map> criteria = (List) data.get("criteria");
			if (criteria == null) {
				// initial open case no record return
				cb.query().setId_Equal(-99999);
				return;
			}
			for (int i = 0; i < criteria.size(); i++) {
				DBFluteUtil.setCriteria(cb.query(), criteria.get(i));
			}
		}

	}
}
