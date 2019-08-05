<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/sweetalert/resource/css/sweetalert2.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/sweetalert/resource/css/mui.min.css" />  
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
		  url: '${pageContext.request.contextPath}/getAttendanceRecord.action',//访问后台（json）的地址
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
		    field: 'attdid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    visible: false,
		    title: '编号'
		  }, {
		    field: 'workername',
		    align: 'center',
		    valign:'middle',
		    title: '用户名'
		  }, /* {
			    field: 'workingtime',
			    align: 'center',
			    valign:'middle',
			    title: '上班时间'
		  }, {
			    field: 'closingtime',
			    align: 'center',
			    valign:'middle',
			    title: '下班时间'
			  }, */{
				  field:'workingconditions',
				  align: 'center',
				  valign:'middle',
				  width: '60px',
				  title:'上班情况'
			  },{
				  field:'closingconditionns',
				  align: 'center',
				  valign:'middle',
				  title:'下班情况'
			  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.attdid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.attdid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }]
		})
})



//添加事件
$("#btn_add").click(function () {
	//模态框清空内容
	 
	
	 $('#myAddModal').modal().on('shown.bs.modal', function() {
		 //alert("表单清空！");
		 $("#myAddForm")[0].reset();
		 
	  })
})

/* function ClearInput() {
     var validator = $("#myAddForm").validate({
          submitHandler: function (form) {
              form.submit();
          }
      });
      validator.resetForm();
}
 
function addAttendanceRecord() {
	$("#myAddForm").submit();
	//首先校验表单
} */

/* $.validator.setDefaults({
    submitHandler: function() {
      alert("提交事件!");
      //下面使用ajax提交
      //获取表单中的所有值
  	  var data = $("#myAddForm").serializeArray();
      
  	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/addAttendanceRecord.action',//修改的地址
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
}) */
//添加事件
function addAttendanceRecord(){
	
	var data = $("#myAddForm").serializeArray();
    
  	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/addAttendanceRecord.action',//修改的地址
		data:data,
		dataType:'json',
		success:function(data){
			
			//点击关闭按纽，同时刷新页面数据
			$("#addBtn").click();
			
			//刷新表格  线程等待一会儿
			setTimeout(function(){$("#table").bootstrapTable("refresh");}, 1000);
			  
			/* alert("成功了"); */
			swal({
					text: "已成功添加！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})
			
		}
		
	})
	
}

//修改赋初始值
function myUpdateClick(attdid){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/selectAttendanceRecord.action",//根据编号查询信息
		 data:{attdid:attdid},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 
			//data：指后台查询后返回来的用户信息
		     $('#myUpdateModal').modal().on('shown.bs.modal',
		    		 function() {
		    	 
		    	 //给隐藏框赋值
		    	 $("#attdid").val(data.attdid);
		    	 $("#wokerName").val(data.workername);
		    	 $("#workingconditions").val(data.workingconditions);
		    	 $("#closingconditionns").val(data.closingconditionns);
		    	 
		     })
		 }
	
	})
	
}

//修改事件
function updateAttendanceRecord(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/saveUpdateAttendanceRecord.action',//修改的地址
		data:data,
		dataType:'json',
		success:function(data){
			if(data == 1){
				//关闭修改模态框
				$("#updateBtn").click();
				swal({
					text: "已成功修改！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})
				
				//刷新表格  线程等待一会儿
				setTimeout(function(){$("#table").bootstrapTable("refresh");}, 1000);
				 
			}else{
				//修改失败  提示信息
				/* alert("修改信息失败！"); */
				swal({
					text: "修改失败了！",
					type: "error",
					confirmButtonText: '确认',
					confirmButtonColor: '#f27474',
		          })
			}
		}
		
	})
}


