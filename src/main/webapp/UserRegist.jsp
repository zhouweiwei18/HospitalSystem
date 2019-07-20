<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@ include file="common/commoncss.jsp"%>
<%@ include file="common/commonjs.jsp"%>
</head>


<body>
	<div >

		<form class="form-horizontal " role="form" >
			<div class="form-group has-success has-feedback">
				<label for="username" class="col-sm-2 control-label">username</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="username"
						placeholder="username" style="width: 400px">
				</div>
			</div>

			<div class="form-group has-success has-feedback">
				<label for="userpassword" class="col-sm-2 control-label">userpassword</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="userpassword"
						placeholder="userpassword" style="width: 400px">
				</div>
			</div>

			<div class="form-group has-success has-feedback">
				<label for="usersex" class="col-sm-2 control-label">usersex</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="usersex"
						placeholder="usersex" style="width: 400px">
				</div>
			</div>

			<div class="form-group has-success has-feedback">
				<label for="usercard" class="col-sm-2 control-label">usercard</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="usercard"
						placeholder="usercard" style="width: 400px">
				</div>
			</div>
			
			<div>		
				<div class="col-sm-10">
				<label   class="col-sm-2 control-label"></label>
				   <input type="button" value="确认"  class="btn" style="margin-left: 50px">
				   <input type="button" value="返回"  class="btn" style="margin-left: 200px" >
				</div>
			</div>
			
		

		</form>

	</div>




</body>
</html>