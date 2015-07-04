package dbfexample.interceptor;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class AccessContextProducerInterceptor implements ContainerRequestFilter {
	private static final Logger _log = LoggerFactory
			.getLogger(AccessContextProducerInterceptor.class);

	@Override
	public void filter(ContainerRequestContext requestContext)
			throws IOException {
		AccessContext ac = new AccessContext();
		ac.setAccessUser("");
		ac.setAccessProcess("");
		ac.setAccessLocalDateTimeProvider(new AccessLocalDateTimeProvider());
		AccessContext.setAccessContextOnThread(ac);
		_log.debug("AccessContext start日本語");
	}

	private class AccessLocalDateTimeProvider implements
			AccessContext.AccessLocalDateTimeProvider {
		@Override
		public LocalDateTime provideLocalDateTime() {
			return LocalDateTime.now();
		}
	}
}