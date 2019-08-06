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
  $(function(){
	  $('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/patient/getPatient.action',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  toolbar: '#toolbar', //工具按钮用哪个容器
		  pageSize:3,//每页显示3条数据
		  pageList:[2,3,5,8,10],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  {
		    field: 'patientid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    title: '编号'
		  }, {
		    field: 'name',
		    align: 'center',
		    valign:'middle',
		    title: '病人姓名'
		  }, {
			    field: 'sex',
			    align: 'center',
			    valign:'middle',
			    title: '病人性别'
			  
		  },{
			  field: 'birthday',
			    align: 'center',
			    valign:'middle',
			    title: '出生日期'
		  }, {
			    field: 'age',
			    align: 'center',
			    valign:'middle',
			    title: '病人年龄'
			    	
			  },{
				  
				  field: 'marrage',
				    align: 'center',
				    valign:'middle',
				    title: '婚姻状况'
			  },{
				    field: 'occupation',
				    align: 'center',
				    valign:'middle',
				    title: '病人职业'
			  },{
				  field: 'occupation',
				    align: 'center',
				    valign:'middle',
				    title: '病人职业'
			  },{ 
				  field: 'birthplace',
				    align: 'center',
				    valign:'middle',
				    title: '出生地'
				    },{ 
				    	field: 'nation',
					    align: 'center',
					    valign:'middle',
					    title: '病人民族'
					    },{ 
					    	field: 'nationality',
						    align: 'center',
						    valign:'middle',
						    title: '病人国籍'
						    },{ 
						    	field: 'idcard',
							    align: 'center',
							    valign:'middle',
							    title: '身份证'
							    },{ 
							    	field: 'telephone',
								    align: 'center',
								    valign:'middle',
								    title: '病人电话'
								    },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.patientid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.patientid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }
			  ]
		})
		
		   $("#btn_add").click(function () {
			  	//模态框清空内容
			  	 
			  	//alert("添加用户了");
			  	 $('#myAddModal').modal().on('shown.bs.modal', function() {
			  	
			  	  })
			  })
})
  
   /* 修改  预先查询员工信息显示于页面  */
  function myUpdateClick(patientid){
	  
	  alert(patientid)
  	$.ajax({
  		 type:"post",//请求方式
  		 url:"${pageContext.request.contextPath}/patient/getinfoByid.action",//根据编号查询用户的信息
  		 data:{patientid:patientid},//传参数到后台
  		 dataType:"json",//以json格式传递数据
  		 success:function(data){
  			 //data：指后台查询后返回来的用户信息
  			     $('#myUpdateModal').modal().on('shown.bs.modal',
  					    function() {
  			    	 $("#patientid").val(data.patientid);
                     $("#name").val(data.name);
                     $("#marrage").val(data.marrage);
                     $("#occupation").val(data.occupation);
                     $("#telephone").val(data.telephone);
  			    
  			     })
  		 }
  	})
  }
  
  function updatepatient(){
	  	
	  	//获取表单中的所有值
	  	var data = $("#myUpdateForm").serializeArray();
	  	
	  	$.ajax({
	  		type:'post',//提交方式
	  		url:'${pageContext.request.contextPath}/patient/updateinfo.action',//修改的地址
	  		data:data,
	  		dataType:'json',
	  		success:function(data){
	  			
	  			location.reload(true);
	  				 
	  			}
	  		
	  		
	  	})
	  	
	}
  
     
  function myDeleteClick(patientid){
	  
	  var patientid=patientid;
	  
	  	$.ajax({
	  		 type:"post",//请求方式
	  		 url:"${pageContext.request.contextPath}/patient/delinfo.action",//根据编号查询用户的信息
	  		 data:{patientid:patientid},//传参数到后台
	  		 dataType:"json",//以json格式传递数据
	  		 success:function(data){
	  			 
		  			location.reload(true);
	  			 
	  		 }
	  	})
	  
	  
 } 
  
  function addUser() {
	  
	
	  
	 var data = $("#myAddForm").serializeArray();
	  alert(data);
	 	$.ajax({
			type:'post',//提交方式
			url:'${pageContext.request.contextPath}/patient/addinfo.action',
			data:data,
				

			dataType:'json',
			success:function(data){
				location.reload(true);
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
                      <!-- 隐藏框传userid的值 -->
                      <input type="text" name="patientid" id="patientid">
                      
                      <div class="form-group">
					    <label for="name" class="col-sm-2 control-label">姓名:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="name" id="name" placeholder="请输入">
					    </div>
					  </div>

					  <div class="form-group">
					    <label for="marrage" class="col-sm-2 control-label">婚姻状况:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="marrage" id="marrage" placeholder="请输入">
					    </div>
					  </div>
					    <div class="form-group">
					    <label for="occupation" class="col-sm-2 control-label">病人职业:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="occupation" id="occupation" placeholder="请输入">
					    </div>
					  </div> 
					   <div class="form-group">
					    <label for="telephone" class="col-sm-2 control-label">病人电话:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="telephone" id="telephone" placeholder="请输入">
					    </div>
					  </div>

                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updatepatient()" type="button" class="btn btn-primary">修改</button>
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
                <h4 class="modal-title" id="myModalLabel">添加信息</h4>
            </div>
            <div class="modal-body">
                  <form id="myAddForm" class="form-horizontal" action="">
                    <input type="text"  id="isdelete" name="isdelete" value="1">

                    <div class="form-group">
					    <label for="name" class="col-sm-2 control-label">姓名:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="name" name="name"  class="form-control"  >
					    </div>
					  </div>
					  
					  
                    <div class="form-group">
					    <label for="sex" class="col-sm-2 control-label">性别:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="sex" name="sex"  class="form-control"  >
					    </div>
					  </div>
					  
					 <!--   <div class="form-group">
					    <label for=birthday class="col-sm-2 control-label">出生日期:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="birthday" name="birthday"  class="form-control"  >
					    </div>
					  </div> -->
					     <div class="form-group">
					    <label for="age" class="col-sm-2 control-label">年龄:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="age" name="age"  class="form-control"  >
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="marrage" class="col-sm-2 control-label">婚姻状况:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="marrage" name="marrage"  class="form-control"  >
					    </div>
					  </div>
					    
					  <div class="form-group">
					    <label for="occupation" class="col-sm-2 control-label">职业:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="occupation" name="occupation"  class="form-control"  >
					    </div>
					  </div>
					  
					    
					  <div class="form-group">
					    <label for="birthplace" class="col-sm-2 control-label">出生地:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="birthplace" name="birthplace"  class="form-control"  >
					    </div>
					  </div>
					  
					    
					  <div class="form-group">
					    <label for="nation" class="col-sm-2 control-label">民族:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="nation" name="nation"  class="form-control"  >
					    </div>
					  </div>
					  
					    
					  <div class="form-group">
					    <label for="nationality" class="col-sm-2 control-label">国籍:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="nationality" name="nationality"  class="form-control"  >
					    </div>
					  </div>
					  
					    
					  <div class="form-group">
					    <label for="idcard" class="col-sm-2 control-label">身份证:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="idcard" name="idcard"  class="form-control"  >
					    </div>
					  </div>
					  
					     
					  <div class="form-group">
					    <label for="telephone" class="col-sm-2 control-label">电话:</label>
					    <div class="col-sm-10">
					      <input  type="text"   id="telephone" name="telephone"  class="form-control"  >
					    </div>
					  </div>

                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addUser()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>