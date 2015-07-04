package dbfexample.module;

import org.jboss.resteasy.plugins.guice.ext.RequestScopeModule;

import dbfexample.interceptor.AccessContextCleanerInterceptor;
import dbfexample.interceptor.AccessContextProducerInterceptor;
import dbfexample.jaxrs.ClientErrorExceptionMapper;
import dbfexample.router.IndexRouter;

public class RestEasyModule extends RequestScopeModule {
	@Override
	protected void configure() {
		super.configure();
		bind(IndexRouter.class);
		bind(ClientErrorExceptionMapper.class);
		bind(AccessContextProducerInterceptor.class);
		bind(AccessContextCleanerInterceptor.class);
	}

}
