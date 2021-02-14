<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String msg=request.getParameter("msg");
if(msg!=null)
{
%>
<%=msg%>
<%
}
%>
<form method="get" action="./LoginServlet">
username: <input type="text" name="uname"/><br>
password: <input type="password" name="pwd"/><br>
<input type="submit" name="submit"/>
Are you a new user<a href="register.jsp">Register</a><br>
</form>

</body>
</html>