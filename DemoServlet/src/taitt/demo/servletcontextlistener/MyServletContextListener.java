package taitt.demo.servletcontextlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("MyServletContextListener destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("MyServletContextListener Initialized");
	}

}
