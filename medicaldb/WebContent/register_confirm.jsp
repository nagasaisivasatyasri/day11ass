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


<form action="./RegisterServlet" method="post">

enter username<%=request.getParameter("uname")%><br><input type="hidden" name="uname" value="<%=request.getParameter("uname")%>"><br>
enter password:<%=request.getParameter("pwd")%><br><input type="hidden" name="pwd" value="<%=request.getParameter("pwd")%>"><br>

enter mobile:<%=request.getParameter("mob")%><br><input type="hidden" name="mob" value="<%=request.getParameter("mob")%>"><br>


enter country:<%=request.getParameter("country")%><br><input type="hidden" name="country" value="<%=request.getParameter("country")%>"><br>
enter age:<%=request.getParameter("age") %><br><input type="hidden" name="age" value="<%=request.getParameter("age") %>"><br>
<input type="submit"/>
</form>
</body>
</html>