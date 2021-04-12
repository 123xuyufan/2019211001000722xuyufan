<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/3/14
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index.jsp">go to ecjtu</a><!-- method is GET-->
<form method="post"><!--what is method when we use form?--><!-- Its DET , why? default is GET, form date is added in the URL , U can see -->
<!-- Its better to POSt in form ,data in not added in the URL -->
    Name:<input type="text" name="name"><br/>
    ID:<input type="text" name="id"><br/>
    <input type="submit" value="Send date to server"/>
</form>

</body>
</html>
<%@include file="header.jsp"%>
This is my JSP page.<br>
<%@include file="footer.jsp"%>
