<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <h1>请选择您的操作</h1>
<table>
    <tr><button onclick="window.location.href='${pageContext.request.contextPath}/account/login'"       >---查询所有账户信息---</button><br></tr>
    <tr><button onclick="window.location.href='${pageContext.request.contextPath}/account/saveuser'"    >------新增账户信息------</button><br></tr>
    <tr><button onclick="window.location.href='${pageContext.request.contextPath}/account/findByIduser'">---查询单个账户信息---</button><br></tr>
    <tr><button onclick="window.location.href='${pageContext.request.contextPath}/account/updateByIduser'">---更新所选账户信息---</button><br></tr>
    <tr><button onclick="window.location.href='${pageContext.request.contextPath}/account/deleteByIduser'">---删除所选账户信息---</button><br></tr>
</table>






</body>
</html>
