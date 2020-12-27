<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>欢迎使用管理员系统</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/admin.css">
</head>
<body>
<jsp:include page="adminhearer.jsp"></jsp:include>
<div class="admincheckuser">
    <div class="admincheckuser-id">用户id</div>
    <div class="admincheckuser-name">用户名字</div>
    <div class="admincheckuser-password">用户密码</div>
    <div class="admincheckuser-phone">用户电话号码</div>
    <div class="admincheckuser-button">操作</div>
</div>
<div class="admincheckuser-box"></div>
<div class="admincheckuser">
    <div class="admincheckuser-id">用户id</div>
    <div class="admincheckuser-name">用户名字</div>
    <div class="admincheckuser-password">用户密码</div>
    <div class="admincheckuser-phone">用户电话号码</div>
    <input type="submit" class="admincheckuser-button" value="删除">
</div>
<div class="admincheckuser-box"></div>
<div class="admincheckuser">
    <div class="admincheckuser-id">用户id</div>
    <div class="admincheckuser-name">用户名字</div>
    <div class="admincheckuser-password">用户密码</div>
    <div class="admincheckuser-phone">用户电话号码</div>
    <input type="submit" class="admincheckuser-button" value="删除">
</div>
<div class="admincheckuser-box"></div>
<input type="button" onclick="window.location.href='adminindex.jsp'" class="admincheckuser-box2" value="回到首页">
</body>
</html>
