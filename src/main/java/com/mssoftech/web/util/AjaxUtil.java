package com.mssoftech.web.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.TransactionManager;
import net.arnx.jsonic.JSON;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.exception.SQLFailureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.mssoftech.web.exception.ErrorMessageException;



public class AjaxUtil {
	private static final Logger log = LoggerFactory.getLogger(AjaxUtil.class);
	@Inject
	private TransactionManager transactionManager;
	@Inject
	private Injector injector;
	public String invoke(String str, HttpServletRequest request,
			HttpServletResponse response, String smethod,
			Class  clazz) throws Exception {
		transactionManager.begin();
		log.debug("begin transaction");
		try {

			Method[] methods = clazz.getMethods();
			Object target = injector.getInstance(clazz);
			Object res = null;
			Map params = createParams(str);
			for (Method method : methods) {
				if (method.getName().equals(smethod)) {
					res = method.invoke(target, params,request, response);
				}
			}
			String resstring=JSON.encode(res);
			transactionManager.commit();
			log.debug("commit transaction");
			return resstring;
		} catch (InvocationTargetException e) {
			transactionManager.rollback();
			log.debug("rollback transaction");
			Throwable targetException = ((InvocationTargetException) e)
					.getTargetException();
			Throwable cause = null;
			if (targetException.getClass() == InvocationTargetException.class) {
				cause = targetException.getCause();

				// ----- ここから　下まで同じ
				if (cause.getClass() == SQLFailureException.class) {
					log.warn(cause.toString());
					return JSON.encode(WebUtil.setErrorMessage(
							"SQL ERROR\n"
									+ cause.getCause().getCause().getMessage()));
				}

				if (cause.getClass() == EntityAlreadyUpdatedException.class) {
					return JSON.encode(WebUtil.setErrorMessage(
							"既にDataが更新されています。再度読み込んでから実行して下さい。"));
				}
				if (cause.getClass() == EntityAlreadyExistsException.class) {
					return JSON.encode(WebUtil.setErrorMessage(
							"キー項目の重複です。既に登録されています。"));
				}
				if (cause.getClass() == ErrorMessageException.class) {
					return JSON.encode(WebUtil.setErrorMessage(
							cause.getMessage()));
				}
				// ---------------------------------
			} else {
				cause = e.getTargetException();
//				// ----- ここから　下まで同じ
				if (cause.getClass() == SQLFailureException.class) {
					log.warn(cause.toString());
					return JSON.encode(WebUtil.setErrorMessage(
							"SQL ERROR\n"
									+ cause.getCause().getCause().getMessage()));
				}

				if (cause.getClass() == EntityAlreadyUpdatedException.class) {
					return JSON.encode(WebUtil.setErrorMessage(
							"既にDataが更新されています。再度読み込んでから実行して下さい。"));
				}
				if (cause.getClass() == EntityAlreadyExistsException.class) {
					return JSON.encode(WebUtil.setErrorMessage(
							"キー項目の重複です。既に登録されています。"));
				}
				if (cause.getClass() == ErrorMessageException.class) {
					return JSON.encode(WebUtil.setErrorMessage(
							cause.getMessage()));
				}
			// ---------------------------------
			}
			putErrorLog(e);
			return JSON.encode(WebUtil.setErrorMessage("System Error"));

		} catch (Exception e) {
			transactionManager.rollback();
			log.debug("rollback transaction");
			putErrorLogOrg(e);
			;
			return JSON.encode(WebUtil.setErrorMessage("System Error"));
		}

	}
	private void putErrorLogOrg(Exception e) {
		String msg = e.getClass().getName();
		log.debug("System Error:" + msg);
		CommonUtil.putStacktraceToLog(log, e);
	}
	private void putErrorLog(InvocationTargetException e) {
		Exception cause = (Exception) e.getCause();
		String msg = cause.getClass().getName();
		log.debug("System Error:" + msg);
		CommonUtil.putStacktraceToLog(log, (Exception) e.getCause());
	}
	public static Map createParams(String str) {
		Map params = (Map) JSON.decode(str);
		return params;
	}
}
