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
		  url: '${pageContext.request.contextPath}/position/queryPositionDept.action',//访问后台（json）的地址
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
		    field: 'postnumber',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    visible: false,
		    title: '编号'
		  }, {
		    field: 'postname',
		    align: 'center',
		    valign:'middle',
		    title: '职位名称'
		  }, {
			    field: 'department.departmentname',
			    align: 'center',
			    valign:'middle',
			    title: '科室名称'
		  }, {
			    field: 'postsalary',
			    align: 'center',
			    valign:'middle',
			    title: '基本薪资'
			  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.postnumber+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  var authorityButton = "<button  onclick=\"myAuthorityClick("+row.postnumber+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.postnumber+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  
					  //var updateButton = "<button  onclick=\"myUpdateClick("+row.poId+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.poId+")\" type=\"button\" class=\"btn btn-success\">分配权限</button>";
					  //var deleteButton = "<button type=\"button\" class=\"btn btn-success\">删除</button>";
					  return updateButton+authorityButton+deleteButton;
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
					//下面这个是修改position时需要的
					$("#myUpdatePosition").html(optionhtml);
				}
			}
		})
		
	 $("#btnSaveAthority").click(function(){
		 
		 //岗位id
		 var poId = $("#myAuthorityRole").val();
		 
		 //获取选中的菜单id集合
		 var menuIds =  zTreeOnCheck();
		  
		 $.ajax({
			  type:"post",//提交方式为post
			  url:"${pageContext.request.contextPath}/position/saveAuthority.action?menuIds="+menuIds,//访问后台的地址
			  data:{poId:poId},//传递到后台的数据
			  dataType:"json",
			  success:function(data){
				  if(data>0){
					  //分配权限成功
					  
					  //提示分配失败的
					  swal({
							title: '温馨提示',
							text: "分配权限成功",
							confirmButtonText: '确认',
							confirmButtonColor: 'Green',
						})
					  
					  //关闭窗体
					  $('#myAuthorityModal').modal("hide");
				  }else{
					  //提示分配失败的
					  swal({
							title: '错误提示',
							text: "分配权限失败",
							confirmButtonText: '确认',
							confirmButtonColor: 'Green',
						})
						
				  }
			  }
		 })
	 })
 
		
  })
//用于获取选中的菜单id集合
function zTreeOnCheck(){

	//获取树形结构对象
	var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
	
	//获取选中的菜单
	var nodes = treeObj.getCheckedNodes(true);
	
	//菜单id集合对象
	var v = [];
	
	//循环
	for(var i=0;i<nodes.length;i++){
		v.push(nodes[i].id);//把数据添加到数组中
	}
	return v;
}
  
//分配权限事件
function myAuthorityClick(poId){
	  //alert(poId);
	 
	  $('#myAuthorityModal').modal().on('shown.bs.modal',
			    function() {
			 //给分配权限的窗体的岗位隐藏框赋值
		     $("#myAuthorityRole").val(poId);
		  
			  var zTreeObj;
			   
			   // zTree 的参数配置，深入使用请参考 API 文档(setting 配置详解)
			   var setting = {
					   check: {
							enable: true//复选框
						},
						view: {
							showLine: false
						},
						async: {
							enable: true,
							url: "${pageContext.request.contextPath}/position/sendAuthority.action?postNumber="+poId  //访问json数据
						}
			   };
			   
			   $(document).ready(function(){
				      zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, null);
				   });
	  })
}
  
/* 做加删除啦  */
function myDeleteClick(id) {
	
	//alert(id);
	
	var postnumber = id;
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/position/deleteById.action",//根据编号查询用户的信息
		 data:{postnumber:postnumber},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  //alert("删除成功了");
			  $("#table").bootstrapTable("refresh");
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
function addPosition() {
	
	//由于数据较少，这里就手动获取了
	//并且加上校验
	var postname = $("#postname").val();
	var postsalary = $("#postsalary").val();
	var departmentid = $("#myAddDepartment").val();
	
	//有一个用户未选择则不让添加
	if(postname==null||postsalary==null||departmentid==null||postname==''||postsalary==''){
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
		 url:"${pageContext.request.contextPath}/position/addPosition.action",//根据编号查询用户的信息
		 data:{
			 postname:postname,
			 postsalary:postsalary,
			 departmentid:departmentid
		},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  $("#table").bootstrapTable("refresh");
			  //关闭弹框
			  $("#addBtn").click();
			  
			  swal({
					text: "职位分配成功！",
					type: "success",
					confirmButtonText: '确认',
					confirmButtonColor: '#4cd964',
				})
			}
	})
	}
	 
}  

