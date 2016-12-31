<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人信息系统---注册页面</title>
</head>
<body bgcolor="pink">
<center>
<h1>请填写以下注册信息</h1>
<hr>
<form action="/pims/register" method="post">
<table border="1" cellspacing="0" cellpadding="0">
  <tr>
    <td>用户昵称</td>
    <td><input type="text" name="username"></td>
  </tr>
  <tr>
    <td>用户密码</td>
    <td><input type="text" name="password1"></td>
  </tr>
  <tr>
    <td>确认密码</td>
    <td><input type="text" name="password2 "></td>
  </tr>
  <tr>
    <td>用户姓名</td>
    <td><input type="text" name="name"></td>
  </tr>
 
  <tr>
    <td>用户性别</td>
    <td><input type="radio" name="sex" value="男" checked>男<input type="radio" name="sex" value="女">女</td>
  </tr>
  <tr>
    <td>出生日期</td>
    <td><select name="year">
<option value="1978">1978
<option value="1979">1979
<option value="1980">1980
<option value="1981">1981
<option value="1982">1982
</select>年
<select name="month">
<option value="1">1
<option value="2">2
<option value="3">3
<option value="4">4
<option value="5">5
<option value="6">6
<option value="7">7
<option value="8">8
<option value="9">9
<option value="10">10
<option value="11">11
<option value="12">12
</select>月
<select name="day">
<option value="1">1
<option value="2">2
<option value="3">3
<option value="4">4
<option value="5">5
<option value="6">6
<option value="7">7
<option value="8">8
<option value="9">9
<option value="10">10
<option value="11">11
<option value="12">12
</select>日</td>
  </tr>
  <tr>
    <td>用户名族</td>
    <td><input type="radio" name="nation" value="汉族">汉族
<input type="radio" name="nation" value="回族">回族
<input type="radio" name="nation" value="壮族">壮族
<input type="radio" name="nation" value="其他">其他</td>
  </tr>
  <tr>
    <td>用户学历</td>
    <td><select name="edu">
<option value="博士">博士
<option value="硕士">硕士
<option value="本科">本科
<option value="专科">专科
<option value="高中">高中
<option value="初中">初中
<option value="小学">小学
<option value="其他">其他
</select>
   </td>
  </tr>
  <tr>
    <td>用户类型</td>
    <td><select name="works">
<option value="软件开发工程师">软件开发工程师
<option value="软件测试工程师">软件测试工程师
<option value="教师">教师
<option value="学生">学生
<option value="经理">经理
<option value="职员">职员
<option value="老板">老板
<option value="其他">其他
</select></td>
  </tr>
  <tr>
    <td>用户电话</td>
    <td><input type="text" name="phone" /></td>
  </tr>
  <tr>
    <td>家庭住址</td>
    <td><select name="place">
<option value="北京">北京
<option value="河南">河南
<option value="河北">河北
<option value="吉林">吉林
<option value="青海">青海
<option value="宁夏">宁夏
<option value="新疆">新疆
<option value="其他">其他
</select>省(直辖市)</td>
  </tr>
  <tr>
    <td>邮箱地址</td>
    <td><input type="text" name="emall" /></td>
  </tr>


  <tr>
    <td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="确定" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="清除" /></td>
    </tr>
</table>
</form>
</center>
</body>
</html>