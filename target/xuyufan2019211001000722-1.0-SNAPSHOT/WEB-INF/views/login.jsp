<%--
  Created by IntelliJ IDEA.
  User: 11797
  Date: 2021/3/31
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<h1>Login</h1>
<%
    if(request.getAttribute("message")!=null){
        out.println(request.getAttribute("message"));
    }
%>
<%
    Cookie[] allCookies=request.getCookies();
    String username= "",password= "",rememberMeVale= "";
    if(allCookies!=null){
        for(Cookie c:allCookies){
            if(c.getName().equals("cUsername")){
                username=c.getValue();
            }
            if(c.getName().equals("cPassword")){
                password=c.getValue();
            }
            if(c.getName().equals("rememberMeVale")){
                rememberMeVale=c.getValue();
            }
        }
    }
%>
<form method="post" action="login">
    <table>
        <tr> <td>Username:</td> <td><input type="text" name="Username" value="<%=username%>" required><br/></td></tr>
        <tr> <td>password:</td> <td><input type="password" name="password" value="<%=password%>" required minlength="8"><br/></td></tr>
        <tr> <td></td><td><input type="checkbox" name="rememberMe" value="1" <%=rememberMeVale.equals("1") ?"checked":""%>checked/>RememberMe</td> </tr>
        <tr> <td></td><td><input type="submit" value="Login"/></td>  </tr>
    </table>
</form>
<%@include file="footer.jsp"%>
