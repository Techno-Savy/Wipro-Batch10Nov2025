<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)request.getAttribute("name");
Integer rollno=(Integer)request.getAttribute("RollNo");
%>

<h1> ${name} </h1>
<h1> ${RollNo} </h1>

<c:forEach var="items" items="${marks}">
<h1><c:out value="${items}"></c:out></h1>

</c:forEach>
</body>
</html>