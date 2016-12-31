<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欢迎访问个人信息系统</title>
<link href="CSS/CSS.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body bgcolor="pink">
<div id="content-top"><p>个人信息管理系统<p/></div>
<div id="content">
<div id="c-top">管理员登录</div>

<div id="c-c">
<form action="/pims/login" method="post">
<STRONG>用　户名:</STRONG><input type="text" name="username" size="21"><br><br>
<STRONG>密　　码:</STRONG><input type="password" name="password1" size="22"><br><br>
<input type="submit" value="提交" class="btn btn-warning">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="清除" class="btn btn-warning">
</form>
<hr>
<font size="4"><a href="register.jsp">注册</a></font><br><br>
<h3>温馨提示:如果你还没有注册，请点击“注册”按钮，如果你已有账号，请登录.....</h3>
</div>
版权作者：君陌离
</div>
</body>
</html>