package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/configueDemo")
public class configueDemo extends HttpServlet {
	ServletConfig config=null;
	private static final long serialVersionUID = 1L;
       
    
    public configueDemo() {
    	
    }

	public void init(ServletConfig config)throws ServletException
	{
		this.config=config;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		out.println("<h1>username="+username);
		out.println("<h1> password="+password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
