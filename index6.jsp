<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s1" class="com.model.Student"></jsp:useBean>
<jsp:setProperty property="sid" name="s1" value="123"/>
<jsp:setProperty property="snmae" name="s1" value="Rahul"/>
<jsp:setProperty property="city" name="s1" value="s.nagar"/>

<jsp:useBean id="s2" class="com.model.Student"></jsp:useBean>
<jsp:setProperty property="sid" name="s2" value="1234"/>
<jsp:setProperty property="snmae" name="s2" value="Rocky"/>
<jsp:setProperty property="city" name="s2" value="g.nagar"/>

<table border="1">
<tr>
<th>Sid</th>
<th>Sname</th>
<th>City</th>
</tr>
<tr>
<td><jsp:getProperty property="sid" name="s1"/></td>
<td><%=s1.getSname() %></td>
<td><%=s1.getCity() %></td>
</tr>
<tr>
<td><jsp:getProperty property="sid" name="s2"/></td>
<td><%=s2.getSname() %></td>
<td><%=s2.getCity() %></td>
</tr>

</table>

</body>
</html>