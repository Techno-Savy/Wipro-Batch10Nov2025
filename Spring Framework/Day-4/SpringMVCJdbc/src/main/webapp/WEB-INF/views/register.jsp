<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Register User</title></head>
<body>
<h2>Register User</h2>
<form:form action="register" method="post" modelAttribute="user">
    Name: <form:input path="name"/><br/>
    Email: <form:input path="email"/><br/>
    <input type="submit" value="Register"/>
</form:form>

<c:if test="${not empty message}">
    <p style="color:green;">${message}</p>
</c:if>
</body>
</html>
