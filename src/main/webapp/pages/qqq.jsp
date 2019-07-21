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
					<h1 class="text-center text-primary">用户注册</h1>
				</div>
				<div class="modal-body">
					<div>
						<form class="form-horizontal" id="registeForm"
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
								<select id="usersex" name="usersex" class="form-control"  >
								<option style='display: none' ></option>
								 <option value="男">男</option>
								 <option value="女">女</option>
								</select>
									<!-- <input class="form-control" id="usersex" name="usersex" type="text"
										placeholder="usersex"> -->
								</div>
							</div>
							<br>
							<div class="form-group">
								<label  class="col-sm-2 control-label" for="usercard">usercard:</label>
								<div class="col-sm-8">
									<input class="form-control" id="usercard" name="usercard" type="text"
										placeholder="usercard">
								</div>
							</div>
								<br>
							<div class="form-group">
								<label  class="col-sm-2 control-label" for="birthday">birthday:</label>
								<div class="col-sm-8">
									<input class="form-control" id="birthday" name="birthday" type="text"
										placeholder="birthday">
								</div>
							</div>
						
							
							<button type="button" class="btn btn-default"
								data-dismiss="modal"  >关闭</button>
							<button class="btn btn-default" onclick="userRegist()" id="submitbtn" type="submit">确认</button>
						</form>
					</div>
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>


<script type="text/javascript">

$(document).ready(function() {
	
	   
    // Generate a simple captcha
    function randomNumber(min, max) {
        return Math.floor(Math.random() * (max - min + 1) + min);
    };
    $('#captchaOperation').html([randomNumber(1, 100), '+', randomNumber(1, 200), '='].join(' '));

    $('#registeForm').bootstrapValidator({
//        live: 'disabled',
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
           
            username: {
                message: 'The username is not valid',
                validators: {
                    notEmpty: {
                        message: 'The username is required and cannot be empty'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: 'The username must be more than 6 and less than 30 characters long'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_\.]+$/,
                        message: 'The username can only consist of alphabetical, number, dot and underscore'
                    },
                    different: {
                        field: 'password',
                        message: 'The username and password cannot be the same as each other'
                    }
                }
            },
            
            password: {
                validators: {
                    notEmpty: {
                        message: 'The password is required and cannot be empty'
                    },
                    identical: {
                        field: 'repassword',
                        message: 'The password and its confirm are not the same'
                    },
                    different: {
                        field: 'username',
                        message: 'The password cannot be the same as username'
                    }
                }
            },
            repassword: {
                validators: {
                    notEmpty: {
                        message: 'The confirm password is required and cannot be empty'
                    },
                    identical: {
                        field: 'password',
                        message: 'The password and its confirm are not the same'
                    },
                    different: {
                        field: 'username',
                        message: 'The password cannot be the same as username'
                    }
                }
            },
            usercard:{
            	validators:{
            		 notEmpty: {
                         message: 'The usercar is required'
                     },
                     callback: {
                         message: '身份证号码格式错误',
                         callback: function (value, validator) {
                             if (!value) {
                                 return true
                             } else if (isCardNo(value)) {
                                 return true;
                             } else {
                                 return false;
                             }
                         }
	
            	}
            	
            },
            birthday:{
            	validators:{
            		 notEmpty: {
                         message: 'The usercar is required'
                     },
                date: {
                    format: 'YYYY.MM.DD',
                    message: '日期无效'
                           }
            		
            	}
            	
            },
            
        //    
        }
        }
    
    });
    
    var bootstrapValidator = $('userLogin').data('bootstrapValidator');
    
    // 验证身份证号
    function isCardNo(card) {
        let reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if (reg.test(card) === false) {
            return false
        } else {
            return true
        }
    }

    // Validate the form manually
    $('#submitbtn').click(function() {
        $('#registeForm').bootstrapValidator('validate');
        
        var usersex = $("#usersex").val();
    	var password = $("#password").val();
    	var username = $("#username").val(); 
    	var usercard = $("#usercard").val(); 
    	var birthday = $("#birthday").val(); 
    	var code = $("#code").val(); 
    	
        $.ajax({//通过ajax传给一个servlet处理
    	    type:"post", //请求方式
    	    url:"${pageContext.request.contextPath}/user/userRegist.action", //请求路径
    	    data:{   	
    	    	"username":username,
    	        "userpwd":password,
    	        "usersex":usersex,
    	        "usercard":usercard,
    	        "birthday":birthday,
    	  
    	    },
    	 
    	    traditional: true,//加上这个就可以传数组
    	    dataType : 'json', 
    	    success:function(){
    	    	 
    	    	/* alert();
    	    	
    	    	var str = $("#registeForm").val();
    	    	alert(str); */
    	    	location.href="${pageContext.request.contextPath}/index.jsp";
    	    	 
    	    }
        }) 
    })	
  
});

   
   

</script>



</body>
</html>