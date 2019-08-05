<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>挂号</title>
<%@ include file="/common/commoncss.jsp" %>
<%@ include file="/common/commonjs.jsp" %>
</head>
<body>


<div id="toolbar" style="float: left;width: 100%;">
        <button id="btn_add" type="submit" class="btn btn-default">
           <span class="glyphicon glyphicon-plus" style="color: rgb(0, 0, 0); font-size: 16px;margin-top: -5px;">&nbsp;添加</span>
        </button>
</div>


<table id="table">

</table>

<script type="text/javascript">
  $(function(){
	  $('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/registrationorder/queryRegistrationorder.action',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  toolbar:"#toolbar",
		  pageSize:3,//每页显示3条数据
		  pageList:[2,3,5,8,10],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  {
		    field: 'registerid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    title: '挂号编号'
		  },{
			    field: 'patient.name',
			    align: 'center',
			    valign:'middle',
			    title: '病人姓名'
		  },{
		    field: 'registrationdate',
		    align: 'center',
		    valign:'middle',
		    title: '挂号日期'
		  }, {
			    field: 'registeredfee',
			    align: 'center',
			    valign:'middle',
			    title: '挂号费用'
		  }, {
			    field: 'department.departmentname',
			    align: 'center',
			    valign:'middle',
			    title: '挂号科室'
		  },{
			    field: 'user.username',
			    align: 'center',
			    valign:'middle',
			    title: '主治医师'
		  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.registerid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					 // var authorityButton = "<button  onclick=\"myAuthorityClick("+row.postnumber+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.registerid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }]
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
					$("#myUpdateDepartment").html(optionhtml);
				}
				 
			}
		})
		
		
		//医生下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/user/getUser.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				
				//alert("成功了！");
				
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].userid+'">'+data[i].username+'</option>';
						
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					//$("#myUpdatePosition").html(optionhtml);
					
					$("#myAddUser").html(optionhtml);
					$("#myUpdateUser").html(optionhtml);
					
				}
				 
			}
		})
		
		
		//病人下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/patient/queryPatient.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				
				//alert("成功了！");
				
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].patientid+'">'+data[i].name+'</option>';
						
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					//$("#myUpdatePosition").html(optionhtml);
					
					$("#myAddPatient").html(optionhtml);
				}
				 
			}
		})
		
		
		
		
  })
  
  

  /* 做加删除啦  */
function myDeleteClick(id) {
	
	var registerId = id;
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/registrationorder/deleteById.action",//根据编号查询用户的信息
		 data:{registerId:registerId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  //alert("删除成功了");
			  $("#table").bootstrapTable("refresh");  
			}
	})
}
  
  
  
  
  
  /* 修改  预先查询挂号信息显示于页面  */
function myUpdateClick(registerid){
	  
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/registrationorder/getById.action",//根据编号查询用户的信息
		 data:{rid:registerid},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	 
			    	 //输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdateRegisterId").val(data.registerid);
			    	 
			    	 $("#registrationdate1").val(data.registrationdate);
			    	
			    	 $("#inputregisteredfee").val(data.registeredfee);
			    	
			    	 
			    	 //给下拉列表赋初始值
			    	 $("#myUpdateDepartment").val(data.registrationdepartment);
			    	 $("#myUpdateUser").val(data.registeredpersonid);
			    	 
			    
			     })
		 }
	})
}
  
  
//修改事件
  function updateRegistrationorder(){
  	
  	//获取表单中的所有值
  	var data = $("#myUpdateForm").serializeArray();
  	
  	$.ajax({
  		type:'post',//提交方式
  		url:'${pageContext.request.contextPath}/registrationorder/saveUpdateRegistrationorder.action',//修改的地址
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
  
  
  
  function addRegistrationorder(){
	  
	  var data = $("#myAddForm").serializeArray();
    
	  	$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/registrationorder/addRegistrationorder.action',//修改的地址
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
  
</script>
 
 
 
 
 
 <!-- 添加模态框（Modal） -->

<div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加挂号</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					 
					  
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">病人姓名:</label>
					    <div class="col-sm-7">
					     <select id="myAddPatient" class="form-control" name="patientid">
					       		<option value="">请选择</option>
					       </select>
					       
					       </div>
					  </div>
					    
					    
					       <div class="form-group">
					    <label class="col-sm-2 control-label">挂号日期:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="registrationdate" id="registrationdate" placeholder="(非必填项)">
					    <label id="registrationdate-error" class="error" for="registrationdate" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#registrationdate' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div>
					  
					  
					    <div class="form-group">
					    <label class="col-sm-2 control-label">挂号费用:</label>
					    <div class="col-sm-7">
					      <input type="text" class="form-control" name="registeredfee" id="registeredfee" placeholder="(必填项)">
					      <label id="registeredfee-error" class="error" for="registeredfee" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					  
					  
					    <div class="form-group">
					    <label  class="col-sm-2 control-label">挂号科室:</label>
					    <div class="col-sm-7">
					       <select id="myAddDepartment" class="form-control" name="registrationdepartment">
					       		<option value="">请选择</option>
					       </select>
					    </div>
					  </div>
					  
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">主治医师:</label>
					    <div class="col-sm-7">
					      <select id="myAddUser" class="form-control" name="registeredpersonid">
					       		<option value="">请选择</option>
					       </select>
					    </div>
					  </div>
					 
					   <div class="form-group">
					    <label class="col-sm-2 control-label"></label>
					    <div class="col-sm-7">
					       
					       
					       <input type="hidden" class="form-control" name="physicianincharge" id="physicianincharge" value="1">
					      <label id="physicianincharge-error" class="error" for="physicianincharge" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    
					    </div>
					  </div>
					  
				
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addRegistrationorder()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>
  
  
  
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
                      <!-- 隐藏框传registerid的值 -->
                      <input type="hidden" name="registerid" id="myUpdateRegisterId">
                      
					  
					  
					  
					     <div class="form-group">
					    <label class="col-sm-2 control-label">挂号日期:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="registrationdate" id="registrationdate1">
					    <label id="registrationdate-error1" class="error" for="registrationdate" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#registrationdate1' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div>
					  
					  
					 <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">挂号费用:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="registeredfee" class="form-control" id="inputregisteredfee" >
					    </div>
					  </div>
					  
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">挂号科室:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateDepartment" class="form-control" name="registrationdepartment">
					       			
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">主治医生:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateUser" class="form-control" name="registeredpersonid">
					       			
					       </select>
					    </div>
					  </div>
					  
					  
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateRegistrationorder()" type="button" class="btn btn-primary">修改</button>
            </div>
        </div>
    </div>
</div>


  
 
</body>
</html>