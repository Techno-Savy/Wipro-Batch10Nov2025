<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Register User</title></head>
<body>
<h2>Register User</h2>
<form:form action="register" method="post" modelAttribute="user">
    Name: <form:input path="name"/><br/>
    Email: <form:input path="email"/><br/>
    <input type="submit" value="Register"/>
</form:form>
</body>
</html>
