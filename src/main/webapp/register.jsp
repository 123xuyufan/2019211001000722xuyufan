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
<form method="post">
    Name : <input type="text" name="name" required><br/>
    PassWord : <input type="password" name="password" required minlength="8"><br/>
    email : <input type="email" name="email" required ><br/>
    birthdate : <input type="date" name="birthdate" required dataformatas="yyyy-mm-dd"><br/>
    <input type="submit" value="register">
</form>

</body>
</html>
