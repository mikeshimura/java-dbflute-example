package com.mssoftech.web.util;

import org.slf4j.Logger;

public class CommonUtil {

	public static void putStacktraceToLog(Logger log, Exception e) {
		log.error(e.getMessage());
		StackTraceElement[] stackTrace = e.getStackTrace();
		for (StackTraceElement stackTraceElement : stackTrace) {
			log.error(stackTraceElement.toString());
		}
		Throwable cause = e.getCause();
		if (cause != null) {
			log.error(" ");
			log.error("Caused By");
			putStacktraceToLog(log, (Exception) cause);
		}
		
	}

}
