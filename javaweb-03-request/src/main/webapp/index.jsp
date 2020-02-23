<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <form action="/login" method="post">
    账号：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    爱好：<br>
    <input type="checkbox" name="hobbies" value="java">java<br>
    <input type="checkbox" name="hobbies" value="C">C<br>
    <input type="checkbox" name="hobbies" value="Linux">Linux<br>
    <input type="submit">
  </form>
  </body>
</html>
