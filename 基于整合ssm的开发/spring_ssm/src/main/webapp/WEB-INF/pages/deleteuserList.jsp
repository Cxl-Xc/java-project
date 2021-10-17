<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

    <h1>请修改账户数据列表 并点击保存</h1>
    <table border="1">
        <tr>
            <th>账户id</th>
            <th>账户名称</th>
            <th>账户金额</th>
        </tr>
        <c:forEach items="${accountList}" var="account">
        <tr>

    <form name="accountForm" action="${pageContext.request.contextPath}/account/deleteById" method="post">
        <td>账户Id: <input type="text" name="id" value="${account.id}" readonly="readonly"></td>
        <td>账户名称:<input type="text" name="name" value="${account.name}" readonly="readonly"></td>
        <td>账户金额:<input type="text" name="money"value="${account.money}" readonly="readonly"></td>
        <td><input type="submit" value="删除"></td>
    </form>
        </tr>
        </c:forEach>
    </table>


</body>
</html>
