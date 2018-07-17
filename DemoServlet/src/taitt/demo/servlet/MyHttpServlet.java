package taitt.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends MyGenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("MyHttpServlet service start");
		HttpServletRequest request;
		HttpServletResponse response;
		try {
			request = (HttpServletRequest) req;
			response = (HttpServletResponse) res;
		} catch (ClassCastException e) {
			throw new ServletException("non-HTTP request or response");
		}
		service(request, response);
		System.out.println("MyHttpServlet service end");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String method = req.getMethod();
		if (method.equals("GET")) {
			doGet(req, res);
		}else if(method.equals("POST")) {
			doPost(req,res);
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("MyHttpServlet doGet start");
		res.getWriter().append("This is doGet method of MyHttpServlet class");
		System.out.println("MyHttpServlet doGet end");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("MyHttpServlet doPost start");
		res.getWriter().append("This is doPost method of MyHttpServlet class");
		System.out.println("MyHttpServlet doPost end");
	}

}
