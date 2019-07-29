<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/common/commoncss.jsp" %>
<%@ include file="/common/commonjs.jsp" %>
<!-- <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script> -->
<body>

<div id="toolbar" style="float: left;width: 100%;">
        <button id="btn_add" type="submit" class="btn btn-default">
           <span class="glyphicon glyphicon-plus" style="color: rgb(0, 0, 0); font-size: 16px;margin-top: -5px;">&nbsp;添加</span>
        </button>
</div>
<table id="table">

</table>

<script type="text/javascript">
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/user/getUser.action',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  toolbar: '#toolbar', //工具按钮用哪个容器
		  pageSize:5,//每页显示3条数据
		  pageList:[5,7],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  /* {
	            field : 'checked',
	            valign:'middle',
	            align: 'center',
	            width: '60px',
	            checkbox : true
	      }, */
		  {
		    field: 'SerialNumber',
		    title: '序号',
		    valign:'middle',
		    align: 'center',
		    formatter: function (value, row, index) {
		        return index+1;
		    }
		  },
		  {
		    field: 'userid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    visible: false,
		    title: '编号'
		  }, {
		    field: 'username',
		    align: 'center',
		    valign:'middle',
		    title: '用户名'
		  }, {
		    field: 'userphoto',
		    align: 'center',
		    valign:'middle',
		    title: '头像',
		    formatter:function(value,row,index){
		    	//value:值   row：行      index:索引  \  \"相当于'
		    	//var imageUrl = '<img onclick="myPhotoClick(2)" alt="" src="/imgeurl/'+row.userPhoto+'" width="50" height="50">';
		    	var imageUrl="<img class='img-rounded' onclick=\"myPhotoClick('/imgeurl/"+row.userphoto+"')\" alt=\"\" src=\"/imgeurl/"+row.userphoto+"\" width=\"50\" height=\"50\">";
		    	return imageUrl;
		    }
		  }, {
			    field: 'usersex',
			    align: 'center',
			    valign:'middle',
			    title: '性别'
		  }, {
			    field: 'birthday',
			    align: 'center',
			    valign:'middle',
			    title: '生日日期'
			  },{
				  field:'usercard',
				  align: 'center',
				  valign:'middle',
				  width: '60px',
				  title:'身份证'
			  },{
				  field:'position.postname',
				  align: 'center',
				  valign:'middle',
				  title:'岗位'
			  },{
				  field:'position.department.departmentname',
				  align: 'center',
				  valign:'middle',
				  title:'科室名称'
			  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }]
		})
		
		//下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/position/queryPosition.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdatePosition">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].postnumber+'">'+data[i].postname+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myUpdatePosition").html(optionhtml);
					
					$("#myAddPosition").html(optionhtml);
				}
			 	
			}
			
		})
		
		
		//科室下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/department/queryDepartment.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				
				//alert("成功了！");
				
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].departmentid+'">'+data[i].departmentname+'</option>';
						
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					//$("#myUpdatePosition").html(optionhtml);
					
					$("#myAddDepartment").html(optionhtml);
				}
				 
			}
		})
})

/* 做权限分配啦  */
function myAuthorityClick(id) {
	
	alert("做权限分配了");
}

/* 做加删除啦  */
function myDeleteClick(id) {
	
	var userId = id;
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/user/deleteById.action",//根据编号查询用户的信息
		 data:{userid:userId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  //alert("删除成功了");
			  $("#table").bootstrapTable("refresh");  
			}
	})
}


/* 图片放大 */
function myPhotoClick(photoValue){
		
	    $('#myModal').modal().on('shown.bs.modal',
	    function() {
	         $("#myDialogImage").attr("src",photoValue);
	    })
}

