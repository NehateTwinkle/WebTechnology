<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>abc</h1>
<h2>abc</h2>
<h3>abc</h3>
<h4>abc</h4>
<%-- <jsp:forward page="index5.jsp">
  <jsp:param value="twinkle" name="username"/>
  <jsp:param value="twinkle123" name="password"/>
</jsp:forward>
--%>

<jsp:include page="index5.jsp">
  <jsp:param value="twinkleee" name="username"/>
  <jsp:param value="twinkle12345" name="password"/>
</jsp:include>

</body>
</html>