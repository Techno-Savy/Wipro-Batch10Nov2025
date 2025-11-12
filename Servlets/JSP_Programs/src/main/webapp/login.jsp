<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP </title>
</head>
<body>
<h2>Login Page</h2>
 <p> Current Date & Time: <%= new java.util.Date() %>> </p>

<%!
int a = 10;
int b =20;
%>


<%= a+b %> 



<center>
<form action="Welcome.jsp" method ="post">
Enter Employee name : <input type = text name="name">
<br>
<br>
Enter password : <input type = password name="txt2">
<br>
<br>
To add two numbers provide the values : 
<br>
<br>
Enter first no. : <input type = text name="txt3">
<br>
<br>
Enter second no. : <input type = password name="txt4">
<br>
<br>
<input type= submit>

</form>
</center>
</body>


</html>