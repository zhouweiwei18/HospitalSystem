<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处方表</title>
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
		  url: '${pageContext.request.contextPath}/prescription/queryPrescription.action',//访问后台（json）的地址
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
			    field: 'doctoradvice.patient.name',
			    align: 'center',
			    valign:'middle',
			    title: '病人'
		  },{
		    field: 'drugs.drugsname',
		    align: 'center',
		    valign:'middle',
		    title: '药品名'
		  }, {
			    field: 'doctoradvice.doctoradvicecontent',
			    align: 'center',
			    valign:'middle',
			    title: '医嘱内容'
		  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.prescriptionid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					 // var authorityButton = "<button  onclick=\"myAuthorityClick("+row.postnumber+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.prescriptionid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }]
		})
		
		
		
			//医嘱下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/doctoradvice/queryDoctoradvice.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				
				//alert("成功了！");
				
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].doctoradviceid+'">'+data[i].doctoradvicecontent+'</option>';
						
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
				
					
					$("#myAddDoctoradvice").html(optionhtml);
					$("#myUpdateDoctoradvice").html(optionhtml);
				}
				 
			}
		})
		
		
		
		//药品下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/drugs/queryDrugs.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				
				//alert("成功了！");
				
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].drugsid+'">'+data[i].drugsname+'</option>';
						
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
				
					
					$("#myAddDrugs").html(optionhtml);
					$("#myUpdateDrugs").html(optionhtml);
				}
				 
			}
		})
		
		
  })
  
  
  
   //添加事件
$("#btn_add").click(function () {
	//模态框清空内容
	 
	//alert("添加用户了");
	 $('#myAddModal').modal().on('shown.bs.modal', function() {
		 //alert("表单清空！");
		 $("#myAddForm")[0].reset();
		
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
  
  
  
  function addPrescription(){
	  
	  var data = $("#myAddForm").serializeArray();
    
	  	$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/prescription/addPrescription.action',//修改的地址
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
                <h4 class="modal-title" id="myModalLabel">添加处方</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					
					    
					    
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">药品名:</label>
					    <div class="col-sm-7">
					       <select id="myAddDrugs" class="form-control" name="drugsid">
					       		<option value="">请选择</option>
					       </select>
					       </div>
					  </div>
					  
					  
					    <div class="form-group">
					    <label class="col-sm-2 control-label">医嘱:</label>
					    <div class="col-sm-7">
					      <select id="myAddDoctoradvice" class="form-control" name="doctoradviceid">
					       		<option value="">请选择</option>
					       </select>
					    </div>
					  </div>
					  
					    
				
				
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addPrescription()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>

 
 
 
</body>
</html>