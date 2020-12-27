<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <div class="login-box-yonghuwenzi">用户:</div>
    <input class="login-box-yonghuinput" name="id" value="请输入账号">
    <div class="login-box-passwordwenzi">密码:</div>
    <input class="login-box-passwordinput" name="password" value="请输入密码">
    <input type="submit" class="login-box-submit" value="登录">
    <%--<c:if test="${loginsuccess == false}">
        <a href="#1">登录失败，请重新登录</a>
    </c:if>--%>
</div>
</body>
</html>
