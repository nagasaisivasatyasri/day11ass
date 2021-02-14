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

<form method="get" action="register_confirm.jsp">
enter username :<input type="text" name="uname"/><br>
enter password: <input type="password" name="pwd"/><br>
enter mobile number: <input type="number" name="mob"/><br>
enter country: <input type="text" name="country"/><br>
enter age:<input type="number" name="age"/><br>
<input type="submit"/>
</form>
</body>
</html>