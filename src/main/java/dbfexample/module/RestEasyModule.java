package dbfexample.module;

import org.jboss.resteasy.plugins.guice.ext.RequestScopeModule;
import com.mssoftech.web.interceptor.AccessContextCleanerInterceptor;
import com.mssoftech.web.interceptor.AccessContextProducerInterceptor;
import com.mssoftech.web.util.GuiceUtil;
import dbfexample.jaxrs.ClientErrorExceptionMapper;

public class RestEasyModule extends RequestScopeModule {
	@Override
	protected void configure() {
		super.configure();
		GuiceUtil.autoBinder(binder(), new String[] { "dbfexample.router",
				"dbfexample.service" });
		bind(ClientErrorExceptionMapper.class);
		bind(AccessContextProducerInterceptor.class);
		bind(AccessContextCleanerInterceptor.class);
	}

}
