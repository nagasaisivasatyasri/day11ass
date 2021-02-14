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


<form action="./orderservlet" method="post">

enter mtype:<%=request.getParameter("mtype")%><br><input type="hidden" name="mtype" value="<%=request.getParameter("mtype")%>"><br>


enter mname:<%=request.getParameter("mname")%><br><input type="hidden" name="mname" value="<%=request.getParameter("mname")%>"><br>
enter quan:<%=request.getParameter("quan") %><br><input type="hidden" name="quan" value="<%=request.getParameter("quan") %>"><br>
<input type="submit"/>
</form>

</body>
</html>