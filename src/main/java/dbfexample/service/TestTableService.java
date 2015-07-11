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
import com.mssoftech.web.exception.ErrorMessageException;
import com.mssoftech.web.util.CommonUtil;
import com.mssoftech.web.util.ConvUtil;
import com.mssoftech.web.util.DBFluteUtil;
import com.mssoftech.web.util.WebUtil;

import dbfexample.dbflute.cbean.TestTableCB;
import dbfexample.dbflute.exbhv.TestTableBhv;
import dbfexample.dbflute.exentity.Login;
import dbfexample.dbflute.exentity.Session;
import dbfexample.dbflute.exentity.TestTable;

public class TestTableService {
	private static final Logger log = LoggerFactory.getLogger(TestTableService.class);
	@Inject
	private LoginService loginService;
	@Inject
	private TestTableBhv testTableBhv;

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
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(), "testTable:delete");
		BigDecimal bid = (BigDecimal) params.get("data");
		Integer id = bid.intValue();
		final OptionalEntity<TestTable> del = testTableBhv.selectByPK(id);
		if (!del.isPresent()) {
			throw new ErrorMessageException("id=" + String.valueOf(id) + " が見つかりません");
		}
		del.get().setDelFlag(getDelFlagMaxValue(del.get()) + 1);
		testTableBhv.update(del.get());
		return WebUtil.setSingleFetchResult(entityToMap(del.get()));
	}

	private int getDelFlagMaxValue(TestTable testTable) {
		ListResultBean<TestTable> list = testTableBhv.selectList(cb -> {
			// Unique Condition
			cb.query().setTestId_Equal(testTable.getTestId());
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
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(), "testTable:update");
		Map updateInput = (Map) params.get("data");
		TestTable upd = null;
		try {
			upd = BeanUtil.copyMapToNewBean(updateInput, TestTable.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		OptionalEntity<TestTable> oldOpt = testTableBhv.selectByPK(upd.getId());
		if (!oldOpt.isPresent()) {
			throw new ErrorMessageException("id=" + String.valueOf(upd.getId()) + " が見つかりません");
		}
		TestTable old = oldOpt.get();
		// Replace true to check key change
		if (!upd.getTestId().equals(old.getTestId()) && dupCheck(upd)) {
			throw new ErrorMessageException("この TestIdは既に使用されています。");
		}
		testTableBhv.update(upd);
		return WebUtil.setSingleFetchResult(entityToMap(upd));
	}

	private HashMap insertProc(HashMap params, HttpServletRequest request, Session session, Login login)
			throws Exception {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(), "testTable:insert");
		Map newLogin = (Map) params.get("data");
		TestTable entity = null;
		try {
			entity = BeanUtil.copyMapToNewBean(newLogin, TestTable.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		if (dupCheck(entity)) {
			throw new ErrorMessageException("このTestIdは既に使用されています。");
		}
		testTableBhv.insert(entity);
		return WebUtil.setSingleFetchResult(entityToMap(entity));
	}

	private boolean dupCheck(TestTable entity) {
		ListResultBean<TestTable> selectList = testTableBhv.selectList(cb -> {
			// Unique Condition
			cb.query().setTestId_Equal(entity.getTestId());
			cb.query().setDelFlag_Equal(0);
		});
		return (selectList.size() > 0);
	}

	private HashMap fetchProc(HashMap params, HttpServletRequest request, Session session, Login login) {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(), "testTable:fetch");
		HashMap data = (HashMap) params.get("data");
		int maxRecord = Integer.parseInt((String) data.get("maxRecord"));
		ListResultBean<TestTable> res = testTableBhv.selectList(cb -> {
			cb.query().setDelFlag_Equal(0);
			// addOrderBy
			cb.query().addOrderBy_TestId_Asc();
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

	private Map entityToMap(TestTable entity) {
		Map map = BeanUtil.copyBeanToNewMap(entity,
				include("testId", "testDate", "testTimestamp", "testNbr", "id", "versionNo"));
		ConvUtil.dateConverter(map,"yyyy/MM/dd","testDate");
		ConvUtil.datetimeConverter(map,"yyyy/MM/dd hh:mm:ss","testTimestamp");
		return map;
	}

	private void setupQueryCriteria(TestTableCB cb, HashMap data) throws Exception {
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