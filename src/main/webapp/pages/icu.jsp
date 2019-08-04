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
		  url: '${pageContext.request.contextPath}/icu/queryIcu.action',//访问后台（json）的地址
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
			    field: 'SerialNumber',
			    title: '序号',
			    valign:'middle',
			    align: 'center',
			    formatter: function (value, row, index) {
			        return index+1;
			    }
		  }, */
		  {
		    field: 'icuid',
		    align: 'center',
		    valign:'middle',
		    visible: true,
		    title: '病区号'
		  }, 
		  {
		    field: 'bedno',
		    align: 'center',
		    valign:'middle',
		    title: '床位数'
		  }, 
		  {
		    field: 'icuname',
		    align: 'center',
		    valign:'middle',
		    title: '病区名'
		  }, 
		  {
		    field: 'user.username',
		    align: 'center',
		    valign:'middle',
		    title: '负责人'
		  }, 
		  {
		    field: 'occupantsno',
		    align: 'center',
		    valign:'middle',
		    title: '入住人数'
		  }, 
		  {
		    field: 'dischargesno',
		    align: 'center',
		    valign:'middle',
		    title: '出院人数'
		  }, 
		  {
		    field: 'treatmentrate',
		    align: 'center',
		    valign:'middle',
		    title: '治疗率'
		  }, 
		  {
		    field: 'improvementrate',
		    align: 'center',
		    valign:'middle',
		    title: '好转率'
		  }, 
		  {
		    field: 'unhealedrate',
		    align: 'center',
		    valign:'middle',
		    title: '未愈率'
		  }, 
		  {
		    field: 'mortality',
		    align: 'center',
		    valign:'middle',
		    title: '死亡率'
		  }, 
		  {
		    field: 'diagnosticcoincidence',
		    align: 'center',
		    valign:'middle',
		    title: '诊断符合'
		  }, 
		  {
		    field: 'bedutilizationrate',
		    align: 'center',
		    valign:'middle',
		    title: '床位使用率'
		  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.icuid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.icuid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }]
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
					$("#myUpdateIcuUser").html(optionhtml);
					$("#myAddIcuUser").html(optionhtml);
				}
			}
		})
  
})

//icu表修改的预查询
function myUpdateClick(id) {
	
	//alert("icu的编号:"+id);
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/icu/getIcuById.action",
		 data:{icuid:id},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
		     //data：指后台查询后返回来的用户信息
		     $('#myUpdateModal').modal().on('shown.bs.modal',
				    function() {
		    	  
		    	 //赋值
		    	 $("#myUpdateIcuid").val(data.icuid);
		    	 $("#inputbedno").val(data.bedno);
		    	 $("#inputicuname").val(data.icuname);
		    	 $("#myUpdateIcuUser").val(data.chargeperson);//负责人
		    	 $("#inputoccupantsno").val(data.occupantsno);
		    	 $("#inputdischargesno").val(data.dischargesno);
		    	 $("#inputtreatmentrate").val(data.treatmentrate);
		    	 $("#inputimprovementrate").val(data.improvementrate);
		    	   
		    	 //alert("渲染成功");
		     })
		 }
	})
}
 
//修改
function updateIcu() {
	
	//获取表单中的所有值
	var data = $("#myUpdateForm").serializeArray();
	
	//请求后台，修改数据
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/icu/updateIcuById.action",//根据编号查询用户的信息
		 data:data,//传参数到后台
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

function myDeleteClick(id) {
 
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/icu/deleteById.action",//根据编号查询用户的信息
		 data:{icuid:id},//传参数到后台
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
		  
		 $("#myAddForm")[0].reset();
	  })
})

function trim(str){
 
  	return str.replace(/(^\s*)|(\s*$)/g, "");
 
}

//添加岗位  添加按钮点击事件
function addIcu() {
	
	//alert("dsfsdf");
 
	//获取表单中的所有值
	var data = $("#myAddForm").serializeArray();
	
	var name = trim($("#icuname").val());
	
	//这里就先判断病区名
	if( name==null||name==''){
		swal({
			text: "请填写数据完整！",
			type: "warning",
			confirmButtonText: '重新填写',
			confirmButtonColor: '#f8bb86',
		})
	}else{
		//ajax提交数据
		 $.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/icu/addIcu.action",//根据编号查询用户的信息
		 data:data,//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			  //刷新页面
			  $("#table").bootstrapTable("refresh");
			  //关闭弹框
			  $("#addBtn").click();
			  swal({
					text: "病区添加成功！",
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
                <h4 class="modal-title" id="myModalLabel">病区信息修改</h4>
            </div>
            <div class="modal-body">
            
                  <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传icuid的值  -->
                      <input type="hidden" name="icuid" id="myUpdateIcuid">
                        
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">床位数:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="bedno" id="inputbedno">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">病区名:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="icuname" id="inputicuname">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">负责人:</label>
					    <div class="col-sm-10">
					       <select id="myUpdateIcuUser" class="form-control" name="chargeperson">
					       			
					      </select>	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">入住人数:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control"  name="occupantsno" id="inputoccupantsno">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">出院人数:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="dischargesno" id="inputdischargesno">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">治疗率:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="treatmentrate" id="inputtreatmentrate">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">好转率:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="improvementrate" id="inputimprovementrate">	
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="updateBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateIcu()" type="button" class="btn btn-primary" data-dismiss="modal">修改</button>
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
					    <label for="inputPassword3" class="col-sm-2 control-label">床位数:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="bedno" id="bedno">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">病区名:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="icuname" id="icuname">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">负责人:</label>
					    <div class="col-sm-10">
					       <select id="myAddIcuUser" class="form-control" name="chargeperson">
					       			
					      </select>	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">入住人数:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control"  name="occupantsno" id="occupantsno">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">出院人数:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="dischargesno" id="dischargesno">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">治疗率:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="treatmentrate" id="treatmentrate">	
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">好转率:</label>
					    <div class="col-sm-10">
					       <input type="text" class="form-control" name="improvementrate" id="improvementrate">	
					    </div>
					  </div>
                 </form>
            </div>
            <div class="modal-footer">
                <button type="button" id="addBtn" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="addIcu()" type="button" class="btn btn-primary">添加</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>