package dbfexample.service;

import java.util.HashMap;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;

import com.google.inject.Inject;
import com.mssoftech.web.util.DBFluteUtil;
import com.mssoftech.web.util.DbUtil;
import com.mssoftech.web.util.WebUtil;

import dbfexample.dbflute.exbhv.LoginBhv;
import dbfexample.dbflute.exbhv.SessionBhv;
import dbfexample.dbflute.exentity.Login;
import dbfexample.dbflute.exentity.Session;
import dbfexample.exception.ErrorMessageException;

public class LoginService {
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

	private Login getLoginFromSession(Session session) {
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

	private Session getSessionFromRequestCookie(HttpServletRequest request) {
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
		if (uuid == null) {
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
}
