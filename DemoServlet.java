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
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	ServletConfig config=null;
	ServletContext context=null;
	private static final long serialVersionUID = 1L;
   
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	this.config=config;
	context=config.getServletContext();
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		out.println("<h1> username is"+username);
		out.println("<h1> password is"+password);
		
		
		String user=context.getInitParameter("user");
		String pass=context.getInitParameter("pass");
		out.println("<h1> username is"+user);
		out.println("<h1> password is"+pass);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
