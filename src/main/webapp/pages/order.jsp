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
		  url: '${pageContext.request.contextPath}/order/getAllorder.action',//访问后台（json）的地址
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
		    field: 'orderid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    title: '编号'
		  }, {
		    field: 'supplier.name',
		    align: 'center',
		    valign:'middle',
		    title: '供应商名称'
		  }, {
			    field: 'orderdetails.drugs.drugsname',
			    align: 'center',
			    valign:'middle',
			    title: '药品名称'
			  
		  },{
			  field: 'orderdetails.drugamount',
			    align: 'center',
			    valign:'middle',
			    title: '订货数量'
		  }, {
			    field: 'orderdate',
			    align: 'center',
			    valign:'middle',
			    title: '订货日期'
			    	
			  },{
				  
				  field: 'deliverydate',
				    align: 'center',
				    valign:'middle',
				    title: '交货日期'
			  },{
				    field: 'user.username',
				    align: 'center',
				    valign:'middle',
				    title: '负责人名称'
			  },{
				  title:'操作',
				  align: 'center',
				  valign:'middle',
				  formatter:function(value,row,index){
					  var updateButton = "<button  onclick=\"myUpdateClick("+row.drugsid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-edit\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  //var authorityButton = "<button  onclick=\"myAuthorityClick("+row.userid+")\" type=\"button\" class=\"btn btn-link\"> <span class=\"glyphicon glyphicon-lock\" style=\"color: rgb(0, 0, 60);\"> </span></button>";
					  var deleteButton = "<button onclick=\"myDeleteClick("+row.drugsid+")\" type=\"button\" class=\"btn btn-link\"><span class=\"glyphicon glyphicon-trash\" style=\"color: rgb(0, 0, 60); font-size: 17px;\"> </span></button>";
					  return updateButton+deleteButton;
				  }
			  }
			  ]
		})
  })
  

</script>
</body>
</html>