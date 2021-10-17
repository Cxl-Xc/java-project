<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>


    <h1>根据Id查询数据</h1>
    <form name="accountForm" action="${pageContext.request.contextPath}/account/findById" method="post">

        账户Id:<input type="text" name="id"><br>

        <input type="submit" value="查询"><br>

    </form>



</body>
</html>
