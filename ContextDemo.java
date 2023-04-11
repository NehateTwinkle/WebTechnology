package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextDemo
 */
@WebServlet("/ContextDemo")
public class ContextDemo extends HttpServlet {
	
	ServletContext context=null;
	private static final long serialVersionUID = 1L;
    
    public ContextDemo() {
    	
    }
   
    public void init(ServletConfig config)throws ServletException
	{
		context=config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=context.getInitParameter("user");
		String pass=context.getInitParameter("pass");
		out.println("<h1>name="+user);
		out.println("<h1> password="+pass);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
