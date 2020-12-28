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
    <div class="admincheckuser-id">转账卡id</div>
    <div class="admincheckuser-name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;被转账卡id</div>
    <div class="admincheckuser-password">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;转账数量</div>
    <div class="admincheckuser-phone">&nbsp;&nbsp;时间</div>
    <div class="admincheckuser-button"></div>
</div>
<div class="admincheckuser-box"></div>
<c:forEach items="${msglist}" var="li">
<div class="admincheckuser">
    <div class="admincheckuser-id">${li.cardid1}</div>
    <div class="admincheckuser-name">${li.cardid2}</div>
    <div class="admincheckuser-password">${li.money}</div>
    <div class="admincheckuser-phone">${li.time}</div>
    <input type="submit" class="admincheckuser-button" value="删除">
</div>
<div class="admincheckuser-box"></div>
</c:forEach>
<input type="button" onclick="window.location.href='adminindex.jsp'" class="admincheckuser-box2" value="回到首页">
</body>
</html>
