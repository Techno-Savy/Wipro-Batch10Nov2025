<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>INDEX PAGE LOADED</h2>
<h1>Called by Home Controller</h1>
<h1> url /home</h1>

<%
	String name=(String)request.getAttribute("name");
String desig=(String)request.getAttribute("Designation");
%>

<h1> Name is  :  <%=name%> </h1>
<h1> Designation is  :  <%=desig%> </h1>
</body>
</html>
