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
		  url: '${pageContext.request.contextPath}/department/queryDepartment.action',//访问后台（json）的地址
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
		    field: 'departmentid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    visible: false,
		    title: '科室编号'
		  }, {
		    field: 'departmentname',
		    align: 'center',
		    valign:'middle',
		    title: '科室名称'
		  }, {
			    field: 'departmentaddress',
			    align: 'center',
			    valign:'middle',
			    title: '科室地址'
		  }, {
			    field: 'departmenttelephone',
			    align: 'center',
			    valign:'middle',
			    title: '科室电话'
		  },{
			    field: 'user.username',
			    align: 'center',
			    valign:'middle',
			    title: '负责人'
		  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.departmentid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.departmentid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }]
		})
		
		//负责人下拉列表动态读取数据
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
				  
					$("#userid").html(optionhtml);
					$("#myUpdateDepartment").html(optionhtml);
				}
			}
		})
		
  })
  
  /* 做加删除啦  */
function myDeleteClick(id) {
	
	//alert("deaprtment的id是："+id);
	
	var departmentid = id;
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/department/deleteById.action",//根据编号查询用户的信息
		 data:{departmentid:departmentid},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  if(data==1){
			   	$("#table").bootstrapTable("refresh");
			  	//给出提示信息
				/*swal({
					text: "科室删除成功！",
					type: "success",
					//confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})*/
			  }else{
				  swal({
						text: "删除失败",
						type: "warning",
						confirmButtonText: '确认',
						confirmButtonColor: '#f8bb86',
					})
			  }
			}
	})
}

//添加事件
$("#btn_add").click(function () {
	 
	$('#myAddModal').modal().on('shown.bs.modal', function() {
		 //alert("表单清空！");
		 $("#myAddForm")[0].reset();
	  })
})

//添加科室  添加按钮点击事件
function addDepartment() {
	
	//由于数据较少，这里就手动获取了
	//并且加上校验
	var departmentname = $("#departmentname").val();
	var departmentaddress = $("#departmentaddress").val();
	var departmenttelephone = $("#departmenttelephone").val();
	var userid = $("#userid").val();
	 
	//有一个用户未选择则不让添加
	if(departmentname==null||departmentaddress==null||departmenttelephone==null||userid==null||departmentname==''||departmentaddress==''||departmenttelephone==''||userid==''){
		swal({
			text: "请填写数据完整",
			type: "warning",
			confirmButtonText: '确认',
			confirmButtonColor: '#f8bb86',
		})
	}else{
		//ajax提交数据
		 $.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/department/addDepartment.action",//根据编号查询用户的信息
		 data:{
			 departmentname:departmentname,
			 departmentaddress:departmentaddress,
			 departmenttelephone:departmenttelephone,
			 userid:userid
		},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //alert("添加成功");
			  //刷新页面
			  $("#table").bootstrapTable("refresh");
			  $("#addBtn").click();
			  swal({
					text: "科室分配成功！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})
			}
	})
	}
}  

//department表修改的预查询
function myUpdateClick(id) {
	
	//alert("department的编号:"+id);
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/department/getDepartmentById.action",//根据编号查询用户的信息
		 data:{departmentid:id},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //alert("department获取到了");
		 	 //data：指后台查询后返回来的用户信息
		     $('#myUpdateModal').modal().on('shown.bs.modal',
				    function() {
		    	 //alert("开始赋制");
		    	 //赋值
		    	 $("#myUpdateDepartmentid").val(id);
		    	 $("#inputdepartmentname").val(data.departmentname);
		    	 $("#inputdepartmentaddress").val(data.departmentaddress);
		    	 $("#inputdepartmenttelephone").val(data.departmenttelephone);
		    	 $("#myUpdateDepartment").val(data.userid);
		     })
		 }
	})
}
//修改department表
function updateDepartment() {
	//表单序列化
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	//alert(data.departmentid+"---"+data.departmentname+"---"+data.departmentaddress+"---"+data.departmenttelephone);
	 
	//请求后台，修改数据
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/department/updateDepartmentById.action",//根据编号查询用户的信息
		 data:data,//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //alert("cgg");
			 //刷新表格
			 $("#table").bootstrapTable("refresh");
			 swal({
					text: "科室修改成功！",
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
                      <input type="hidden" name="departmentid" id="myUpdateDepartmentid">
                      
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="departmentname" class="form-control" id="inputdepartmentname" placeholder="科室名称">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室地址:</label>
					    <div class="col-sm-10">
					       <input type="text"  name="departmentaddress" class="form-control" id="inputdepartmentaddress" placeholder="科室地址">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室电话:</label>
					    <div class="col-sm-10">
					       <input type="text"  name="departmenttelephone" class="form-control" id="inputdepartmenttelephone" placeholder="科室电话">
					    </div>
					  </div> 
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">负责人:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateDepartment" class="form-control" name="userid">
					       			
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateDepartment()" type="button" class="btn btn-primary" data-dismiss="modal">修改</button>
            </div>
        </div>
    </div>
</div>
 
<!-- 添加岗位模态框（Modal） -->
<div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加科室</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="departmentname" class="form-control" id="departmentname" placeholder="(必填项)">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">科室地址:</label>
					    <div class="col-sm-7">
					       <input type="text"  name="departmentaddress" class="form-control" id="departmentaddress" placeholder="(必填项)">
					    </div>
					  </div>
					   
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室电话:</label>
					    <div class="col-sm-7">
					        <input type="text"  name="departmenttelephone" class="form-control" id="departmenttelephone" placeholder="(必填项)">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">负责人:</label>
					    <div class="col-sm-7">
					       <select id="userid" class="form-control" name="username">
					      		 
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addDepartment()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>