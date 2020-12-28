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
    <form action="./moneymove" method="post">
    <div class="registercard1-box-wenzi">请输入转账卡的名字:</div>
    <input class="registercard1-box-input" name="id" value="请输入名字">
    <div class="registercard1-box-wenzi">请输入被转账卡的名字:</div>
    <input class="registercard1-box-input" name="id2" value="请输入名字">
    <div class="registercard1-box-wenzi">请输入转账的余额:</div>
    <input class="registercard1-box-input" name="money" value="请输入钱数">
    <input type="submit" class="registercard1-box-submit" value="开始转账">
    </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
