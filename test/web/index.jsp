<%--
  Created by IntelliJ IDEA.
  User: 王格格
  Date: 2020/6/16
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>mm</title>
  </head>
  <body>
    <form action="tt" method="get">
      姓名：<input type="text" name="username"><br>
      密码：<input type="text" name="pwd"><br>
      <input type="submit" value="注册">
    </form><br><br>---------------------------------------------------------------------------<br><br>

    <form action="dd" method="get">
        要删除的姓名：<input type="text" name="username1"><br>
        <input type="submit" value="删除">
    </form><br><br>---------------------------------------------------------------------------<br><br>

    <hr color="red">
    <form action="demo2" method="get">
      姓名：<input type="text" name="username1"><br>
      密码：<input type="text" name="pwd1"><br>
      性别：<input type="radio" name="sex" value="男">男
           <input type="radio" name="sex" value="女">女
      <br>
      爱好：<input type="checkbox" name="hobby" value="lol">lol
           <input type="checkbox" name="hobby" value="swim">swim
           <input type="checkbox" name="hobby" value="sing">sing
      <br>
       地址：<select name="address">
              <option>北京</option>
              <option>南京</option>
              <option value="1001">上海</option>
            </select>
      <br>
      <input type="submit" value="注册">
    </form><br><br>---------------------------------------------------------------------------<br><br>
  </body>
</html>
