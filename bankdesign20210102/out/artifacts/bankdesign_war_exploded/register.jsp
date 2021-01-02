<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎注册</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/base.css">
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="register-box">
    <div class="register-box-yonghuwenzi">用户名:</div>
    <input id="name" class="register-box-yonghuinput" name="id" value="请输入用户名">
    <div  class="register-box-passwordwenzi">密码:</div>
    <input id="password1" type="password" class="register-box-passwordinput" name="password" value="请输入密码">
    <div class="register-box-passwordwenzi2">再次输入密码:</div>
    <input id="password2" type="password" class="register-box-passwordinput2"  value="确认密码">
    <div class="register-box-phonewenzi">电话:</div>
    <input id="phone" class="register-box-phoneinput" name="phone" value="请输入电话">
    <input type="submit" class="register-box-submit" value="注册" onclick="check()">
    <%--<c:if test="${loginsuccess == false}">
        <a href="#1">登录失败，请重新登录</a>
    </c:if>--%>
</div>
<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript">
    function check(){
        var verifyUrl = "./register";
        var id=document.getElementById("name").value;
        var pass1=document.getElementById("password1").value;
        var pass2=document.getElementById("password2").value;
        var phone=document.getElementById("phone").value;
        console.log(id);
        console.log(pass1);
        console.log(pass2);
        console.log(phone);
        if(pass1===pass2)
        {
            $.ajax({
                type: 'post',
                url: verifyUrl,
                data: {id:id,password:pass1,phone:phone},
                datatype: 'json',
                success: function (data) {
                   /* emp = emp=eval("("+data+")");//将JSON格式的字符串转成JSON
                    console.log("emp id为"+emp.id);
                    console.log("emp pass为"+emp.pass);
                    $.each(emp, function(i, result) {
                        console.log(result);
                    });*/
                }
            });
        }
        else
        {
            alert("两次输入的密码不一致!");
        }
    }
</script>
</body>
</html>

