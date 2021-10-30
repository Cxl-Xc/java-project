<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>
<html>
<head>
    <title>
        用户信息页面
    </title>

</head>
<body bgcolor="#e3e3e3">
<center>
    <form action="check.jsp" method="post">
        <table border="1" bgcolor="#7fffd4">
            <caption>用户信息页面</caption>

            <tr>

                <td>ID</td>

                <td>UserName</td>

                <td>RealName</td>

                <td>Password</td>

                <td>Sex</td>

                <td>Operation</td>

            </tr>

            <c:forEach items="${requestScope.user}" var="user">

            <tr class="row1">

                <td>${user.id}</td>

                <td>${user.username}</td>

                <td>${user.realname}</td>

                <td>${user.password}</td>

                <td>${user.sex}</td>

                <td>
                    <a href="${pageContext.request.contextPath}/deleteByUserId?id=${user.id}" >delete user</a>
                    <a href="${pageContext.request.contextPath}/findOne?id=${user.id}">update user</a>
                </td>

            </tr>

            </c:forEach>

            <tr>
            <td>

                <a href="addUser.jsp">新增</a>

            </td>
            </tr>
        </table>


    </form>

</body>
</center>
</html>
