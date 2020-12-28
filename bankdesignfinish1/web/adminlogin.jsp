<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/admin.css">
    <link rel="stylesheet" type="text/css" href="css/base.css">
</head>
<body>
<jsp:include page="adminhearer.jsp"></jsp:include>
<div class="login-box">
    <form action="./adminlogin" method="post">
    <div class="login-box-yonghuwenzi">管理员:</div>
    <input class="login-box-yonghuinput" name="id" value="请输入管理员名">
    <div class="login-box-passwordwenzi">密码:</div>
    <input class="login-box-passwordinput" name="password" value="请输入密码">
    <input type="submit" class="login-box-submit" value="登录">
     <c:if test="${adminlogin == false}">
        <a href="#1">账号或密码错误</a>
     </c:if>
    </form>
</div>
</body>
</html>
