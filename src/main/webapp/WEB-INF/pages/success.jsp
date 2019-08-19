<%--
  Created by IntelliJ IDEA.
  User: sakura
  Date: 2019/8/14
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h4>喵内噶</h4>
    <%--测试testSessionAttributes方法--%>
    <%--${requestScope}
        ${requestScope.miao}
    --%>
    ${miao}
    <hr>
    <%--测试@SessionAttributes--%>
    ${sessionScope}
</body>
</html>
