<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="header.jsp"%>
<h2>welcome to My online shop Home page</h2>
<form method="get" target="_blank" action="Search">
    <input type="text" name="txt" size="30/">
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing">Bing</option>
        <option value="google">Google</option>
    </select>
    <input type="submit" value="Search"/>
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%@include file="footer.jsp"%>