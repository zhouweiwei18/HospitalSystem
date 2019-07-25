<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/common/commoncss.jsp" %>
<%@ include file="/common/commonjs.jsp" %>

<body>

<table id="table">

</table>

    
<script type="text/javascript">
$(function(){//jquery的加载事件
	$('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/user/getUser.action',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  pageSize:5,//每页显示3条数据
		  pageList:[5,7,10,12],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  {
		    field: 'SerialNumber',
		    title: '序号',
		    align: 'center',
		    formatter: function (value, row, index) {
		        return index+1;
		    }
		  },
		  {
		    field: 'userid',//字段名称    对应json中的key
		    align: 'center',
		    visible: false,
		    title: '编号'
		  }, {
		    field: 'username',
		    align: 'center',
		    title: '用户名'
		  }, {
		    field: 'userphoto',
		    align: 'center',
		    title: '头像',
		    formatter:function(value,row,index){
		    	//value:值   row：行      index:索引  \  \"相当于'
		    	//var imageUrl = '<img onclick="myPhotoClick(2)" alt="" src="/imgeurl/'+row.userPhoto+'" width="50" height="50">';
		    	var imageUrl="<img class='img-rounded' onclick=\"myPhotoClick('/imgeurl/"+row.userphoto+"')\" alt=\"\" src=\"/imgeurl/"+row.userphoto+"\" width=\"50\" height=\"50\">";
		    	return imageUrl;
		    }
		  }, {
			    field: 'usersex',
			    align: 'center',
			    title: '性别'
		  }, {
			    field: 'birthday',
			    align: 'center',
			    title: '生日日期'
			  },{
				  field:'usercard',
				  align: 'center',
				  title:'身份证'
			  },{
				  field:'position.postname',
				  align: 'center',
				  title:'岗位'
			  },{
				  field:'position.department.departmentname',
				  align: 'center',
				  title:'科室名称'
			  },{
				  title:'操作',
				  align: 'center',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.userid+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  var deleteButton = "<button type=\"button\" class=\"btn btn-success\">删除</button>";
					  return updateButton+deleteButton;
				  }
			  }]
		})
		
		//下拉列表动态读取数据
		$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/position/queryPosition.action',//访问后台的地址   查询所有的岗位信息
			async:false,//  true：异步     false:同步
			dataType: "json",//数据类型
			success: function(data){
				//回调函数
				//给下拉列表赋值  <select id="myUpdatePosition">   <option="管理员">管理员</option>
				if(data != null){
					var optionhtml = '';//定义一个字符串变量
					
					for(var i=0;i<data.length;i++){
						optionhtml +='<option value="'+data[i].postnumber+'">'+data[i].postname+'</option>';
					}
					
					//给下拉列表赋值  text()、val()、html()、attr()等
					$("#myUpdatePosition").html(optionhtml);
				}
			 	
			}
			
		})
})

function myPhotoClick(photoValue){
		
	    $('#myModal').modal().on('shown.bs.modal',
	    function() {
	         $("#myDialogImage").attr("src",photoValue);
	    })
}

/* 修改  预先查询员工信息显示于页面  */
function myUpdateClick(userId){
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/user/getById.action",//根据编号查询用户的信息
		 data:{uid:userId},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 //data：指后台查询后返回来的用户信息
			     $('#myUpdateModal').modal().on('shown.bs.modal',
					    function() {
			    	 
			    	 //给用户名输入框赋初始值
			    	 
			    	 //给隐藏框赋值
			    	 $("#myUpdateUserId").val(data.userid);
			    	 
			    	 $("#inputuserName").val(data.username);
			    	 $("#inputuserPwd").val(data.userpwd);
			    	 
			    	 //给隐藏框赋值（以便于传值到后台）
			    	 $("#photoImage").val(data.userphoto);
			    	 
			    	 //给图片控件赋值
			    	 $("#myUpdateImage").attr("src","/imgeurl/"+data.userphoto);
			    	 
			    	 //给下拉列表赋初始值
			    	 $("#myUpdatePosition").val(data.postid);
			     
			     })
		 }
	})
}

//修改事件
function updateUser(){
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	$.ajax({
		type:'post',//提交方式
		url:'${pageContext.request.contextPath}/user/saveUpdateUser.action',//修改的地址
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

</script>  
<!-- 模态框（Modal） -->
<div class="modal fade" id="myUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <div class="modal-body">
                  <form id="myUpdateForm" class="form-horizontal">
                  
                       <input type="hidden" name="userid" id="myUpdateUserId">
                 
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">用户名:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="username" class="form-control" id="inputuserName" placeholder="请输入用户名">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="userpwd" id="inputuserPwd" placeholder="请输入密码">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">头像:</label>
					    <div class="col-sm-10">
					      <input name="userphoto" type="hidden" id="photoImage" value="" /> 
					      <img id="myUpdateImage" alt="" src="" class="img-thumbnail" width="100" height="100">
					      <input type="button" id="myPhotoButton" class="btn btn-info" value="选择头像" /></p>
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">岗位名称:</label>
					    <div class="col-sm-10">
					       <select id="myUpdatePosition" class="form-control" name="postid">
					       
					       </select>
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateUser()" type="button" class="btn btn-primary">修改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- 修改或添加模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">我的头像</h4>
            </div>
            <div class="modal-body">
                <img id="myDialogImage" class="img-thumbnail" alt="" src="" width="600" height="600">
            </div>
           <!--  <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交更改</button>
            </div> -->
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<script type="text/javascript">
 $(function(){
	 KindEditor.ready(function(K) {
			var editor = K.editor({
				allowFileManager : true
			});
			K('#myPhotoButton').click(function() {
				editor.loadPlugin('image', function() {
					editor.plugin.imageDialog({
						imageUrl : K('#photoImage').val(),//取值
						clickFn : function(url, title, width, height, border, align) {
							//alert(url);
							//C://Users/Administrator/Desktop/image/20190725/20190725161642_624.jpg
							var startUrl='C://Users/Administrator/Desktop/image/';
							var newUrl = url.substr(startUrl.length);
							K('#photoImage').val(newUrl);
							
							$("#myUpdateImage").attr("src","/imgeurl/"+newUrl);
							editor.hideDialog();
						}
					});
				});
			});
		})
 })
</script>

</body>
</html>