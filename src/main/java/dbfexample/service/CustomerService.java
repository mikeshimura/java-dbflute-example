package dbfexample.service;

import static org.seasar.util.beans.util.CopyOptionsUtil.include;

import java.math.BigDecimal;
import java.util.ArrayList;
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

import dbfexample.dbflute.cbean.CustomerCB;
import dbfexample.dbflute.exbhv.CustomerBhv;
import dbfexample.dbflute.exentity.Customer;
import dbfexample.dbflute.exentity.Login;
import dbfexample.dbflute.exentity.Session;
import dbfexample.exception.ErrorMessageException;

public class CustomerService {
	private static final Logger log = LoggerFactory
			.getLogger(CustomerService.class);
	@Inject
	private LoginService loginService;
	@Inject
	private CustomerBhv customerBhv;

	public HashMap execute(HashMap params, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Session session = loginService.getSessionFromRequestCookie(request);
		if (session == null) {
			throw new ErrorMessageException("セッションがありません。再度ログインして下さい。");
		}
		Login emp = loginService.getLoginFromSession(session);
		loginService.checkLogin(session, params);
		ArrayList transactions = (ArrayList) params.get("transactions");
		if (transactions != null) {
			return transaction(transactions, request, session, emp, params);
		}

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

	private HashMap transaction(ArrayList<HashMap> transactions,
			HttpServletRequest request, Session session, Login emp,
			HashMap params) throws Exception {
		ArrayList transactionResult = new ArrayList();
		for (HashMap operation : transactions) {
			HashMap res = executeEachTransaction(operation, request, session,
					emp);
			HashMap response = (HashMap) res.get("response");
			response.put("queueStatus", 0);
			Integer status = (Integer) ((HashMap) res.get("response"))
					.get("status");
			if (status < 0) {
				return res;
			}
			transactionResult.add(res);
		}

		return WebUtil.setSingleFetchResult(transactionResult);
	}

	private HashMap executeEachTransaction(HashMap params,
			HttpServletRequest request, Session session, Login emp)
			throws Exception {
		String op = (String) params.get("operationType");

		if (op.equals("update")) {
			return updateProc(params, request, session, emp);
		}
		if (op.equals("add")) {
			return insertProc(params, request, session, emp);
		}
		return null;
	}

	private HashMap deleteProc(HashMap params, HttpServletRequest request,
			Session session, Login emp) {
		DBFluteUtil.setUserProcessToAccessContext(emp.getLoginId(),
				"customer:delete");
		BigDecimal bid = (BigDecimal) params.get("data");
		Integer id = bid.intValue();
		final OptionalEntity<Customer> del = customerBhv.selectByPK(id);
		if (!del.isPresent()) {
			throw new ErrorMessageException("id=" + String.valueOf(id)
					+ " が見つかりません");
		}
		del.get().setDelFlag(getDelFlagMaxValue(del.get()) + 1);
		customerBhv.update(del.get());
		return WebUtil.setSingleFetchResult(entityToMap(del.get()));
	}

	private int getDelFlagMaxValue(Customer customer) {
		ListResultBean<Customer> list = customerBhv.selectList(cb -> {
			cb.query().setCusCd_Equal(customer.getCusCd());
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
				"customer:update");
		Map updateInput = (Map) params.get("data");
		Customer upd = null;
		try {
			upd = BeanUtil.copyMapToNewBean(updateInput, Customer.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		OptionalEntity<Customer> oldOpt = customerBhv.selectByPK(upd.getId());
		if (!oldOpt.isPresent()) {
			throw new ErrorMessageException("Login id="
					+ String.valueOf(upd.getId()) + " が見つかりません");
		}
		Customer old = oldOpt.get();
		if (!upd.getCusCd().equals(old.getCusCd()) && dupCheck(upd)) {
			throw new ErrorMessageException("この 社員番号は既に使用されています。");
		}
		customerBhv.update(upd);
		return WebUtil.setSingleFetchResult(entityToMap(upd));
	}

	private HashMap insertProc(HashMap params, HttpServletRequest request,
			Session session, Login login) throws Exception {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(),
				"customer:insert");
		Map newLogin = (Map) params.get("data");
		Customer entity = null;
		try {
			entity = BeanUtil.copyMapToNewBean(newLogin, Customer.class);
		} catch (Exception e) {
			DBFluteUtil.mapToNewBeanExceptionAnalyze(e);
		}
		if (dupCheck(entity)) {
			throw new ErrorMessageException("このCustomer Codeは既に使用されています。");
		}
		customerBhv.insert(entity);
		return WebUtil.setSingleFetchResult(entityToMap(entity));
	}

	private boolean dupCheck(Customer entity) {
		ListResultBean<Customer> selectList = customerBhv.selectList(cb -> {
			cb.query().setCusCd_Equal(entity.getCusCd());
			cb.query().setDelFlag_Equal(0);
		});
		return (selectList.size() > 0);
	}

	private HashMap fetchProc(HashMap params, HttpServletRequest request,
			Session session, Login login) {
		DBFluteUtil.setUserProcessToAccessContext(login.getLoginId(),
				"customer:fetch");
		HashMap data = (HashMap) params.get("data");
		int maxRecord = Integer.parseInt((String) data.get("maxRecord"));
		ListResultBean<Customer> res = customerBhv.selectList(cb -> {
			cb.query().setDelFlag_Equal(0);
			cb.query().addOrderBy_CusCd_Asc();
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

	private Map entityToMap(Customer entity) {
		Map map = BeanUtil.copyBeanToNewMap(
				entity,
				include("cusCd", "name", "addr", "bldg", "cusConSec",
						"cusConName", "tel", "salesAmount", "id", "versionNo"));
		return map;
	}

	private void setupQueryCriteria(CustomerCB cb, HashMap data)
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
