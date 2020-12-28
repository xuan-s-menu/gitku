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
    <div class="admincheckuser">
        <div class="admincheckuser-liuyanyonghuid">用户XX留言</div>
        <div class="admincheckuser-liuyanuid">留言id</div>
    </div>
    <div class="admincheckuser-box"></div>
</div>
<c:forEach items="${articleList}" var="li">
<div class="admincheckuser">
    <div class="admincheckuser">
        <div class="admincheckuser-liuyanyonghuid">${li.userid}</div>
        <div class="admincheckuser-liuyanuid" id="liuyanid">${li.articleid}</div>
        <input type="submit" class="admincheckuser-liuyan-button" value="回复" onclick="answer()">
    </div>
    <div class="admincheckuser-box"></div>
</div>
</c:forEach>
<input type="button" onclick="window.location.href='adminindex.jsp'" class="admincheckuser-box2" value="回到首页">
<script type="text/javascript">
    function answer(){
        var verifyUrl = "./adminbeginanswer";
        var value=document.getElementById("liuyanid").value;
        var text=document.getElementById("liuyanid").innerText;
        var HTML=document.getElementById("liuyanid").innerHTML;
        console.log(value);
        console.log(text);
        console.log(HTML);

            $.ajax({
                type: 'post',
                url: verifyUrl,
                data: {id:text},
                datatype: 'json',
                success: function (data) {
                    window.location.href="adminanswer.jsp";
                    /* emp = emp=eval("("+data+")");//将JSON格式的字符串转成JSON
                     console.log("emp id为"+emp.id);
                     console.log("emp pass为"+emp.pass);
                     $.each(emp, function(i, result) {
                         console.log(result);
                     });*/
                }
            });
    }
</script>
</body>
</html>

