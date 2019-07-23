<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%@ include file="/common/commoncss.jsp"%>
<%@ include file="/common/commonjs.jsp"%>
</head>
<body>

<table id="table"></table>
<script type="text/javascript">

$(function(){//jquery的加载事件
	
	
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/user/getUser.action',
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  pageSize:3,//每页显示3条数据
		  pageList:[2,3,5,8,10],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [{
		    field: 'userid',//字段名称    对应json中的key
		    title: '编号'
		  }, {
		    field: 'username',
		    title: '用户名'
		  }, {
			    field: 'usersex',
			    title: '性别'
		  }, {
			    field: 'birthday',
			    title: '生日日期'
			  },{
				  field:'usercard',
				  title:'身份证'
			  },{
				   title:"操作",
				   formatter:function(value,row,index){
	    				var  updatebtn = '<button type="button" onclick="update('+row.userid+')" class="btn btn-info" id="updatebtn" data-toggle="modal" data-target="#myModal" >修改</button>';
	    				var  deletebtn = '<button type="button" class="btn btn-info" id="deletebtn">删除</button>';
	    				return updatebtn+deletebtn;
	    			}
			  }]
		})
	
//结尾		
})

   function update(userid){
	$.ajax({
		type:"post",//请求方式 get,post
		url:"${pageContext.request.contextPath}/user/selectUserById.action",//请求后台的地址
		data:{userId:userIds},//传递到后台的数据
		dataType:"json",//传到后台的数据类型json  xml、html、txt等
		success:function(data,status){
			  
  
			  
			   })
		}
	})	
	//结尾
}

</script>  

 

	<div class="modal fade" id="myModal" role="dialog" aria-hidden="true">
		<div class="modal-dialog" role="regist">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h1 class="text-center text-primary">修改信息</h1>
				</div>
				<div class="modal-body">
					<div>
						<form class="form-horizontal" id=""
							 method="post">
							<div class="form-group">
								<label class="col-sm-2 control-label" for="username">username：</label>
								<div class="col-sm-8">
									<input class="form-control" id="username"  name="username" type="text"
										placeholder="username">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="usersex">usersex：</label>
								<div class="col-sm-8">
									<input class="form-control" id="usersex"  name="usersex" type="text"
										placeholder="usersex">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="birthday">birthday：</label>
								<div class="col-sm-8">
									<input class="form-control" id="birthday"  name="birthday" type="text"
										placeholder="birthday">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="usercard">usercard：</label>
								<div class="col-sm-8">
									<input class="form-control" id="usercard"  name="usercard" type="text"
										placeholder="usercard">
								</div>
							</div>

							<button type="button" class="btn btn-default"
								data-dismiss="modal"  >关闭</button>
							<button class="btn btn-default" onclick="userRegist()" id="submitbtn" type="submit">确认</button>
						</form>
					</div>
				</div>
				<div class="modal-footer"></div>
			</div>
		</div>
	</div>


</body>
</html>