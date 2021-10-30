<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>
<html>
<head>
    <title>
        用户登录
    </title>
</head>
<body bgcolor="#e3e3e3">
<center>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <table>
            <caption>Login</caption>
            <tr><td>username:</td><td><input type="text" class="inputgri" name="username" size="20"/></td></tr>
            <tr><td>password:</td><td><input type="password" class="inputgri" name="password" size="20"/></td></tr>
            <tr><td><input type="submit" value="Submit>>"/>
        </table>
    </form>
    如果您还没有注册，请单击<a href="regist.jsp">这里</a>注册！
</body>
</center>
</html>
