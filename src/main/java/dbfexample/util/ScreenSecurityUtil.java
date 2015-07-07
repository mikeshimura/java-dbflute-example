package dbfexample.util;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.inject.Inject;
import com.mssoftech.web.util.CommonUtil;
import com.mssoftech.web.util.HtmlUtil;
import dbfexample.dbflute.exentity.Login;
import dbfexample.dbflute.exentity.Session;
import dbfexample.service.LoginService;

public class ScreenSecurityUtil {
	private static final Logger log = LoggerFactory
			.getLogger(ScreenSecurityUtil.class);
	@Inject
	private LoginService loginService;

	public String generateAuthorizedScreen(HttpServletRequest request,
			HttpServletResponse response, String title, String[] js,
			String[] jslib, String[] css, String[] scriptLine) throws Exception {
		String url[] = request.getRequestURL().toString().split("/");
		String screen = url[url.length - 1];
		Session session = loginService.getSessionFromRequestCookie(request);
		Login login = loginService.getLoginFromSession(session);
		if (session == null) {
			return "セッションが切れています。再度ログインして下さい。";
		}
		try {
			if (checkAuth(screen, session, login) == false) {
				return "この画面は権限がありません。";
			}
		} catch (Exception e) {
			CommonUtil.putStacktraceToLog(log, e);
			return e.getMessage();
		}
		String[] scripts = createScript(login, scriptLine);
		return HtmlUtil.createHtml(title, js, jslib, css, scripts);
	}

	private String[] createScript(Login login, String[] scriptLine) {
		ArrayList<String> slist = new ArrayList();
		slist.add("if (!(window[\"$c\"] != null)) {window[\"$c\"] = {};}");
		slist.add("$c.login = {};");
		slist.add("$c.login.uid = " + String.valueOf(login.getId()) + ";");
		slist.add("$c.login.name = '" + login.getName() + "';");
		for (String s : scriptLine) {
			slist.add(s);
		}
		return slist.toArray(new String[] {});
	}

	private boolean checkAuth(String screen, Session session, Login login) {
		// 未実装
		return true;
	}
}