//position表修改的预查询
function myUpdateClick(id) {
	
	//alert("position的编号:"+id);
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/position/getPositionById.action",//根据编号查询用户的信息
		 data:{poId:id},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	  
			    	 //赋值
			    	 $("#myUpdatePoid").val(data.postnumber);
			    	 $("#inputpostname").val(data.postname);
			    	 $("#inputpostsalary").val(data.postsalary);
			    	 $("#myUpdatePosition").val(data.departmentid);
			    	 
			    	 //alert("渲染成功");
			     })
		 }
	})
}

function updatePosition() {
	//alert("position");
	//这里还是手动获取几个属性
	//职位编号
	var poId = $("#myUpdatePoid").val();
	//职位名称
  	var postname = $("#inputpostname").val();
	//基本薪资
  	var salary = $("#inputpostsalary").val();
	//科室id
  	var departmentid = $("#myUpdatePosition").val();
	
	//alert(poId+"--"+postname+"--"+salary+"--"+departmentid)
	//请求后台，修改数据
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/position/updatePositionById.action",//根据编号查询用户的信息
		 data:{
			 postnumber:poId,
			 postname:postname,
			 postsalary:salary,
			 departmentid:departmentid
		 },//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //刷新表格
			 $("#table").bootstrapTable("refresh");
			 swal({
					text: "职位修改成功！",
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
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <div class="modal-body">
            
                  <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传postnumber的值 -->
                      <input type="hidden" name="postnumber" id="myUpdatePoid">
                      
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">职位名称:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="postname" class="form-control" id="inputpostname" placeholder="职位名称">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">基本薪资:</label>
					    <div class="col-sm-10">
					      <!-- <input type="text" class="form-control" name="postsalary" id="inputpostsalary" placeholder="薪资"> -->
					      <select id="inputpostsalary" class="form-control" name="postsalary">
					       		<option value="3000">3000</option>
					       		<option value="4000">4000</option>
					       		<option value="5000">5000</option>
					       		<option value="6000">6000</option>
					       </select>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-10">
					       <select id="myUpdatePosition" class="form-control" name="departmentid">
					       			
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updatePosition()" type="button" class="btn btn-primary" data-dismiss="modal">修改</button>
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
                <h4 class="modal-title" id="myModalLabel">添加岗位</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">职位名称:</label>
					    <div class="col-sm-7">
					      <input type="text"  name="postname" class="form-control" id="postname" placeholder="(必填项)">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label class="col-sm-2 control-label">基本薪资:</label>
					    <div class="col-sm-7">
					      <!-- <input type="text"  name="postsalary" class="form-control" id="postsalary" placeholder="(必填项)"> -->
					      <select id="postsalary" class="form-control" name="postsalary">
					      		<option value="">- - -请选择- - -</option>
					       		<option value="3000">3000</option>
					       		<option value="4000">4000</option>
					       		<option value="5000">5000</option>
					       		<option value="6000">6000</option>
					       </select>
					    </div>
					  </div>
					   
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">科室名称:</label>
					    <div class="col-sm-7">
					       <select id="myAddDepartment" class="form-control" name="departmentid">
					       		 
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addPosition()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>

<!-- 分配权限模态框（Modal） -->
<div class="modal fade" id="myAuthorityModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">分配权限</h4>
            </div>
            <div class="modal-body">
                  <form id="myAuthorityForm" class="form-horizontal">
                         <input type="hidden" id="myAuthorityRole" name="myRoleId">
                         <ul id="treeDemo" class="ztree"></ul>
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button id="btnSaveAthority" type="button" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">





</script>
 
</body>
</html>