<%--
  Created by IntelliJ IDEA.
  User: 67636
  Date: 2022/4/14
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello world</h1>
<%--请求参数绑定--%>
<a href="controller/hello?user=hello&password=123">请求参数绑定</a>
<a href="controller/testRequestMapping">测试RequestMapping注解</a>
<a href="controller/request?user=admin&pass=123456">测试使用控制器的形参获取请求参数</a>
<%--&lt;%&ndash;请求参数绑定实体类&ndash;%&gt;--%>
<%--<form action="controller/login" method="post">--%>
<%--    账户:<input type="text" name="username">--%>
<%--    <br>--%>
<%--    密码:<input type="password" name="password">--%>
<%--    <br>--%>
<%--    余额：<input type="text" name="money.yue">--%>
<%--    <br>--%>
<%--    <input type="submit" name="登录">--%>
<%--</form>--%>
<%--请求参数绑定实体类中的集合--%>
<form action="controller/login" method="post">
    账户:<input type="text" name="username">
    <br>
    密码:<input type="password" name="password">
    <br>
    信用卡账户：<input type="text" name="list[0].mname">
    <br>
    信用卡余额：<input type="text" name="list[0].yue">
    <br>
    信用卡账户：<input type="text" name="map['one'].mname">
    <br>
    信用卡余额：<input type="text" name="map['one'].yue">
    <br>
    <input type="submit" name="登录">
</form>
<form action="controller/request" method="get">
    用户名:<input type="text" name="user">
    <br>
    密码:<input type="password" name="pass">
    <br>
    爱好:<input type="checkbox" name="hobby" value="a">a
    <input type="checkbox" name="hobby" value="b">b
    <input type="checkbox" name="hobby" value="c">c
    <br>
    <input type="submit" name="登录">
</form>
</body>
</html>
