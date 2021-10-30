
<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>添加用户页面</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script language="javascript">
        function isValid(form)
        {
            if (form.username.value=="")
            {
                alert("用户名不能为空");
                return false;
            }

            else  if (form.password.value=="")
            {
                alert("用户密码不能为空！");
                return false;
            }
            else return true;
        }
    </script>
</head>

<body>
<center>
    <body bgcolor="#e3e3e3">
    <h2>添加用户页面</h2>
    <form action="${pageContext.request.contextPath}/userSave" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username" size="20"/></td>
            </tr>
            <tr>
                <td>真实姓名:</td>
                <td><input type="text" name="realname" size="20"/></td>
            </tr>
            <tr>
                <td>输入密码:</td>
                <td><input type="password" name="password" size="20"/></td>
            </tr>

            <tr>
                <td>性别:</td>
                <td>
                <input type="radio" class="inputgri" name="sex"  value="男" checked="checked">男
                <input type="radio" class="inputgri" name="sex"  value="女">女
                </td>
            </tr>

            <tr><td><input type="submit" value="注册"/>
        </table>
    </form>
</center>
<br>
</body>
</html>

