package com.mssoftech.web.util;

import java.time.LocalDateTime;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBFluteUtil {
	private static final Logger log = LoggerFactory
			.getLogger(DBFluteUtil.class);

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
}
