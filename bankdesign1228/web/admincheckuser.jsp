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
    <div class="admincheckuser-id">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户id</div>
    <div class="admincheckuser-name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名字</div>
    <div class="admincheckuser-password">密码</div>
    <div class="admincheckuser-phone">电话</div>
    <div class="admincheckuser-button"></div>
</div>
<div class="admincheckuser-box"></div>
<c:forEach items="${userlist}" var="li">
    <div class="admincheckuser">
    <div class="admincheckuser-id" id="id">${li.userid}</div>
    <div class="admincheckuser-name">${li.username}</div>
    <div class="admincheckuser-password">${li.userpassword}</div>
    <div class="admincheckuser-phone">${li.userphone}</div>
        <input type="submit" class="admincheckuser-button" value="删除" onclick="deleteuser()">
    </div>
    <div class="admincheckuser-box"></div>
</c:forEach>
<input type="button" onclick="window.location.href='adminindex.jsp'" class="admincheckuser-box2" value="回到首页">
<script>
    function  deleteuser() {
        var  id=document.getElementById("id").innerText;
        var verifyUrl="./deleteuser";
        console.log(id);
        $.ajax({
            type: 'post',
            url: verifyUrl,
            data: {id:id},
            datatype: 'json',
            success: function (data) {
                window.location.href="admincheckuser.jsp";
            }
        });

    }
</script>
</body>
</html>
