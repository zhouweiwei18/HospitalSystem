<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		  url: '${pageContext.request.contextPath}/worktime/queryWorkTime.action',//访问后台（json）的地址
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
			    field: 'SerialNumber',
			    title: '序号',
			    valign:'middle',
			    align: 'center',
			    formatter: function (value, row, index) {
			        return index+1;
			    }
		  },
		  {
		    field: 'wkid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    visible: false,
		    title: '编号'
		  }, {
		    field: 'worktime',
		    align: 'center',
		    valign:'middle',
		    title: '值班时间'
		  }, {
			    field: 'department.departmentname',
			    align: 'center',
			    valign:'middle',
			    title: '科室名称'
		  }, {
			    field: 'user.username',
			    align: 'center',
			    valign:'middle',
			    title: '值班人员'
			  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.wkid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton;
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
					 
					//这个是修改worktime时需要的
					$("#myUpdateWkDept").html(optionhtml);
					$("#myAddWkDept").html(optionhtml);
				}
			}
		})
		
		//值班人员下拉列表动态读取数据
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
				   
					$("#myUpdateWkUser").html(optionhtml);
					$("#myAddWkUser").html(optionhtml);
				}
			}
		})
  
})

//worktime表修改的预查询
function myUpdateClick(id) {
	
	//alert("WorkTime的编号:"+id);
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/worktime/getWorktimeById.action",
		 data:{wkid:id},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
		     //data：指后台查询后返回来的用户信息
		     $('#myUpdateModal').modal().on('shown.bs.modal',
				    function() {
		    	  
		    	 //赋值
		    	 $("#myUpdateWkid").val(data.wkid);
		    	 $("#inputworktime").val(data.worktime);
		    	 $("#myUpdateWkDept").val(data.departmentid);
		    	 $("#myUpdateWkUser").val(data.userid);
		    	 
		    	 //alert("渲染成功");
		     })
		 }
	})
}
  
function updateWorktime() {
	//alert("worktime");
	//手动获取几个属性
	//职位编号
	var wkid = $("#myUpdateWkid").val();
	//职位名称
  	var worktime = $("#inputworktime").val();
	//基本薪资
  	var departmentid = $("#myUpdateWkDept").val();
	//科室id
  	var userid = $("#myUpdateWkUser").val();
	
	//alert(wkid+"--"+worktime+"--"+departmentid+"--"+userid)
	//请求后台，修改数据
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/worktime/updateWorkTimeById.action",//根据编号查询用户的信息
		 data:{
			 wkid:wkid,
			 worktime:worktime,
			 departmentid:departmentid,
			 userid:userid
		 },//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 
			 if(data==1){
				 //刷新表格
				 $("#table").bootstrapTable("refresh");
				 swal({
						text: "修改成功！",
						type: "success",
						confirmButtonText: '确认',
						confirmButtonColor: '#4cd964',
				  })    
			 }else{
				 swal({
						text: "修改失败！",
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

//添加岗位  添加按钮点击事件
function addWorktime() {
	//由于数据较少，这里就手动获取了
	//并且加上校验
	var worktime = $("#worktime").val();
	var departmentid = $("#myAddWkDept").val();
	var userid = $("#myAddWkUser").val();
	
	//有一个用户未选择则不让添加
	if(worktime==null||departmentid==null||userid==null||worktime==''){
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
		 url:"${pageContext.request.contextPath}/worktime/addWorktime.action",//根据编号查询用户的信息
		 data:{
			 worktime:worktime,
			 departmentid:departmentid,
			 userid:userid
		},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  $("#table").bootstrapTable("refresh");
			  //关闭弹框
			  $("#addBtn").click();
			  
			  swal({
					text: "值班人员分配成功！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})
			}
	})
	}
}  
</script>

<!-- 修改模态框(Modal) -->
<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">值班修改</h4>
            </div>
            <div class="modal-body">
            
                  <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传wkid的值  -->
                      <input type="hidden" name="wkid" id="myUpdateWkid">
                      
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">值班时间:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="worktime" class="form-control" id="inputworktime" placeholder="值班时间">
						  <script>
								laydate.render({
								  elem: '#inputworktime' //指定元素
								  ,theme: 'molv'
								});
						  </script>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateWkDept" class="form-control" name="departmentid">
					       			
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">值班人员:</label>
					    <div class="col-sm-10">
					      <select id="myUpdateWkUser" class="form-control" name="userid">
					       			
					      </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateWorktime()" type="button" class="btn btn-primary" data-dismiss="modal">修改</button>
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
                <h4 class="modal-title" id="myModalLabel">新增值班表</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">值班时间:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="worktime" class="form-control" id="worktime" placeholder="值班时间">
						  <script>
								laydate.render({
								  elem: '#worktime' //指定元素
								  ,theme: 'molv'
								});
						  </script>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-10">
					       <select id="myAddWkDept" class="form-control" name="departmentid">
					       			
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">值班人员:</label>
					    <div class="col-sm-10">
					      <select id="myAddWkUser" class="form-control" name="userid">
					       			
					      </select>
					    </div>
					  </div>
					  
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addWorktime()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>