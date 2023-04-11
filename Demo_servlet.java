package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo_servlet")
public class Demo_servlet extends HttpServlet {
	ServletConfig config=null;
	ServletContext context=null;
	private static final long serialVersionUID = 1L;
       
    
    public Demo_servlet() {
        
    }

	
    @Override
    public void init(ServletConfig config) throws ServletException {
    	this.config=config;
    	context=config.getServletContext();
    }

    	
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  response.setContentType("text/html");
    	  PrintWriter out=response.getWriter();
    	  String username=config.getInitParameter("username");
    	  String password=config.getInitParameter("password");
    	  out.println("<h1> Name="+username);
    	  out.println("<h1> password="+password);
    	  
    	  String user=context.getInitParameter("user");
  		String pass=context.getInitParameter("pass");
  		out.println("<h1>context user is.."+user);
  		out.println("<h1> context password is.."+pass);
  		
    	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
