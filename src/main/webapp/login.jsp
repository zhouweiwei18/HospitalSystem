<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>苏微医院欢迎您</title>
<link href="${pageContext.request.contextPath}/plugin/css/login/login.css" rel="stylesheet">
<!-- jsp包含指令 -->
<%@ include file="common/commoncss.jsp" %>
<%@ include file="common/commonjs.jsp" %>
</head>
<body>
<div class="login">
    <div class="message">医院信息管理系统</div>
    <div id="darkbannerwrap"></div>
    
    <form method="post" action="${pageContext.request.contextPath}/login.action">
		<input name="action" value="login" type="hidden">
		<input name="userName" placeholder="用户名" required="" type="text">
		<hr class="hr15">
		<input name="userPwd" placeholder="密码" required="" type="password">
		<hr class="hr15">
		<img id="imgObj" alt="" src="${pageContext.request.contextPath}/kaptcha.action" title="看不清，点击刷新">
		<hr class="hr15">
		<input name="code" placeholder="验证码" required="" type="text">
		<hr class="hr15">
		<input value="登录" style="width:100%;" type="submit">
		<hr class="hr20">

	</form>
</div>
<script type="text/javascript">
   $(function(){//jquery加载事件  text()、attr()、val()、html()
	   $("#imgObj").click(function(){
		   $(this).attr("src","${pageContext.request.contextPath}/kaptcha.action");
	   })
   })
</script>
</body>
</html>