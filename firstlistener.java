package com.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class firstlistener implements ServletContextListener {

    
    public firstlistener() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
        
    	System.out.println("server conext method is destroyed");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         
    	System.out.println("server conext method is initialized");
    }
	
}
