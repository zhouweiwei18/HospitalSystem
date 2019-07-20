<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@ include file="/common/commoncss.jsp"%>
<%@ include file="/common/commonjs.jsp"%>
<link href="https://cdn.bootcss.com/bootstrap-validator/0.5.3/css/bootstrapValidator.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>

</head>
<body>


	<!-- 按钮触发模态框 -->
	<button class="btn btn-primary btn-lg" data-toggle="modal"
		data-target="#myModal">开始演示模态框</button>

	<div class="modal fade" id="myModal" role="dialog" aria-hidden="true">
		<div class="modal-dialog" role="regist">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h1 class="text-center text-primary">登录</h1>
				</div>
				<div class="modal-body">
					<div>
						<form class="form-horizontal" id="loginForm"
							 method="post">
							<div class="form-group">
								<label class="col-sm-2 control-label" for="username">username：</label>
								<div class="col-sm-8">
									<input class="form-control" id="username"  name="username" type="text"
										placeholder="username">
								</div>

							</div>
						
							<br>

							<div class="form-group">
								<label  class="col-sm-2 control-label" for="password">password:</label>
								<div class="col-sm-8">
									<input class="form-control" id="password" name="password" type="text"
										placeholder="password">
								</div>
							</div>
							
								<br>

							<div class="form-group">
								<label  class="col-sm-2 control-label" for="repassword">repassword:</label>
								<div class="col-sm-8">
									<input class="form-control" id="repassword" name="repassword" type="text"
										placeholder="repassword">
								</div>
							</div>
							
							<br>
							<div class="form-group">
								<label  class="col-sm-2 control-label" for="usersex">usersex:</label>
								<div class="col-sm-8">
									<input class="form-control" id="usersex" name="usersex" type="text"
										placeholder="usersex">
								</div>
							</div>
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button class="btn btn-default" onclick="userRegist()" id="submitbtn" type="submit">确认</button>
						</form>
					</div>
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>


<script type="text/javascript">


  function userRegist() {
	var usersex = $("#usersex").val();
	var password = $("#password").val();
	var username = $("#username").val();
	
	
	alert(username)
	
	$.ajax({//通过ajax传给一个servlet处理
	    type:"post", //请求方式
	    url:"${pageContext.request.contextPath}/user/userRegist.action", //请求路径
	    data:{
	    	"username":username,
	        "password":password,
	        "usersex":usersex
	    },
	    traditional: true,//加上这个就可以传数组
	    dataType : 'json', 
	    success:function(result){
	    }
    })  
}

</script>



</body>
</html>