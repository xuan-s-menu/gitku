<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/base.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="login-box">
    <form action="./login" method="post">
    <div class="login-box-yonghuwenzi">用户:</div>
    <input class="login-box-yonghuinput" name="id" value="请输入账号">
    <div class="login-box-passwordwenzi">密码:</div>
    <input class="login-box-passwordinput" name="password" value="请输入密码">
    <input type="submit" class="login-box-submit" value="登录">
        <input type="button" class="login-box-submit2" onclick="window.location.href='register.jsp'" value="注册">
    <c:if test="${loginsuccess == false}">
        <a href="#1">账号或密码错误</a>
    </c:if>
    </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
