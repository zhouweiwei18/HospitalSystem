<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/sweeteralert/css/mui.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugin/sweeteralert/css/sweetalert2.min.css" />
<%@ include file="/common/commoncss.jsp" %>
<%@ include file="/common/commonjs.jsp" %>



<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/sweeteralert/js/sweetalert2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/sweeteralert/js/es6-promise.min.js"></script>
<script src="${pageContext.request.contextPath}/plugin/sweeteralert/js/mui.min.js"></script>
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
		  url: '${pageContext.request.contextPath}/supplier/getAllsupplier.action',//访问后台（json）的地址
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
		    field: 'supplierid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    title: '编号'
		  }, {
		    field: 'name',
		    align: 'center',
		    valign:'middle',
		    title: '供应商名称'
		  }, {
			  field: 'address',
			    align: 'center',
			    valign:'middle',
			    title: '供应商地址'
		  }, {
			    field: 'tel',
			    align: 'center',
			    valign:'middle',
			    title: '供应商电话'
			    	
			  },{
				  
				  field: 'creditsituation',
				    align: 'center',
				    valign:'middle',
				    title: '供应商信用'
			  },{ 
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  data-toggle=\"modal\"  data-target=\"#myupdateModal\" onclick=\"myUpdateClick("+row.supplierid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  var deleteButton = "<button  onclick=\"myDeleteClick("+row.supplierid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
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
  
  
  //通过id  获取信息 并赋值给模态框
 function myUpdateClick(supplierid) { 
	//alert(supplierid);
	var supplierid = supplierid;
	
	$.ajax({
		 type:"post",//请求方式
		 url:"${pageContext.request.contextPath}/supplier/selectSupplierByid.action",//根据供应商id  修改  isDelete
		 data:{supplierid:supplierid},//传参数到后台
		 dataType:"json",//以json格式传递数据
		 success:function(data){
			 
			 $("#supplierid").val(data.supplierid);
			 $("#name").val(data.name);
			 $("#address").val(data.address);
			 $("#tel").val(data.tel);
			 $("#creditsituation").val(data.creditsituation);
			 $("#isdelete").val(data.isdelete);
			 
			}
	})
}
  
  function myDeleteClick(supplierid){
	  
	  var supplierid=supplierid;
	  $.ajax({
			 type:"post",//请求方式
			 url:"${pageContext.request.contextPath}/supplier/delSupplierByid.action",//根据供应商id  修改  isDelete
			 data:{supplierid:supplierid},//传参数到后台
			 dataType:"json",//以json格式传递数据
			 success:function(data){
				 
				 location.reload(true);
				 
				}
		})
	  
	  
  }
  
  //修改用户信息
  function updatebtn(){
	  
	
	  
	  var data = $("#myUpdateForm").serializeArray();
	  
		$.ajax({
			 type:"post",//请求方式
			 url:"${pageContext.request.contextPath}/supplier/updatesupplier.action",//根据供应商id  修改  isDelete
			 data:data,//传参数到后台
			 dataType:"json",//以json格式传递数据
			 success:function(data){
				  
				 location.reload(true);

				}
		})
  }

</script>


<!--修改 Modal -->
<div class="modal fade" id="myupdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
        <form id="myUpdateForm" class="form-horizontal">
                      <!-- 隐藏框传userid的值 -->
                      <input type="hidden"  name="supplierid" id="supplierid">
                      <input type="hidden"  name="isdelete" id="isdelete">
                      
					  <div class="form-group">
					    <label for="name" class="col-sm-2 control-label">用户名:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="name" class="form-control" id="name" placeholder="请输入用户名">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="address" class="col-sm-2 control-label">地址:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="address" id="address" placeholder="请输入地址">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="tel" class="col-sm-2 control-label">号码:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="tel" id="tel" placeholder="请输入号码">
					    </div>
					  </div>
					   <div class="form-group">
					    <label for="creditsituation" class="col-sm-2 control-label">信用:</label>
					    <div class="col-sm-10">
					      <select class="form-control" value="creditsituation" name="creditsituation">
					         <option  value="优秀">优秀</option>
					         <option  value="良好">良好</option>
					         <option  value="差">差</option>
					      </select>
					    </div>
					  </div>
					
                 </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" onclick="updatebtn()">Save changes</button>
      </div>
    </div>
  </div>
</div>

<!--添加 Modal -->
<div class="modal fade" id="myAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
        <form id="myaddForm" class="form-horizontal">

					  <div class="form-group">
					    <label for="name" class="col-sm-2 control-label">用户名:</label>
					    <div class="col-sm-10">
					      <input type="text"  name="name" class="form-control" id="name" placeholder="请输入用户名">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="address" class="col-sm-2 control-label">地址:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="address" id="address" placeholder="请输入地址">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="tel" class="col-sm-2 control-label">号码:</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="tel" id="tel" placeholder="请输入号码">
					    </div>
					  </div>
					   <div class="form-group">
					    <label for="creditsituation" class="col-sm-2 control-label">信用:</label>
					    <div class="col-sm-10">
					      <select class="form-control" value="creditsituation" name="creditsituation">
					         <option  value="优秀">优秀</option>
					         <option  value="良好">良好</option>
					         <option  value="差">差</option>
					      </select>
					    
					    </div>
					  </div>
					  <div class="form-group">
					   
					    <div class="col-sm-10">
					      <input type="hidden" class="form-control" name="isdelete" id="isdelete" value="1">
					    </div>
					  </div>
					
                 </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" onclick="addsupp()">Save changes</button>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript">

	
	function  addsupp(){
		  var data = $("#myaddForm").serializeArray();
			$.ajax({
				 type:"post",//请求方式
				 url:"${pageContext.request.contextPath}/supplier/addsupplier.action",//根据供应商id  修改  isDelete
				 data:data,//传参数到后台
				 dataType:"json",//以json格式传递数据
				 success:function(data){
					 location.reload(true);
					}
			})
		
	}

</script>
</body>
</html>