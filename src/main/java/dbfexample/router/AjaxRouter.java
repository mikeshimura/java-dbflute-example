package dbfexample.router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.mssoftech.web.util.AjaxUtil;

import dbfexample.service.CustomerService;
import dbfexample.service.LoginService;
import dbfexample.service.UserTableService;

@Path("ajax")
public class AjaxRouter {
	
	@Inject
	private Injector injector;
	
	@POST
	@Path("loginauth")
	@Produces("application/json;charset=UTF-8")
	public String loginAuth(String str, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
		AjaxUtil ajaxUtil=injector.getInstance(AjaxUtil.class);
		return ajaxUtil.invoke(str, request, response, "loginAuth",
				LoginService.class);
	}
	
	@POST
	@Path("logout")
	@Produces("application/json;charset=UTF-8")
	public String loginout(String str, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
		str = "{\"dummy\":\"\"}";
		AjaxUtil ajaxUtil=injector.getInstance(AjaxUtil.class);
		return ajaxUtil.invoke(str, request, response, "logout",
				LoginService.class);
	}
	
	@POST
	@Path("login")
	@Produces("application/json;charset=UTF-8")
	public String login(String str, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
		AjaxUtil ajaxUtil=injector.getInstance(AjaxUtil.class);
		return ajaxUtil.invoke(str, request, response,"execute",
				LoginService.class);
	}	
	
	@POST
	@Path("customer")
	@Produces("application/json;charset=UTF-8")
	public String customer(String str, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
		AjaxUtil ajaxUtil=injector.getInstance(AjaxUtil.class);
		return ajaxUtil.invoke(str, request, response,"execute",
				CustomerService.class);
	}
	
	
	@POST
	@Path("usertbl")
	@Produces("application/json;charset=UTF-8")
	public String usertbl(String str, @Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception {
		AjaxUtil ajaxUtil=injector.getInstance(AjaxUtil.class);
		return ajaxUtil.invoke(str, request, response,"execute",
				UserTableService.class);
	}
}
