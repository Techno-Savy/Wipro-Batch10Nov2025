<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">

<h1>EL Implicit Objects</h1>
<ol>
<li> pageScope
<li> requestScope
<li> sessionScope
<li>param
</ol>

<%
pageContext.setAttribute("CollegeName","Simplilearn");
session.setAttribute("PhoneNo", "53495853");
application.setAttribute("id", "101");
%>
FORM DATA ! You have filled
<hr color="red">

Student Name : ${param.name} <br><br>
Address : ${param.address} <br><br>
Course : ${param.course} <br><br>
Gender : ${param.gender } <br><br>
Age:	 ${param.age } <br><br>
Date : 		${param.birth}
Hobbies : ${paramValues.hobbies[0]},${paramValues.hobbies[1]}

<c:out value="JSTL is working!" />
<b>Hobbies:</b><br>
<!-- JSTL ForEach for multiple hobbies -->
<c:if test="${not empty paramValues.hobbies}">
    <ul>
        <c:forEach var="hobby" items="${paramValues.hobbies}">
            <li>${hobby}</li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty paramValues.hobbies}">
    No hobbies selected.
</c:if>

<hr color="blue">

Page Scope : ${pageScope.CollegeName} <br>
Session Scope : ${sessionScope.PhoneNo} <br>

<hr color="black">
 Host : ${header.host}<br>
 

</body>
</html>