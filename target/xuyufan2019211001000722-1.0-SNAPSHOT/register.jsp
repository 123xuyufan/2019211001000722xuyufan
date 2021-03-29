<%--
  Created by IntelliJ IDEA.
  User: 0
  Date: 2021/3/14
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="register">
    Username : <input type="text" name="username" required/><br/>
    Password : <input type="password" name="password" required minlength="8"/><br/>
    Email : <input type="email" name="email" required/><br/>
    Gender: <input type="radio" name="gender" value="male">Male<input type="radio" name="gender" value="female">Female<br/>
    Date of Birth : <input type="text name=" name="birthDate"><br/>
    <input type="submit" value="Register"/><br/>
</form>


</body>
</html>
