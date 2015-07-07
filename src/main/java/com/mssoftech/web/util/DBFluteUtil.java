package com.mssoftech.web.util;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.dbflute.cbean.AbstractConditionQuery;
import org.dbflute.cbean.coption.ConditionOptionCall;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.hook.AccessContext;
import org.seasar.util.exception.IllegalPropertyRuntimeException;
import org.seasar.util.exception.ParseRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dbfexample.exception.ErrorMessageException;

public class DBFluteUtil {
	private static final Logger log = LoggerFactory
			.getLogger(DBFluteUtil.class);
	static HashMap _comnColMap = null;
	static HashMap<String, String> _omap = null;
	static HashMap<String, String> _omap2 = null;
	static Boolean localenv = null;
	static String LF = "\n";

	public static void clearAccessContext() {
		AccessContext.clearAccessContextOnThread();
		log.debug("ActionAccessContextIntercepter End");
	}

	public static void setNewAccessContext(String user, String process) {
		AccessContext ac = new AccessContext();
		ac.setAccessUser(user);
		ac.setAccessProcess(process);
		ac.setAccessLocalDateTime(LocalDateTime.now());
		AccessContext.setAccessContextOnThread(ac);
		log.debug("ActionAccessContextIntercepter Begin");
	}

	public static void setUserProcessToAccessContext(String username,
			String proc) {
		AccessContext ac = AccessContext.getAccessContextOnThread();
		ac.setAccessUser(username);
		ac.setAccessProcess(proc);
	}

	public static void setCriteria(AbstractConditionQuery query, Map map)
			throws Exception {
		// AbstractConditionQuery
		HashMap opMap = getOpMap();
		HashMap opMap2 = getOpMap2();
		String field = (String) map.get("fieldName");

		String operator = (String) map.get("operator");
		String op = (String) opMap.get(operator);
		String setter = "set" + field.substring(0, 1).toUpperCase()
				+ field.substring(1) + "_" + op;
		String op2 = (String) opMap2.get(operator);
		String setter2 = "set" + field.substring(0, 1).toUpperCase()
				+ field.substring(1) + "_" + op2;
		String start = CommonUtil.convertToString(map.get("start"));
		String end = CommonUtil.convertToString(map.get("end"));

		// start がNullまたは Spaceなら何もしない
		if (operator == null || start == null || start.equals("")) {
			return;
		}
		if (operator.equals("between") && (end == null || end.equals(""))) {
			return;
		}

		Method[] methods = query.getClass().getMethods();
		for (Method method : methods) {
			if (method.getName().equals(setter)) {
				Object startObj = convParameterFromString(start,
						method.getParameterTypes()[0]);
				ConditionOptionCall<LikeSearchOption> lsoLambda = null;
				if (op.equals("LikeSearch") || op.equals("NotLikeSearch")) {
					if (operator.equals("contains")
							|| operator.equals("does not contain")) {
						lsoLambda = xx -> xx.likeContain();
					}
					if (operator.equals("starts with")
							|| operator.equals("does not start with")) {
						lsoLambda = xx -> xx.likePrefix();
					}
					if (operator.equals("ends with")
							|| operator.equals("does not end with")) {
						lsoLambda = xx -> xx.likeSuffix();
					}
					method.invoke(query, startObj, lsoLambda);
				} else {
					method.invoke(query, startObj);
				}

			}
			// if (operator.equals("between") &&
			// method.getName().equals(setter2)) {
			if (method.getName().equals(setter2)) {
				Object endObj = convParameterFromString(end,
						method.getParameterTypes()[0]);
				method.invoke(query, endObj);
			}

		}

	}

	private static Object convParameterFromString(String param, Class<?> class1) {
		if (param == null) {
			return null;
		}
		if (class1.equals(String.class)) {
			return param;
		}
		param = param.trim();
		if (class1.equals(Integer.class)) {
			try {
				return Integer.valueOf(param);
			} catch (Exception e) {
				throw new ErrorMessageException(param + "の整数形式が正しくないです。");
			}
		}
		if (class1.equals(LocalDate.class)) {
			try {
				return LocalDate.parse(param, CalendarUtil.getDfDate());
			} catch (Exception e) {
				throw new ErrorMessageException(param + "の日付形式が正しくないです。");
			}

		}
		if (class1.equals(LocalDateTime.class)) {

			if (param.length() == 10) {
				param = param + " 00:00:00";
			}
			try {
				return LocalDateTime
						.parse(param, CalendarUtil.getDfTimestamp());
			} catch (Exception e) {
				;
				throw new ErrorMessageException(param + "の日時形式が正しくないです。");
			}

		}
		if (class1.equals(Boolean.class)) {
			if (param.equals("true")) {
				return new Boolean(true);
			}
			return new Boolean(false);
		}

		throw new RuntimeException("Conversion rule not set for "
				+ class1.toString());

	}

	private static HashMap getOpMap2() {
		if (_omap2 == null) {

			_omap2 = new HashMap();
			_omap2.put("between", "LessEqual");
			_omap2.put("exclude", "GreaterThan");
		}
		return _omap2;
	}

	private static HashMap getOpMap() {
		if (_omap == null) {

			_omap = new HashMap();
			_omap.put("=", "Equal");
			_omap.put("<>", "NotEqual");
			_omap.put(">", "GreaterThan");
			_omap.put("<", "LessThan");
			_omap.put(">=", "GreaterEqual");
			_omap.put("<=", "LessEqual");
			_omap.put("contains", "LikeSearch");
			_omap.put("starts with", "LikeSearch");
			_omap.put("ends with", "LikeSearch");
			_omap.put("like", "LikeSearch");
			_omap.put("between", "GreaterEqual");
			_omap.put("exclude", "LessThan");
		}
		return _omap;
	}

	public static void mapToNewBeanExceptionAnalyze(Exception e) throws Exception {
		String propetyName = "";
		if (e.getClass().equals(IllegalPropertyRuntimeException.class)) {
			propetyName = ((IllegalPropertyRuntimeException) e)
					.getPropertyName();
		}
		if (e.getCause().getClass().equals(ParseRuntimeException.class)) {
			throw new ErrorMessageException(e.getMessage());
		}
		if (e.getCause().getClass().equals(NumberFormatException.class)) {
			throw new ErrorMessageException(propetyName + " 数値形式ではありません。");
		}
		throw e;

	}
}
