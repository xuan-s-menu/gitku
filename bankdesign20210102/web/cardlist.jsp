<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎注册</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/list.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<c:forEach items="${cardlist}" var="li">
<div class="cardlist-box">
    <div class="cardlist-box-wenzi">卡id:${li.cardid}</div>
    <div class="cardlist-box-wenzi">卡名:${li.cardname}</div>
    <div class="cardlist-box-wenzi">余额:${li.cardmoney}</div>
</div>
<div class="cardlist-fenge"></div>
</c:forEach>
<div class="cardlist-fenge2" onclick="window.location.href='index.jsp'">点击返回首页</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

