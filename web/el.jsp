<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/11
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    req.username:${username}<br/>
    session.username:${sessionScope.username}<br/>
    username:${userInfo.username}<br/>
    password:${userInfo.password}<br/>
    ${list[0].username}<br/>
</body>
</html>
