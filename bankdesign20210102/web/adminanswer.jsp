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
<div class="registercard2-box">
    <form action="adminanswer" method="post">
    <div class="registercard2-box-wenzi">用户留言:</div>
  <%--  <input class="registercard1-box-input" name="id" value="请输入管理员名字">--%>
    <div class="registercard2-box-liuyan"><textarea   rows="10" cols="30" disabled>${article.message}</textarea></div>
    <div class="registercard2-box-liuyan"><textarea  name="liuyan"  rows="10" cols="30" >回复</textarea></div>
    <input type="submit" class="registercard2-box-submit" value="留言">
    </form>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>