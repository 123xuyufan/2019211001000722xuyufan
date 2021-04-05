<%@include file="header.jsp"%>
<h1>Login</h1>
<form method="post" action="/2019211001000722xuyufan1_war_exploded/login">
    <table>
        <tr> <td>Username:</td> <td><input type="text" name="username" required><br/></td></tr>
        <tr> <td>password:</td> <td><input type="password" name="password" required minlength="8"><br/></td></tr>
        <tr> <td></td><td><input type="submit" value="Login"/></td>  </tr>
    </table>
</form>
<%@include file="footer.jsp"%>
