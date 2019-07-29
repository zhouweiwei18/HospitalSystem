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

<table id="table">

</table>

<script type="text/javascript">
  $(function(){
	  $('#table').bootstrapTable({
		  url: '${pageContext.request.contextPath}/position/queryPositionDept.action',//访问后台（json）的地址
		  pagination: true,//允许分页
		  search: true,//可以搜索
		  pageSize:3,//每页显示3条数据
		  pageList:[2,3,5,8,10],//每页显示的条数列表
		  showColumns:true,//选择显示的列
		  showRefresh:true,//允许刷新
		  showExport:true,//允许导出
		  exportDataType:'all',
		  exportTypes:['txt','doc','excel'],
		  columns: [
		  {
		    field: 'postnumber',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
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
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  
					  //var updateButton = "<button  onclick=\"myUpdateClick("+row.poId+")\" type=\"button\" class=\"btn btn-success\">修改</button>";
					  //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.poId+")\" type=\"button\" class=\"btn btn-success\">分配权限</button>";
					  //var deleteButton = "<button type=\"button\" class=\"btn btn-success\">删除</button>";
					  return updateButton+authorityButton+deleteButton;
				  }
			  }]
		})
  })
  
//分配权限事件
function myAuthorityClick(poId){
	  //alert(poId);
	 
	  $('#myAuthorityModal').modal().on('shown.bs.modal',
			    function() {
		  
			  var zTreeObj;
			   
			   // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
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

</script>

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
                         <ul id="treeDemo" class="ztree"></ul>
                  </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button onclick="updateUser()" type="button" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>
 
</body>
</html>