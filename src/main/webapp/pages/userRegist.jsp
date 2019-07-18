<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.3.3.7.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap-theme.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
<!-- boostraptable -->
<link href="${pageContext.request.contextPath}/css/bootstrap-table.css" rel="stylesheet">
</head>
<body>
<div class="modal show" id="loginModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close">&times;</button>
                    <h1 class="text-center text-primary">登录</h1>
                </div>
                <div class="modal-body">
                    <form class="form col-md-12 center-block" id="loginForm" action="main/successLogin.do" method="post">
                        <div class="form-group-lg"  id="accountDiv">
                            <label class="sr-only" for="inputAccount">账号</label>
                            <div class="input-group">
                                <div class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></div>
                                <input class="form-control" id="inputAccount" name="accountNo" type="text" placeholder="账号" required autofocus>
                            </div>
                            <div class="hidden text-center" id="accountMsg"><span class="glyphicon glyphicon-exclamation-sign"></span>用户名不存在</div>
                        </div>
                        <br>
                        <div class="form-group-lg" id="pwdDiv">
                            <label class="sr-only" for="inputPassword">密码</label>
                            <div class="input-group">
                                <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                                <input class="form-control" id="inputPassword" name="pwd" type="password" placeholder="密码" required>
                                <div class="input-group-addon"><span class="glyphicon glyphicon-eye-open"></span></div>
                            </div>
                            <div class="hidden text-center" id="pwdMsg"><span class="glyphicon glyphicon-exclamation-sign"></span>用户名密码错误</div>
                        </div>
                        <div class="checkbox">
                            <label> <input type="checkbox" value="remember-me">记住我</label>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-default btn-lg col-md-6" id="btn_register" type="submit">注册</button>
                            <button class="btn btn-primary btn-lg col-md-6" id="btn_login" type="button" >登录</button>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">

                </div>
            </div>
        </div>
    </div>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap3.3.7.min.js"></script>
<!-- boostraptable -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap-table.js"></script>
 <script src="${pageContext.request.contextPath}/js/login.js"></script>
</body>
</html>