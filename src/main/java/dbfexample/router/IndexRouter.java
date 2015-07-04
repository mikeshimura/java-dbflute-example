package dbfexample.router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mssoftech.web.util.HtmlUtil;

@Path("/")
public class IndexRouter {
	@SuppressWarnings("unused")
	private static final Logger _log = LoggerFactory.getLogger(IndexRouter.class);
//	@Inject
//	private TransactionManager transactionManager;
//
//	@Inject
//	private CustomerBhv customerBhv;
//	@Inject
//	private Injector injector;
	@GET
	@Produces("text/html;charset=UTF-8")
	public String index(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
//		AccessContext.getAccessContextOnThread().setAccessUser("TEST");
//		transactionManager.begin();
//		Customer customer = new Customer();
//		customer.setTel("TEL ROLLBACK AGAIN");
//		CustomerBhv customerBhv = injector.getInstance(CustomerBhv.class);
//		customerBhv.queryUpdate(customer, cb -> cb.query().setDelFlag_Equal(0));
//		_log.debug("start rollback");
//		transactionManager.rollback();
		String html = HtmlUtil.createHtml("メニュー画面", new String[]{"/js/$c.js", "/js/$v.js", "/js/index.js", "/js/_cjsx.js", "/js/indexjsx.js"},
				new String[]{"/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
					"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js"},
				new String[]{"/css/bootstrap.css", "/css/main.css"}, new String[]{});
		return html;

	}
}
