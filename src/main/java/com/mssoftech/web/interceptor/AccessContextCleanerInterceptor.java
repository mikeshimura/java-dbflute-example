package com.mssoftech.web.interceptor;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@Provider
public class AccessContextCleanerInterceptor  implements ContainerResponseFilter {
	private static final Logger log = LoggerFactory.getLogger(AccessContextCleanerInterceptor.class);
	@Override
    public void filter(ContainerRequestContext req,
            ContainerResponseContext resp)
                    throws IOException {
		AccessContext.clearAccessContextOnThread();
		log.debug("AccessContext end");
	}
}