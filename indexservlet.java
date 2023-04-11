package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/indexservlet")
public class indexservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public indexservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost(request, response);
        response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int no1=Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
       out.println("Addition is : "+(no1+no2));
       out.println("Substraction is : "+(no1-no2));
       out.println("Multiplication is : "+(no1*no2));
       out.println("Division is : "+(no1/no2));
       out.println("Mode is : "+(no1%no2));
//       out.println("Addition is : "+(no1+no2));









	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String firstname=request.getParameter("fname");
		out.println("<h1>First Name is : "+firstname);
		String lastname=request.getParameter("lname");
		out.println("<h1> Last Name is : "+lastname);
		long Number=Long.parseLong(request.getParameter("number"));
		out.println("<h1> Mobile Number is : "+Number);
		String Email=request.getParameter("Email");
		out.println("<h1> Email is : "+Email);
		String password=request.getParameter("password");
		out.println("<h1> Password is : "+password);
		String confirmpassword=request.getParameter("confirmpassword");
		out.println("<h1> Confi_password is : "+confirmpassword);
		String Gender=request.getParameter("Gender");
		out.println("<h1> Gender is : "+Gender);
		String Hobbies=request.getParameter("hobby");
		out.println("<h1> Hobbies are : "+Hobbies);
//		
//		int no1=Integer.parseInt(request.getParameter("no1"));
//		int no2=Integer.parseInt(request.getParameter("no2"));
//		out.println("<h1> Addition is.. "+(no1+no2));
	
	}

}