//删除事件
function myDeleteClick(attdid){
	
	/* $.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/deleteById.action",//根据编号查询用户的信息
		 data:{attdid:attdid},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  //alert("删除成功了");
			  $("#table").bootstrapTable("refresh");  
			}
	}) */
	
	
	swal({
		title:'确定删除吗?',
		text: "你将无法恢复它！",
		type: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#d33',
		cancelButtonColor: 'gray',
		cancelButtonText: '取消',
		reverseButtons: true, //控制按钮反转
		confirmButtonText: '确定',
	}).then(function(isConfirm) {
		if(!isConfirm) {
			swal({
				text: "取消了！",
				type: "error",
				confirmButtonText: '确认',
				confirmButtonColor: '#f27474',
			})
		} else {
			//点击确认键
			$.ajax({
				type:'post',//提交方式                                                                                                        
				url:'${pageContext.request.contextPath}/deleteById.action',//修改的地址
				data:{attdid:attdid},//传参数到后台
				dataType:'json',
				success:function(data){
					
					if(data == 1){
						 
						swal({
							text: "已成功删除！",
							type: "success",
							confirmButtonText: '确认',
							confirmButtonColor: '#4cd964',
						})
						//刷新表格
						 $("#table").bootstrapTable("refresh");
					}else{
						//修改失败  提示信息
						swal({
						text: "删除失败了！",
						type: "error",
						confirmButtonText: '确认',
						confirmButtonColor: '#f27474',
			            })
					}
					
				}
				
			})//.ajax
		}//else
	})//swal
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
                      <!-- 隐藏框传userid的值 -->
                      <input type="hidden" name="attdid" id="attdid">
                      
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">工作人员名:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="wokername" class="form-control" id="wokerName" placeholder="请输入人员名称">
					    </div>
					  </div>
					  
					<%--   <div class="form-group">
					    <label class="col-sm-2 control-label">上班时间:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="workingtime" id="workingtime" placeholder="(必填项)">
					    <label id="birthday-error" class="error" for="birthday" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#workingtime' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">下班时间:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="closingtime" id="closingtime" placeholder="(必填项)">
					    <label id="birthday-error" class="error" for="birthday" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#closingtime' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div> --%>
					  
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">上班情况:</label>
					    <div class="col-sm-7">
					       <select id="workingconditions" class="form-control" name="workingconditions">
					       		<option value="">请选择</option>
					       		<option>已打卡</option>
								<option>未打卡</option>
								<option>迟到</option>
					       </select>
					    </div>
					  </div>
					   
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">下班情况:</label>
					    <div class="col-sm-7">
					       <select id="closingconditionns" class="form-control" name="closingconditionns">
					       		<option value="">请选择</option>
					       		<option>已打卡</option>
								<option>未打卡</option>
								<option>早退</option>
					       </select>
					    </div>
					  </div>
					  
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateAttendanceRecord()" type="button" class="btn btn-primary">修改</button>
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
                <h4 class="modal-title" id="myModalLabel">添加记录</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">人员名称:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="workername" class="form-control" id="inputworkername" placeholder="(必填项)">
					      <label id="username-error" class="error" for="username" style="margin-top: 4px;color: red;font-size: 15px;"></label>
					    </div>
					  </div>
					  
					 
					  
					  
					  
					  <%-- <div class="form-group">
					    <label class="col-sm-2 control-label">上班时间:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="workingtime" id="inputworkingtime" placeholder="(必填项)">
					    <label id="birthday-error" class="error" for="birthday" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#workingtime' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">下班时间:</label>
					    <div class="col-sm-7">
					    <input type="text" class="form-control" name="closingtime" id="inputclosingtime" placeholder="(必填项)">
					    <label id="birthday-error" class="error" for="birthday" style="margin-top: 4px;color: red;font-size: 15px;"></label>
						<script src="${pageContext.request.contextPath}/plugin/layDate-v5.0.9/laydate/laydate.js"></script> 
						<script>
							laydate.render({
							  elem: '#closingtime' //指定元素
							  ,theme: 'molv'
							});
						</script>
					    </div>
					  </div> --%>
					  
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">上班情况:</label>
					    <div class="col-sm-7">
					       <select id="myAddworkingconditions" class="form-control" name="workingconditions">
					       		<option value="">请选择</option>
					       		<option>已打卡</option>
								<option>未打卡</option>
								<option>迟到</option>
					       </select>
					    </div>
					  </div>
					   
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">下班情况:</label>
					    <div class="col-sm-7">
					       <select id="myAddclosingconditionns" class="form-control" name="closingconditionns">
					       		<option value="">请选择</option>
					       		<option>已打卡</option>
								<option>未打卡</option>
								<option>早退</option>
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addAttendanceRecord()" type="button" class="btn btn-primary">添加</button>
            </div>
           </div>
    </div>
</div>




</body>
</html>