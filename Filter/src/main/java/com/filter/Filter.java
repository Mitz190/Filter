package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter(urlPatterns = { "/Filter" }, servletNames = { "First_servlet" })
public class Filter implements javax.servlet.Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter wr =response.getWriter();
		wr.print("Before servlet execution");
		System.out.println("before");
		chain.doFilter(request, response);
		wr.print("after servlet execution");
		System.out.println("after");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}


}
