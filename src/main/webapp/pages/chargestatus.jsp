<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>科室表</title>
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
  $(function(){
	  $('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/chargestatus/queryAllChargeStatus.action',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  toolbar: '#toolbar', //工具按钮用哪个容器
		  pageSize:5,//每页显示5条数据
		  pageList:[5,8],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  /* {
			    field: 'SerialNumber',
			    title: '序号',
			    valign:'middle',
			    align: 'center',
			    formatter: function (value, row, index) {
			        return index+1;
			    }
		  }, */
		  {
			    field: 'chargestatusid',
			    align: 'center',
			    valign:'middle',
			    visible: false,
			    title: '主键'
		   },
		  {
		    field: 'chargeitem.chargeid',
		    align: 'center',
		    valign:'middle',
		    title: '收费项目号'
		  }, {
		    field: 'chargeamount',
		    align: 'center',
		    valign:'middle',
		    title: '收费金额'
		  }, {
			    field: 'settleamount',
			    align: 'center',
			    valign:'middle',
			    title: '结账金额'
		  }, {
			    field: 'user.username',
			    align: 'center',
			    valign:'middle',
			    title: '收款员'
		  },{
			    field: 'chargeitem.patient.name',
			    align: 'center',
			    valign:'middle',
			    title: '病人'
		  },{
			    field: 'checkoutstatus',
			    align: 'center',
			    valign:'middle',
			    title: '结账情况'
		  },{
			    field: 'istransfer',
			    align: 'center',
			    valign:'middle',
			    title: '是否转账'
		  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.chargestatusid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  //var deleteButton = "<button onclick=\"myDeleteClick("+row.departmentid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton;
				  }
			}]
		})
		
		//收款员下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/user/getUser.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				 
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].userid+'">'+data[i].username+'</option>';
						
					}
				   
					$("#myUpdateChargestatus").html(optionhtml);
					$("#cashier").html(optionhtml);
				}
			}
		})
		
		//病人下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/patient/getPatient.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				 
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].patientid+'">'+data[i].name+'</option>';
						
					}
				   
					$("#myUpdateChargeItemPatient").html(optionhtml);
					$("#patientid").html(optionhtml);
				}
			}
		})
		
		//项目号下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/chargeitem/getChargeitem.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				 
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						
						optionhtml +='<option value="'+data[i].chargeid+'">'+data[i].chargeid+'</option>';
						
					}
				   
					$("#chargeitemno").html(optionhtml);
				}
			}
		})
})
  
//添加事件
$("#btn_add").click(function () {
	 
	$('#myAddModal').modal().on('shown.bs.modal', function() {
		 //alert("表单清空！");
		 $("#myAddForm")[0].reset();
	  })
})

//添加薪资表  添加按钮点击事件
function addChargeStatus() {
	
	//由于数据较少，这里就手动获取了
	//并且加上校验
	var chargeamount = $("#chargeamount").val();
	var settleamount = $("#settleamount").val();
	 
	//有一个用户未选择则不让添加
	if(chargeamount==null||settleamount==null||settleamount==''||chargeamount==''){
		swal({
			text: "请填写数据完整",
			type: "warning",
			confirmButtonText: '确认',
			confirmButtonColor: '#f8bb86',
		})
	}else{
		
		//获取表单中的所有值
	    var data = $("#myAddForm").serializeArray();
		
		//ajax提交数据
		 $.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/chargestatus/addChargestatus.action",//根据编号查询用户的信息
		 data:data,//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //alert("添加成功");
			  //刷新页面
			  $("#table").bootstrapTable("refresh");
			  $("#addBtn").click();
			  swal({
					text: "薪资添加成功！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})
			}
	})
	}
}

//chargestatus表修改的预查询
function myUpdateClick(id) {
	 
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/chargestatus/getChargestatusById.action",//根据编号查询用户的信息
		 data:{chargestatusid:id},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
		     $('#myUpdateModal').modal().on('shown.bs.modal',
				    function() {
		    	 //赋值
		    	 $("#myUpdatechargestatusid").val(id); 
		    	 $("#inputchargeitemno").val(data.chargeitemno);
		    	 $("#inputchargeamount").val(data.chargeamount);
		    	 $("#inputsettleamount").val(data.settleamount);
		    	 $("#myUpdateChargestatus").val(data.cashier);
		    	 $("#myUpdateChargeItemPatient").val(data.patientid);
		    	 $("#inputcheckoutstatus").val(data.checkoutstatus);
		    	 $("#inputistransfer").val(data.istransfer);
		     })
		 }
	})
}
//修改department表
function updateChargeStatus() {
	//表单序列化
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	//请求后台，修改数据
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/chargestatus/updateChargestatusById.action",//根据编号查询用户的信息
		 data:data,//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //alert("cgl");
			 //刷新表格
			 $("#table").bootstrapTable("refresh");
			 swal({
					text: "薪资修改成功！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
			  })    
		 }
	})
}
</script>

<!-- 修改模态框(Modal) -->
<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">修改科室</h4>
            </div>
            <div class="modal-body">
            
                  <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传postnumber的值 -->
                      <input type="hidden" name="chargestatusid" id="myUpdatechargestatusid">
                      
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">收费项目号:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="chargeitemno" class="form-control" id="inputchargeitemno">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">收费金额:</label>
					    <div class="col-sm-10">
					       <input type="text"  name="chargeamount" class="form-control" id="inputchargeamount">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">结账金额:</label>
					    <div class="col-sm-10">
					       <input type="text"  name="settleamount" class="form-control" id="inputsettleamount">
					    </div>
					  </div> 
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">收款员:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateChargestatus" class="form-control" name="userid">
					       			
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">病人:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateChargeItemPatient" class="form-control" name="chargeitem.patient.patientid">
					       		
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">结账情况:</label>
					    <div class="col-sm-10">
					       <input type="text"  name="checkoutstatus" class="form-control" id="inputcheckoutstatus">
					    </div>
					  </div> 
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">是否转账:</label>
					    <div class="col-sm-10">
					       <input type="text"  name="istransfer" class="form-control" id="inputistransfer">
					    </div>
					  </div> 
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateChargeStatus()" type="button" class="btn btn-primary" data-dismiss="modal">修改</button>
            </div>
        </div>
    </div>
</div>
 
<!-- 添加薪资模态框（Modal） -->
<div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加收费情况</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">项目号:</label>
					    <div class="col-sm-7">
					       <select id="chargeitemno" name="chargeitemno">
					        	
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">收费金额:</label>
					    <div class="col-sm-7">
					       <input type="text"  name="chargeamount" class="form-control" id="chargeamount" placeholder="(必填项)">
					    </div>
					  </div>
					   
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">结账金额:</label>
					    <div class="col-sm-7">
					        <input type="text"  name="settleamount" class="form-control" id="settleamount" placeholder="(必填项)">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">收款员:</label>
					    <div class="col-sm-7">
					       <select id="cashier" class="form-control" name="cashier">
					      		
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">病人:</label>
					    <div class="col-sm-7">
					       <select id="patientid" class="form-control" name="patientid">
					      		
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">结账情况:</label>
					    <div class="col-sm-7">
					       <select id="checkoutstatus" class="form-control" name="checkoutstatus">
					      		<option value="0">已结账</option>
					      		<option value="1">未结账</option>
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">转账情况:</label>
					    <div class="col-sm-7">
					       <select id="istransfer" class="form-control" name="istransfer">
					      		<option value="0">已转账</option>
					      		<option value="1">未转账</option>
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addChargeStatus()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>