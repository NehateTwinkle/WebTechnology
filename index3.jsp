<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a=10,b=20; %>
<%
 int z=100;
  out.println("<br>Sum is.."+(a+b));
%>
<br>
<%="Sum is.."+(a+b) %>
<br>
<%="Z is.."+z %>
<%=5+7+9+3-9 %>

</body>
</html>