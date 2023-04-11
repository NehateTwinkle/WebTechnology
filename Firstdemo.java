package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Firstdemo")
public class Firstdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Firstdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out=response.getWriter();
		out.print("<h1>hello twinkle");
		out.print("<br><b>bold tag</b>");
		out.print("<br><u>underline</u>");
		out.print("<br><del>delete line</del>");
		out.print("<br><hr>horizontal line</hr>");
		out.print("<br><i>Twinkle</i><br>");
		out.print("h<sub>2</sub>o<br>");
		out.print("2<sup>8</sup>");
		out.print("<br><img src=https://images.unsplash.com/photo-1566438480900-0609be27a4be?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8aW1hZ2V8ZW58MHx8MHx8&w=1000&q=80 height=500px,width=800px>" );
	    out.print("<br> <h1 style =\"background-color:green\">Background</h1>");
	    out.print("<br><h2 style=\"background-color:pink\">Information</h2>");
		out.print("<br><a href=\"https://in.linkedin.com/\">www.linkedin.com</a>");
		out.print("<br><a href=\"https://www.w3schools.com/\">www.w3school.com</a>");
		out.print("<table align=\"center\">"
				+ "<tr>"
				+ "<td>first name</td>"
				+"<td><input type=\"text\" name=\"fname\"></td>"
				+ "</tr>"
				
+ "<tr>"
+ "<td>last name</td>"
+"<td><input type=\"text\" name=\"lname\"></td>"
+ "</tr>"

+ "<tr>"
+ "<td>mobile</td>"
+"<td><input type=\"text\" name=\"mobile\"></td>"
+ "</tr>"

+ "<tr>"
+ "<td>password</td>"
+"<td><input type=\"password\" name=\"password\"></td>"
+ "</tr>"

+ "<tr>"
+ "<td>gender</td>"
+"<td><input type=\"radio\" name=\"gender\"value=\"male\">Male"
+ "<input type=\"radio\" name=\"gender\" value=\"female\">Female</td>"
+ "</tr>"
				
				
				+ "</table>");
		
	
	}

}
