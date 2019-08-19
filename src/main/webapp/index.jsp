<%--
  Created by IntelliJ IDEA.
  User: sakura
  Date: 2019/8/14
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>喵内入门</title>
</head>
<body>
    <h4>喵内程序</h4>
    <a href="/miao/hello">喵内</a>
    <hr>
    <a href="/miao/miaonei/hello?username=miaonei">喵内她大姨妈</a>
    <hr>
    <a href="/param/testParam?username=miaomiao&age=18">喵内传参数啦</a>
    <hr>
    <form action="/param/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br>
        密码：<input type="text" name="password"/><br>
        金额：<input type="text" name="money"/><br>
        用户名：<input type="text" name="user.uname"/><br>
        用户年龄：<input type="text" name="user.age"/><br>
        <button type="submit" value="提交">提交</button>
    </form>
    <hr>
    <form action="/param/saveList" method="post">

        用户名：<input type="text" name="list[0].uname"/><br>
        用户年龄：<input type="text" name="list[0].age"/><br>

        用户名：<input type="text" name="map['one'].uname"/><br>
        用户年龄：<input type="text" name="map['one'].age"/><br>
        <input type="submit" name="提交"/>
    </form>
    <hr>
    <form action="/param/saveUser" method="post">
        用户名：<input type="text" name="uname"/><br>
        年龄：<input type="text" name="age"/><br>
        日期：<input type="text" name="date"/><br>
        <input type="submit" name="提交"/>
    </form>
    <hr>
    <a href="/param/testServlet">喵内servletAPI</a>
</body>
</html>
