package dbfexample.service;

import static org.seasar.util.beans.util.CopyOptionsUtil.include;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.seasar.util.beans.util.BeanUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Inject;
import com.mssoftech.web.util.CommonUtil;
import com.mssoftech.web.util.DBFluteUtil;
import com.mssoftech.web.util.WebUtil;

import dbfexample.dbflute.cbean.UserTableCB;
import dbfexample.dbflute.exbhv.UserTableBhv;
import dbfexample.dbflute.exentity.Login;
import dbfexample.dbflute.exentity.Session;
import dbfexample.dbflute.exentity.UserTable;
import dbfexample.exception.ErrorMessageException;

public class UserTableService {
	private static final Logger log = LoggerFactory.getLogger(UserTableService.class);
	@Inject
	private LoginService loginService;
	@Inject
	private UserTableBhv userTableBhv;

	public HashMap execute(HashMap params, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Session session = loginService.getSessionFromRequestCookie(request);
		if (session == null) {
			throw new ErrorMessageException("セッションがありません。再度ログインして下さい。");
		}
		Login emp = loginService.getLoginFromSession(session);
		loginService.checkLogin(session, params);
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

	private HashMap deleteProc(HashMap params, HttpServletRequest request, Session session, Login emp) {
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(), "userTable:delete");
		BigDecimal bid = (BigDecimal) params.get("data");
		Integer id = bid.intValue();
		final OptionalEntity<UserTable> del = userTableBhv.selectByPK(id);
		if (!del.isPresent()) {
			throw new ErrorMessageException("id=" + String.valueOf(id) + " が見つかりません");
		}
		del.get().setDelFlag(getDelFlagMaxValue(del.get()) + 1);
		userTableBhv.update(del.get());
		return WebUtil.setSingleFetchResult(entityToMap(del.get()));
	}

	private int getDelFlagMaxValue(UserTable userTable) {
		ListResultBean<UserTable> list = userTableBhv.selectList(cb -> {
			cb.query().setTableName_Equal(userTable.getTableName());
			cb.query().setKey1_Equal(userTable.getKey1());
			cb.query().setKey2_Equal(userTable.getKey2());
			cb.query().addOrderBy_DelFlag_Desc();
			cb.fetchFirst(1);
		});
		if (list.size() == 0) {
			return 1;
		}
		return list.get(0).getDelFlag();
	}

	private HashMap updateProc(HashMap params, HttpServletRequest request, Session session, Login emp)
			throws Exception {
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(), "userTable:update");
		Map updateInput = (Map) params.get("data");
		UserTable upd = null;
		try {
			upd = BeanUtil.copyMapToNewBean(updateInput, UserTable.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		OptionalEntity<UserTable> oldOpt = userTableBhv.selectByPK(upd.getId());
		if (!oldOpt.isPresent()) {
			throw new ErrorMessageException("id=" + String.valueOf(upd.getId()) + " が見つかりません");
		}
		UserTable old = oldOpt.get();
		if (old.getKey2() == null) {
			if (!(upd.getTableName().equals(old.getTableName()) && upd.getKey1().equals(old.getKey1())
					&& upd.getKey2() == null) && dupCheck(upd)) {
				throw new ErrorMessageException("このDataは既に使用されています。");
			}
		} else if (!(upd.getTableName().equals(old.getTableName()) && upd.getKey1().equals(old.getKey1())
				&& upd.getKey2().equals(old.getKey2())) && dupCheck(upd)) {
			throw new ErrorMessageException("このDataは既に使用されています。");
		}
		userTableBhv.update(upd);
		return WebUtil.setSingleFetchResult(entityToMap(upd));
	}

	private HashMap insertProc(HashMap params, HttpServletRequest request, Session session, Login login)
			throws Exception {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(), "userTable:insert");
		Map newLogin = (Map) params.get("data");
		UserTable entity = null;
		try {
			entity = BeanUtil.copyMapToNewBean(newLogin, UserTable.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		if (dupCheck(entity)) {
			throw new ErrorMessageException("このXXXXは既に使用されています。");
		}
		userTableBhv.insert(entity);
		return WebUtil.setSingleFetchResult(entityToMap(entity));
	}

	private boolean dupCheck(UserTable entity) {
		ListResultBean<UserTable> selectList = userTableBhv.selectList(cb -> {
			cb.enableEmptyStringQuery(() -> cb.query().setKey2_Equal(entity.getKey2()));
			cb.query().setTableName_Equal(entity.getTableName());
			cb.query().setKey1_Equal(entity.getKey1());
			cb.query().setDelFlag_Equal(0);
		});
		return (selectList.size() > 0);
	}

	private HashMap fetchProc(HashMap params, HttpServletRequest request, Session session, Login login) {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(), "userTable:fetch");
		HashMap data = (HashMap) params.get("data");
		int maxRecord = Integer.parseInt((String) data.get("maxRecord"));
		ListResultBean<UserTable> res = userTableBhv.selectList(cb -> {
			cb.query().setDelFlag_Equal(0);
			cb.query().addOrderBy_TableName_Asc().addOrderBy_Key1_Asc().addOrderBy_Key2_Asc();
			cb.paging(maxRecord, 1);
			try {
				setupQueryCriteria(cb, data);
			} catch (Exception e) {

				CommonUtil.putStacktraceToLog(log, e);
				throw new ErrorMessageException(e.getMessage());
			}
		});
		List<Map> ar = res.stream().map(entity -> entityToMap(entity)).collect(Collectors.toList());
		return WebUtil.setFetchResult(ar, 0, 0, res.size());
	}

	private Map entityToMap(UserTable entity) {
		Map map = BeanUtil.copyBeanToNewMap(entity, include("tableName", "key1", "key2", "s1Data", "s2Data", "s3Data",
				"n1Data", "n2Data", "n3Data", "id", "versionNo"));
		return map;
	}

	private void setupQueryCriteria(UserTableCB cb, HashMap data) throws Exception {
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
