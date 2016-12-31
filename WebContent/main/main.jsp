<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="com.pims.model.login" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人信息系统管理--主页面</title>
</head>
<frameset cols="200,*" framespacing="0">
     <frame src="../main/left.jsp" name="left" scrolling="no">
     <frameset rows="80,10%,*">
          <frame src="../main/top.jsp" name="top" scrolling="no">
          <frame src="../main/middle.jsp" name="toop" scrolling="no" >
          <frame src="../main/bottom.jsp" name="main">
     </frameset>
</frameset>
</html>