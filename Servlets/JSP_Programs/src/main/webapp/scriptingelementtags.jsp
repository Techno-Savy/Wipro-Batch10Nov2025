<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3> Scripting Elements</h3>


<h2> Scriptlet Tag</h2>
<%
int a =10;
int b = 30;
out.println("the value of a+b is :" + (a+b) + "<br>");
out.println("the value of a*b is :" + (a*b) + "<br>");
%>

<br>

<h2> Expression Tag</h2>

<% 
String s = "The value of string s is : as JSP"; 
%>

<%  out.print(s); %>
<br>
<%= s.toUpperCase() %>

<br>
<%= a+b %>


<br>
<h2> Declarative Tag</h2>
<%!
int val1 =60;
int val2 = 80;
int result=0;
%>
<% result = val1 + val2; 
out.println("The result is :" + result);
%>
</body>
</html>