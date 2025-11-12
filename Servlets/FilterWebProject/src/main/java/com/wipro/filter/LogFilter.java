package com.wipro.filter;

import java.util.logging.*;
import java.io.File;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LogFilter
 */
//@WebFilter("/LogFilter")
public class LogFilter implements Filter {
       
	private Logger logger = Logger.getLogger(LogFilter.class.getName());
	
	private FileHandler fileHandler;
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LogFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Log Filter Destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	
	//doFilter runs before and after the servlet
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
	
		logger.info("Request received date :" + new java.util.Date());

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		logger.info("Response sent at :" + new java.util.Date());
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		
		String userHome = System.getProperty("user.home");
		File logDir = new File(userHome, "Documents/LogDetails/AppLogs");
		if(!logDir.exists())
		{
			logDir.mkdirs();
			
		}
		
		String logPath = new File(logDir , "abc.log").getAbsolutePath();
		try {
			fileHandler = new FileHandler(logPath);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.addHandler(fileHandler);
		logger.info("---Logfilter initilized---");
		logger.info("logging to a directory" + logDir.getAbsolutePath());
		System.out.println("Log Filter Initialized");
	}

}
