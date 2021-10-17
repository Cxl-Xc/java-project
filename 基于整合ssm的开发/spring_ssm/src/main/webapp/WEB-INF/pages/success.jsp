<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    //1、页面加载完成后需要调用的方法

    function test(){
        <jsp:forward page="${pageContext.request.contextPath}/account/login"></jsp:forward>
    }
    //2、使用这段代码即可实现
    window.onload=test;
</script>
<html>
<head>
    <title>Title</title>

</head>
<body>






</body>
</html>
