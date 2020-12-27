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
    <div class="registercard1-box-wenzi">请输入留言的管理员名字:</div>
    <input class="registercard1-box-input" name="id" value="请输入管理员名字">
    <div class="registercard1-box-liuyan"><textarea  name="liuyan" rows="10" cols="30">给管理员留言2</textarea></div>
    <input type="submit" class="registercard1-box-submit" value="留言">
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>