<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Display Page included:</h2>

UserId : <%= request.getParameter("value1") %>
Role Type : <%= request.getParameter("value2") %>
</body>
</html>