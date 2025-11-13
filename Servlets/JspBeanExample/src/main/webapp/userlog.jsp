<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="exception.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello Everyone  !  Pls find your details given :
<% 
String username = request.getParameter("u_name");
String password = request.getParameter("password");
out.print("Name :" + username + " Password: " + password);

String fnumber = request.getParameter("fno");
String snumber = request.getParameter("sno");

int var1  = Integer.parseInt(fnumber);
int var2  = Integer.parseInt(snumber);

int result = var1/var2;

out.print("Result is :" + result);
%>
</body>
</html>