package taitt.demo.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends MyHttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Servlet2 doGet start");
		res.getWriter().append("This is doGet method of Servlet2 class");
		System.out.println("Servlet2 doGet end");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Servlet2 doPost start");
		res.getWriter().append("This is doGet method of Servlet2 class");
		System.out.println("Servlet2 doPost end");
	}

}
