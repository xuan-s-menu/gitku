<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>银行管理系统</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="index-box">
  <div class="index-box1">
    <div class="index-box1-wenzi">银行卡有关业务</div>
    <input class="index-box1-button1" type="button" onclick="window.location.href='login.jsp'" value="注册卡片">
    <input class="index-box1-button1" type="button" οnclick="javascript:window.location.href=' URL'" value="注销卡片">
    <input class="index-box1-button1" type="button" οnclick="javascript:window.location.href=' URL'" value="查询卡片信息">
  </div>
  <div class="index-box1">
    <div class="index-box1-wenzi">流水处理有关业务</div>
    <input class="index-box1-button1" type="button" onclick="window.location.href='login.jsp'" value="银行卡存款">
    <input class="index-box1-button1" type="button" οnclick="javascript:window.location.href=' URL'" value="银行卡取款">
    <input class="index-box1-button1" type="button" οnclick="javascript:window.location.href=' URL'" value="银行卡转账">
  </div>
  <div class="index-box1">
    <div class="index-box1-wenzi">向客服留言</div>
    <input class="index-box1-button1" type="button" onclick="window.location.href='login.jsp'" value="留言入口">
  </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
