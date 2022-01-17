<%--
  Created by IntelliJ IDEA.
  User: RLRWZSRC
  Date: 2022/1/17
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/add/2/2" method="post">
    <input type="submit">
  </form>
  <form action="/add/a/b" method="get">
    <input type="text" name="a">
    <input type="text" name="b">
    <input type="submit">
  </form>
  <form action="/add?a=1&b=5" method="post">
    <input type="submit">
  </form>
  <form action="/Redirect">
    <input type="submit">
  </form>
  </body>
</html>
