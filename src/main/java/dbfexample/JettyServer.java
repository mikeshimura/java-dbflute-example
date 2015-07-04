package dbfexample;

import java.io.File;

import javax.sql.DataSource;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

import com.google.inject.Guice;
import com.google.inject.Injector;

import dbfexample.dbflute.allcommon.DBFluteModule;
import dbfexample.module.RestEasyModule;
import dbfexample.module.TransactionModule;
import dbfexample.util.DbUtil;

public class JettyServer {
	public void startServer() throws Exception {
		DataSource dataSource = DbUtil.createDataSource();
		Injector injector = Guice.createInjector(new RestEasyModule(),
				new DBFluteModule(dataSource),
				new TransactionModule(dataSource));
		injector.getAllBindings();
		injector.createChildInjector().getAllBindings();
		String port = System.getenv("PORT");
		Server server = new Server(Integer.parseInt(port));
		ServletContextHandler servletHandler = new ServletContextHandler();
		servletHandler
				.addEventListener(injector
						.getInstance(GuiceResteasyBootstrapServletContextListener.class));
		ServletHolder sh = new ServletHolder(HttpServletDispatcher.class);
		servletHandler.addServlet(sh, "/*");
		ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(false);
		resourceHandler.setResourceBase("." + File.separator + "src"
				+ File.separator + "main" + File.separator + "webapp"
				+ File.separator + "static");
		ContextHandler ctx = new ContextHandler("/static");
		ctx.setHandler(resourceHandler);
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { ctx, servletHandler });
		server.setHandler(handlers);
		server.start();
		server.join();
	}

}