/* 修改  预先查询员工信息显示于页面  */
function myUpdateClick(userId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/user/getById.action",//根据编号查询用户的信息
		 data:{uid:userId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	 
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdateUserId").val(data.userid);
			    	 
			    	 $("#inputuserName").val(data.username);
			    	 $("#inputuserPwd").val(data.userpwd);
			    	 
			    	 //给隐藏框赋值（以便于传值到后台）
			    	 $("#photoImage").val(data.userphoto);
			    	 
			    	 //给图片控件赋值
			    	 $("#myUpdateImage").attr("src","/imgeurl/"+data.userphoto);
			    	 
			    	 //给下拉列表赋初始值
			    	 $("#myUpdatePosition").val(data.postid);
			     })
		 }
	})
}

//修改事件
function updateUser(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/user/saveUpdateUser.action',//修改的地址
		data:data,
		dataType:'json',
		success:function(data){
			if(data == 1){
				//关闭修改模态框
				$("#updateBtn").click();
				
				//刷新表格  线程等待一会儿
				setTimeout(function(){$("#table").bootstrapTable("refresh");}, 1000);
				 
			}else{
				//修改失败  提示信息
				alert("修改信息失败！");
			}
		}
		
	})
}


//添加事件
$("#btn_add").click(function () {
	//模态框清空内容
	 
	//alert("添加用户了");
	 $('#myAddModal').modal().on('shown.bs.modal', function() {
		 //alert("表单清空！");
		 $("#myAddForm")[0].reset();
		 $("#myAddImage").attr("src","");
		 ClearInput();
	  })
})

function ClearInput() {
     var validator = $("#myAddForm").validate({
          submitHandler: function (form) {
              form.submit();
          }
      });
      validator.resetForm();
}
 
function addUser() {
	$("#myAddForm").submit();
	//首先校验表单
}

$.validator.setDefaults({
    submitHandler: function() {
      alert("提交事件!");
      //下面使用ajax提交
      //获取表单中的所有值
  	  var data = $("#myAddForm").serializeArray();
      
  	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/user/addUser.action',//修改的地址
		data:data,
		dataType:'json',
		success:function(data){
			
			//点击关闭按纽，同时刷新页面数据
			$("#addBtn").click();
			
			//刷新表格  线程等待一会儿
			setTimeout(function(){$("#table").bootstrapTable("refresh");}, 1000);
			  
			alert("成功了");
			
		}
		
	})
      
      
      
    }
});

  
$.validator.addMethod("isIdCardNo", function(value, element) {
	return this.optional(element) || idCardNoUtil.checkIdCardNo(value);
}, "请正确输入您的身份证号码");

$(function() {
    $("#myAddForm").validate({
    	 rules: {
   	      username: {
   	        required: true,
   	        minlength: 2
   	      },
   	      userpwd: {
   	        required: true,
   	        minlength: 5
   	      },
   	      reuserpwd: {
   	        required: true,
   	        minlength: 5,
   	        equalTo: "#userpwd"
   	      },
   	      birthday: {
   	        required: false
   	      },
   	      usercard: {
   	        required: true,
   	        isIdCardNo:true
   	      }
   	    },
   	    messages: {
   	      username: {
   	        required: "请输入用户名",
   	        minlength: "用户名必需由两个字母组成"
   	      },
   	      userpwd: {
   	        required: "请输入密码",
   	        minlength: "密码长度不能小于 5 个字母"
   	      },
   	     reuserpwd: {
   	        required: "请输入密码",
   	        minlength: "密码长度不能小于 5 个字母",
   	        equalTo: "两次密码输入不一致"
   	      },
   	      usercard: {
   	    	required:"请填写身份证",
   	    	isIdCardNo:"请输入正确的身份证号"
   	      }
   	    }
    });
});
</script>  

