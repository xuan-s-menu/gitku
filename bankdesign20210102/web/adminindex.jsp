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
<div class="adminindex">
    <input type="button" class="adminindex-box1" onclick="window.location.href='admincheckuser.jsp'" value="查看用户信息">
    <input type="button" class="adminindex-box2" onclick="window.location.href='admincheckcard.jsp'" value="查看银行卡信息">
    <input type="button" class="adminindex-box3" onclick="window.location.href='admincheckliu.jsp'" value="查看流水信息">
    <input type="button" class="adminindex-box4" onclick="window.location.href='admincheckliuyan.jsp'" value="查看留言">
</div>
</body>
</html>
