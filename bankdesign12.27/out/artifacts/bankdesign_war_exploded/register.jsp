<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎注册</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/base.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="register-box">
    <div class="register-box-yonghuwenzi">用户名:</div>
    <input class="register-box-yonghuinput" name="id" value="请输入账号">
    <div  class="register-box-passwordwenzi">密码:</div>
    <input id="password1" type="password" class="register-box-passwordinput" name="password" value="请输入密码">
    <div class="register-box-passwordwenzi2">再次输入密码:</div>
    <input id="password2" type="password" class="register-box-passwordinput2"  value="确认密码">
    <div class="register-box-phonewenzi">电话:</div>
    <input class="register-box-phoneinput" name="phone" value="请输入密码">
    <input type="submit" class="register-box-submit" value="注册">
    <%--<c:if test="${loginsuccess == false}">
        <a href="#1">登录失败，请重新登录</a>
    </c:if>--%>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

