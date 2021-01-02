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
<div class="registercard1-box">
    <form action="./cardadd" method="post">
    <div class="registercard1-box-wenzi">请输入你想要的卡的名字:</div>
    <input class="registercard1-box-input" name="id" value="请输入名字">
    <input type="submit" class="registercard1-box-submit" value="注册新卡">
    </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

