package dbfexample.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class HtmlUtil {
	public static String createHtml(String title , String[] js,
			String[] jslib, String[] css, String[] scriptLine) throws Exception {
		String htmlpath=getHtmlPath(".");
		Velocity.setProperty("file.resource.loader.path",htmlpath);
		Velocity.init();
		VelocityContext context = new VelocityContext();
		context.put("title", title);
		context.put("js", js);
		context.put("jslib", jslib);
		context.put("css", css);
		context.put("scriptLine", scriptLine);
		
		StringWriter sw = new StringWriter();
		Template template = Velocity.getTemplate("html.vm", "UTF-8");
		template.merge(context,sw);
		String res = sw.toString();
		sw.close();
		return res;
	}

	private static String getHtmlPath(String path) throws IOException {
		ClassLoader classLoader = HtmlUtil.class.getClassLoader();
		URL url = classLoader.getResource(path);
		return url.getPath();
	}

}
