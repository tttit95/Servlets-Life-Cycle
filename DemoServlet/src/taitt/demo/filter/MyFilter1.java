package taitt.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter{

	@Override
	public void destroy() {
		System.out.println("MyFilter1 destroy");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
		System.out.println("MyFilter1 doFilter() start");
		filter.doFilter(req, res);
		System.out.println("MyFilter1 doFilter() end");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("MyFilter1 init");
		
	}

}
