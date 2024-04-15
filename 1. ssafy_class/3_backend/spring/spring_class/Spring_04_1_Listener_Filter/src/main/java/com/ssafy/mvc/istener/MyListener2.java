package com.ssafy.mvc.istener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyListener2 implements ServletContextListener {

	 public void contextInitialized(ServletContextEvent sce)  { 
	    	System.out.println("웹어플리케이션 시작될 때 호출 2");
	    	
	    	ServletContext context = sce.getServletContext();
	    	System.out.println("welcome : "+context.getInitParameter("welcome"));
	    	
	    	
	    }
	    public void contextDestroyed(ServletContextEvent sce)  { 
	    	System.out.println("웹어플리케이션 종료될 때 호출 2");
	    }
	
}
