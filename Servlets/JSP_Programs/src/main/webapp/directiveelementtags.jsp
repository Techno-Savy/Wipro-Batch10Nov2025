<%@ page language="java" contentType="text/html; charset=UTF-8"
   import ="java.util.Date"  pageEncoding="UTF-8" session="true" isErrorPage = "true" errorPage="ExceptionHandling.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3> Accessing Directive Imported class</h3>
Current Date : <%= new Date() %>
<br>
<jsp:include page="display.jsp">
<jsp:param name="value1" value="Admin" />
<jsp:param name="value2" value="Role" />
</jsp:include>

</body>
</html>