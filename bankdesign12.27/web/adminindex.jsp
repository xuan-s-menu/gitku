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
    <input type="button" class="adminindex-box1" value="查看用户信息">
    <input type="button" class="adminindex-box2" value="查看银行卡信息">
    <input type="button" class="adminindex-box3" value="查看流水信息">
    <input type="button" class="adminindex-box4" value="查看留言">
</div>
</body>
</html>
