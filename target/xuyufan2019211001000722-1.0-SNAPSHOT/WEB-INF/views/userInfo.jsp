<%@ page import="com.xuyufan.model.User" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/4/11
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<h1>User Info</h1>
<%
    User user=(User) request.setAttribute("user");
    %>
<table>
    <tr><td>Username:</td><td><%=user.getUsername()%></td></tr>
    <tr><td>Password:</td><td><%=user.getPassword()%></td></tr>
    <tr><td>email:</td><td><%=user.getEmail()%></td></tr>
    <tr><td>Gender:</td><td><%=user.getGander()%></td></tr>
    <tr><td>Birth Date:</td><td><%=user.getBirthDate()%></td></tr>
</table>
<%@include file="footer.jsp"%>
