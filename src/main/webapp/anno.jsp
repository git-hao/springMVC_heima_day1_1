<%--
  Created by IntelliJ IDEA.
  User: sakura
  Date: 2019/8/17
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="/anno/testRequestParam?name=miaoNeiGa">喵内请求参数注解</a>
    <hr>
    <form action="/anno/testRequestBody" method="post">
        喵内：<input type="text" name="name"/>
        喵：<input type="password" name="password"/>
        <input type="submit" name="噶"/>
    </form>
    <hr>
    <a href="/anno/testPathVariable/100">喵内restful传参，PathVariable</a>
    <hr>
    <a href="/anno/testRequestHeader">喵内获取RequestHeader</a>
    <hr>
    <a href="/anno/testCookieValue">喵内获取CookieValue</a>
    <hr>

    <h6>喵内测试ModelAttribute</h6>
    <form action="/anno/testModelAttribute" method="post">
        喵内名：<input type="text" name="uname"/>
        喵年龄：<input type="text" name="age"/>
        <input type="submit" name="噶"/>
    </form>
    <hr>
    <a href="/anno/testSessionAttributes">喵内testSessionAttributes</a>
    <br>
    <a href="/anno/getSessionAttributes">喵内getSessionAttributes</a>
    <br>
    <a href="/anno/deleteSessionAttributes">喵内deleteSessionAttributes</a>
    <hr>
</body>
</html>
