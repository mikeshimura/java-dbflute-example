package dbfexample.router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Inject;
import com.mssoftech.web.util.HtmlUtil;
import dbfexample.util.ScreenSecurityUtil;

@Path("/")
public class IndexRouter {
	@SuppressWarnings("unused")
	private static final Logger _log = LoggerFactory.getLogger(IndexRouter.class);

	@Inject
	private ScreenSecurityUtil screenSecurityUtil;

	@GET
	@Produces("text/html;charset=UTF-8")
	public String index(@Context HttpServletRequest request, @Context HttpServletResponse response) throws Exception {
		String html = HtmlUtil.createHtml("メニュー画面",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/index.js", "/js/_cjsx.js", "/js/indexjsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
		return html;

	}

	@GET
	@Path("customer")
	@Produces("text/html;charset=UTF-8")
	public String customer(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws Exception {
		return screenSecurityUtil.generateAuthorizedScreen(request, response, "CUSTOMER管理",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/customer.js", "/js/_cjsx.js", "/js/customerjsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
	}

	@GET
	@Path("customert")
	@Produces("text/html;charset=UTF-8")
	public String customert(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws Exception {
		return screenSecurityUtil.generateAuthorizedScreen(request, response, "CUSTOMER管理",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/customert.js", "/js/_cjsx.js", "/js/customertjsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
	}

	@GET
	@Path("customerin")
	@Produces("text/html;charset=UTF-8")
	public String customerin(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws Exception {
		return screenSecurityUtil.generateAuthorizedScreen(request, response, "CUSTOMER管理",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/customerin.js", "/js/_cjsx.js", "/js/customerinjsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
	}

	@GET
	@Path("login")
	@Produces("text/html;charset=UTF-8")
	public String login(@Context HttpServletRequest request, @Context HttpServletResponse response) throws Exception {
		return screenSecurityUtil.generateAuthorizedScreen(request, response, "LOGIN管理",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/login.js", "/js/_cjsx.js", "/js/loginjsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
	}

	@GET
	@Path("usertbl")
	@Produces("text/html;charset=UTF-8")
	public String usertbl(@Context HttpServletRequest request, @Context HttpServletResponse response) throws Exception {
		return screenSecurityUtil.generateAuthorizedScreen(request, response, "USER TABLE管理",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/usertbl.js", "/js/_cjsx.js", "/js/usertbljsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
	}
	@GET
	@Path("testtable")
	@Produces("text/html;charset=UTF-8")
	public String testtable(@Context HttpServletRequest request, @Context HttpServletResponse response)
			throws Exception {
		return screenSecurityUtil.generateAuthorizedScreen(request, response, "TEST TABLE 管理",
				new String[] { "/js/$c.js", "/js/$v.js", "/js/testtable.js", "/js/_cjsx.js", "/js/testtablejsx.js" },
				new String[] { "/js/lib/fluxxor.js", "/js/lib/react.js", "/js/lib/react-bootstrap.js",
						"/js/lib/jquery-1.11.1.js", "/js/lib/lodash.js" },
				new String[] { "/css/bootstrap.css", "/css/main.css" }, new String[] {});
	}
}