<!-- 修改模态框（Modal） -->
<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <div class="modal-body">
            
                  <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传userid的值 -->
                      <input type="hidden" name="userid" id="myUpdateUserId">
                      
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">用户名:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="username" class="form-control" id="inputuserName" placeholder="请输入用户名">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="userpwd" id="inputuserPwd" placeholder="请输入密码">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">头像:</label>
					    <div class="col-sm-10">
					      <input name="userphoto" type="hidden" id="photoImage" value="" /> 
					      <img id="myUpdateImage" alt="" src="" class="img-thumbnail" width="100" height="100">
					      <input type="button" id="myPhotoButton" class="btn btn-info" value="选择头像" /></p>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">岗位名称:</label>
					    <div class="col-sm-10">
					       <select id="myUpdatePosition" class="form-control" name="postid">
					       			
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateUser()" type="button" class="btn btn-primary">修改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- 添加模态框（Modal） -->
<div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加用户</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">用户名:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="username" class="form-control" id="username" placeholder="(必填项)">
					      <label id="username-error" class="error" for="username" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
					    <div class="col-sm-7">
					      <input type="password" class="form-control" name="userpwd" id="userpwd" placeholder="(必填项)">
					      <label id="userpwd-error" class="error" for="userpwd" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">确认密码:</label>
					    <div class="col-sm-7">
					      <input type="password" class="form-control" name="reuserpwd" id="reuserpwd" placeholder="(必填项)">
					      <label id="reuserpwd-error" class="error" for="reuserpwd" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="sex" class="col-sm-2 control-label">性别:</label>
					    <div class="col-sm-7">
					       <select class="form-control" name="usersex">
					       		<option value="男">男</option>
					       		<option value="女">女</option>
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">出生日期:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="birthday" id="birthday" placeholder="(非必填项)">
					    <label id="birthday-error" class="error" for="birthday" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#birthday' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">身份证号:</label>
					    <div class="col-sm-7">
					      <input type="text" class="form-control" name="usercard" id="usercard" placeholder="(必填项)">
					      <label id="usercard-error" class="error" for="usercard" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					    
					  <div class="form-group">
					    <label class="col-sm-2 control-label">头像:</label>
					    <div class="col-sm-7">
					      <input name="userphoto" type="hidden" id="addPhotoImage" value="" /> 
					      <img id="myAddImage" alt="" src="" class="img-thumbnail" width="100" height="100">
					      <input type="button" id="addPhotoButton" class="btn btn-info" value="选择头像" /></p>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">岗位名称:</label>
					    <div class="col-sm-7">
					       <select id="myAddPosition" class="form-control" name="postid">
					       		<option value="">请选择</option>
					       </select>
					    </div>
					  </div>
					   
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-7">
					       <select id="myAddDepartment" class="form-control" name="position.departmentid">
					       		<option value="">请选择</option>
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addUser()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>

<!-- 修改或添加模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">我的头像</h4>
            </div>
            <div class="modal-body">
                <img id="myDialogImage" class="img-thumbnail" alt="" src="" width="600" height="600">
            </div>
           <!--  <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交更改</button>
            </div> -->
        </div>
    </div> 
</div>

<script type="text/javascript">
 $(function(){
	 
	 KindEditor.ready(function(K) {
			var editor = K.editor({
				allowFileManager : true
			});
			
			//这是添加
			K('#addPhotoButton').click(function() {
				editor.loadPlugin('image', function() {
					editor.plugin.imageDialog({
						imageUrl : K('#addPhotoImage').val(),//取值
						clickFn : function(url, title, width, height, border, align) {
							var startUrl='C://Users/Administrator/Desktop/image/';
							var newUrl = url.substr(startUrl.length);
							K('#addPhotoImage').val(newUrl);
							
							$("#myAddImage").attr("src","/imgeurl/"+newUrl);
							editor.hideDialog();
						}
					});
				});
			});
			
			
			//这是修改
			K('#myPhotoButton').click(function() {
				editor.loadPlugin('image', function() {
					editor.plugin.imageDialog({
						imageUrl : K('#photoImage').val(),//取值
						clickFn : function(url, title, width, height, border, align) {
							//alert(url);
							//C://Users/Administrator/Desktop/image/20190725/20190725161642_624.jpg
							var startUrl='C://Users/Administrator/Desktop/image/';
							var newUrl = url.substr(startUrl.length);
							K('#photoImage').val(newUrl);
							
							$("#myUpdateImage").attr("src","/imgeurl/"+newUrl);
							editor.hideDialog();
						}
					});
				});
			});
		})
 })
</script>

</body>
</html>