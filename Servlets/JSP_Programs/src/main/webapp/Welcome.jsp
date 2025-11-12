<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p> Current Date & Time: <%= new java.util.Date() %>> </p>
<br>
<% 
String employeeName = request.getParameter("name");
if(employeeName == null || employeeName.trim().isEmpty()) 
response.sendRedirect("error.jsp");
%>
<h2>Welcome , <%= employeeName %> ! </h2>



</body>
</html>