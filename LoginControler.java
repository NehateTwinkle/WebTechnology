package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginControler")
public class LoginControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		  String password=request.getParameter("password");
		  if(username.equals(password))
		  {
			  request.setAttribute("username", username);
			  request.getRequestDispatcher("welcome.jsp").forward(request, response);
		  }
		  else
		  {
			  response.sendRedirect("error.jsp?error=Invalid username and password");
		  }
		
		
	}

}
