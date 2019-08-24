<%--
  Created by IntelliJ IDEA.
  User: 006220
  Date: 2019/8/23
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form method="post" action="/user/addUser">
        姓名：<input type="text" name="username" value="admin" placeholder="姓名"><br />
        年龄：<input type="number" name="useage" value="12" placeholder="年龄"><br />
        <input type="submit" value="OKOK" />
    </form>
</body>
</html>
