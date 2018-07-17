package taitt.demo.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends MyHttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Servlet1 doGet start");
		res.getWriter().append("This is doGet method of Servlet1 class");
		System.out.println("Servlet1 doGet end");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Servlet1 doPost start");
		res.getWriter().append("This is doGet method of Servlet1 class");
		System.out.println("Servlet1 doPost end");
	}

}
