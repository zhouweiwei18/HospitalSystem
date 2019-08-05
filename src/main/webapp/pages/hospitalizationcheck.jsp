<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/queryPatientUserCheck.action',//访问后台（json）的地址
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
		  {
		    field: 'hospitalizationcheckno',
		    title: '住院检验序号',
		    valign:'middle',
		    align: 'center',
		  },{
			   field: 'hospitalizationadvice.inpatient.patient.name',
			   align: 'center',
			   valign:'middle',
			   title: '住院病人'
	      },{
		    field: 'user.username',
		    align: 'center',
		    valign:'middle',
		    title: '检验医师'
		  },{
		    field: 'checkproject.checkcontent',
		    align: 'center',
		    valign:'middle',
		    title: '检验项目名称'
		  },{
			   field: 'inspectiondate',
			   align: 'center',
			   valign:'middle',
			   title: '检验日期'
		  },{
			   field: 'inspectionresult',
			   align: 'center',
			   valign:'middle',
			   title: '检验结果'
          },{
			  title:'操作',
			  align: 'center',
			  valign:'middle',
			  formatter:function(value,row,index){
				  var updateButton = "<button  onclick=\"myUpdateClick("+row.hospitalizationcheckno+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";	
				  var deleteButton = "<button onclick=\"myDeleteClick("+row.hospitalizationcheckno+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
				  return updateButton+deleteButton;
			  }
		  }]
	})
	
	//下拉列表动态读取数据
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/user/getUser.action',//访问后台的地址   查询所有的医师信息
		async:false,//  true：异步     false:同步
		dataType: "json",//数据类型
		success: function(data){
	
			if(data != null){
				var optionhtml = '';//定义一个字符串变量	
				for(var i=0;i<data.length;i++){			
					optionhtml +='<option value="'+data[i].userid+'">'+data[i].username+'</option>';			
				}		
				$("#myAddUser").html(optionhtml);
			} 
		}
	})
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/queryPatient.action',//访问后台的地址   查询所有的病人信息
		async:false,//  true：异步     false:同步
		dataType: "json",//数据类型
		success: function(data){
	
			if(data != null){
				var optionhtml = '';//定义一个字符串变量	
				for(var i=0;i<data.length;i++){			
					optionhtml +='<option value="'+data[i].patientid+'">'+data[i].name+'</option>';			
				}		
				$("#myAddPatient").html(optionhtml);
			} 
		}
	})
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/queryCheckproject.action',//访问后台的地址   查询所有的医师信息
		async:false,//  true：异步     false:同步
		dataType: "json",//数据类型
		success: function(data){
	
			if(data != null){
				var optionhtml = '';//定义一个字符串变量	
				for(var i=0;i<data.length;i++){			
					optionhtml +='<option value="'+data[i].heckprojectno+'">'+data[i].checkcontent+'</option>';			
				}		
				$("#myUpdateProject").html(optionhtml);	
				$("#myAddProject").html(optionhtml);
			} 
		}
	})
})


//添加事件
  $("#btn_add").click(function () {
  	//模态框清空内容
  	 alert("123");
  
  	 $('#myAddModal').modal().on('shown.bs.modal', function() {
  		 
  		 //alert("表单清空！");
  		 $("#myAddForm").reset();
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
   
  function addHospitalizationcheck() {
      
    	  var data = $("#myAddForm").serializeArray();
        
    	$.ajax({
  		type:'post',//提交方式
  		url:'${pageContext.request.contextPath}/addHospitalizationcheck.action',//修改的地址
  		data:data,
  		dataType:'json',
  		success:function(data){
  			alert("添加完成");
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
                <h4 class="modal-title" id="myModalLabel">添加</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal">
                  
                        <div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">病人:</label>
						    <div class="col-sm-10">
						       <select id="myAddPatient" name="patientid">
						            <option value="">请选择</option>
						       </select>
						    </div>
						  </div>  
						<div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">检验医师:</label>
						    <div class="col-sm-10">
						       <select id="myAddUser" name="userid">
						            <option value="">请选择</option>
						       </select>
						    </div>
						  </div>
						<div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">检验项目:</label>
						    <div class="col-sm-10">
						       <select id="myAddProject" name="checkprojectno">
						            <option value="">请选择</option>
						       </select>
						    </div>
						  </div>
					    <div class="form-group">
					    <label class="col-sm-2 control-label">检验日期:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="inspectiondate" class="form-control" id="inspectiondate" placeholder="请输入检验日期">
					      <label id="bednumber-error" class="error" for="inspectiondate" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					   <div class="form-group">
					    <label class="col-sm-2 control-label">检查结果:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="inspectionresult" class="form-control" id="inspectionresult" placeholder="请输入检查结果">
					      <label id="bednumber-error" class="error" for="inspectionresult" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					   </div>					 				 
					  </div>
					</form>
					 <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" id="addBtn">关闭</button>
                <button onclick="addHospitalizationcheck()" type="button" class="btn btn-primary">添加</button>
            </div>
            </div>
           
        </div>
    </div>
</div>
</body>
</html>