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
		  url: '${pageContext.request.contextPath}/querypatientdrugs.action',//访问后台（json）的地址
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
		    field: 'prescriptionno',
		    title: '住院处方id',
		    valign:'middle',
		    align: 'center',
		  },{
			   field: 'hospitalizationadvice.inpatient.patient.name',
			   align: 'center',
			   valign:'middle',
			   title: '病人'
	      },{
		    field: 'drugs.drugsname',
		    align: 'center',
		    valign:'middle',
		    title: '药品名称'
		  },{
		    field: 'drugno',
		    align: 'center',
		    valign:'middle',
		    title: '药品数量/盒'
		  },{
			  title:'操作',
			  align: 'center',
			  valign:'middle',
			  formatter:function(value,row,index){
				  var updateButton = "<button  onclick=\"myUpdateClick("+row.prescriptionno+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";	
				  var deleteButton = "<button onclick=\"myDeleteClick("+row.prescriptionno+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
				  return updateButton+deleteButton;
			  }
		  }]
	})
	
	//下拉列表动态读取数据
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
		url:'${pageContext.request.contextPath}/queryDrugs.action',//访问后台的地址   查询所有的病人信息
		async:false,//  true：异步     false:同步
		dataType: "json",//数据类型
		success: function(data){
	
			if(data != null){
				var optionhtml = '';//定义一个字符串变量	
				for(var i=0;i<data.length;i++){			
					optionhtml +='<option value="'+data[i].drugsid+'">'+data[i].drugsname+'</option>';			
				}		
				$("#myUpdateDrugs").html(optionhtml);
				$("#myAddDrugs").html(optionhtml);
			} 
		}
	})
})

<!--修改-->
  function myUpdateClick(prescriptionno){
  	
  	$.ajax({
  		 type:"post",//请求方式
  		 url:"${pageContext.request.contextPath}/updateHospitalizationprescription.action",//根据编号查询用户的信息
  		 data:{pid:prescriptionno},//传参数到后台
  		 dataType:"json",//以json格式传递数据
  		 success:function(data){
  			 
  			 //data：指后台查询后返回来的用户信息
  			     $('#myUpdateModal').modal().on('shown.bs.modal',
  					    function() {
  			    	 //给隐藏框赋值
			    	 $("#myUpdateprescriptionno").val(data.prescriptionno);			    	 
  			    	
  			    	 //给下拉列表赋初始值  			    
  			    	 $("#drugsname").val(data.drugsid); 
  			    	 $("#drugno").val(data.drugno); 
  			     })
  		 }
  	})
  }

  //修改事件
  function updateHospitalizationprescription(){
		
		//获取表单中的所有值
		var data = $("#myUpdateForm").serializeArray();
		
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/saveHospitalizationprescription.action',//修改的地址
			data:data,
			dataType:'json',
			success:function(data){
			alert("修改完成")
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
  	 //alert("123");
  
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
   
  function addHospitalizationprescription() {
      
    	  var data = $("#myAddForm").serializeArray();
        
    	$.ajax({
  		type:'post',//提交方式
  		url:'${pageContext.request.contextPath}/addHospitalizationprescription.action',//修改的地址
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
                      <!-- 隐藏框传的值 -->
                      <input type="hidden" name="prescriptionno" id="myUpdateprescriptionno">		 
						<div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">药品名称:</label>
						    <div class="col-sm-10">
						       <select id="myUpdateDrugs" name="drugsid">
						            <option value="">请选择</option>
						       </select>
						    </div>
						  </div>	    
					    <div class="form-group">
						    <label class="col-sm-2 control-label">药品数量/盒:</label>
						    <div class="col-sm-10">
						      <input type="text"  name="drugno" class="form-control" id="drugno" placeholder="请输入药品数量">
						    </div>
					    </div>
					</form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" id="updateBtn">关闭</button>
                <button onclick="updateHospitalizationprescription()" type="button" class="btn btn-primary">修改</button>
            </div>
        </div>
    </div>
</div>

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
						       <select id="myAddPatient" name="patient.patientid">
						            <option value="">请选择</option>
						       </select>
						    </div>
						  </div>   
						<div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">药品名称:</label>
						    <div class="col-sm-10">
						       <select id="myAddDrugs" name="drugsid">
						            <option value="">请选择</option>
						       </select>
						    </div>
						  </div>
					    <div class="form-group">
					    <label class="col-sm-2 control-label">药品数量/盒:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="drugno" class="form-control" id="drugno" placeholder="请输入药品数量/盒">
					      <label id="bednumber-error" class="error" for="drugno" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div> 
					</div>
					  
					</form>
					 <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" id="addBtn">关闭</button>
                <button onclick="addHospitalizationprescription()" type="button" class="btn btn-primary">添加</button>
                    </div>
            </div>
           
        </div>
    </div>
</div>

</body>
</html>