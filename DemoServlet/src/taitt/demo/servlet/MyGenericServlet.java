package taitt.demo.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyGenericServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("MyGenericServlet destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("MyGenericServlet init servlet start");
		String servletName = config.getInitParameter("servletName");
		System.out.println(servletName);
		System.out.println("MyGenericServlet init servlet end");
		
		System.out.println("MyGenericServlet init context start");
		String projectName = config.getServletContext().getInitParameter("projectName");
		System.out.println(projectName);
		System.out.println("MyGenericServlet init context end");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("MyGenericServlet service start");
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpServletResponse httRes = (HttpServletResponse) res;
		System.out.println("MyGenericServlet service end");
	}

}
