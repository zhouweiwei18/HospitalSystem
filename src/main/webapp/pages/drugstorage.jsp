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
		  url: '${pageContext.request.contextPath}/DrugStorage/getAllDrugStorage.action',//访问后台（json）的地址
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
		    field: 'drugstorageid',//字段名称    对应json中的key
		    align: 'center',
		    valign:'middle',
		    title: '编号'
		  }, {
		    field: 'category',
		    align: 'center',
		    valign:'middle',
		    title: '目录'
		  }, {
			  field: 'area',
			    align: 'center',
			    valign:'middle',
			    title: '面积'
		  }, {
			    field: 'user.username',
			    align: 'center',
			    valign:'middle',
			    title: '负责人名称'
			    	
			  }
			  ]
		})
  })
  

</script>
</body>
</html>