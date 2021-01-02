<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>欢迎使用管理员系统</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/admin.css">
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
</head>
<body>
<jsp:include page="adminhearer.jsp"></jsp:include>
<div class="admincheckuser">
    <div class="admincheckuser-id">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;卡片id</div>
    <div class="admincheckuser-name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;卡片名字</div>
    <div class="admincheckuser-password">卡片余额</div>
    <div class="admincheckuser-phone">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;绑定的用户id</div>
    <div class="admincheckuser-button"></div>
</div>
<div class="admincheckuser-box"></div>
<c:forEach items="${cardlist}" var="li">
<div class="admincheckuser">
    <div class="admincheckuser-id" id="id">${li.cardid}</div>
    <div class="admincheckuser-name">${li.cardname}</div>
    <div class="admincheckuser-password">${li.cardmoney}</div>
    <div class="admincheckuser-phone">${li.userid}</div>
    <input type="submit" class="admincheckuser-button" value="删除" onclick="deletecard()">
</div>
<div class="admincheckuser-box"></div>
</c:forEach>
<input type="button" onclick="window.location.href='adminindex.jsp'" class="admincheckuser-box2" value="回到首页">
<script>
    function  deletecard() {
        var  id=document.getElementById("id").innerText;
        var verifyUrl="./deletecard";
        console.log(id);
        $.ajax({
            type: 'post',
            url: verifyUrl,
            data: {id:id},
            datatype: 'json',
            success: function (data) {
                window.location.href="admincheckcard.jsp";
            }
        });

    }
</script>
</body>
</html>
