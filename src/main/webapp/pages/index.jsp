<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>苏微医院</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- basic styles -->
<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/ace-rtl.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/ace-skins.min.css" />

<!-- 下面是table的css(分页) -->
<link href="${pageContext.request.contextPath}/plugin/css/bootstrap-theme.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/plugin/css/bootstrap-table.css" rel="stylesheet"> 
 
<script
	src="${pageContext.request.contextPath}/assets/js/ace-extra.min.js"></script>
</head>
 
<body>

	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand"> <small> <i
						class="icon-leaf"></i> 苏微医院
				</small>
				</a>
				<!-- /.brand -->
			</div>
			<!-- /.navbar-header -->

			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">


					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="${pageContext.request.contextPath}/assets/avatars/user.jpg"
							alt="Jason's Photo" /> <span class="user-info"> <small>欢迎光临,</small>
								ADMIN
						</span> <i class="icon-caret-down"></i>
					</a>

						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="#"> <i class="icon-cog"></i> 设置
							</a></li>

							<li><a href="#"> <i class="icon-user"></i> 个人资料
							</a></li>

							<li class="divider"></li>

							<!-- <li><a href="#"> <i class="icon-off"></i> 退出 -->
							<li>
								<a href="javascript:void(0);" onclick="loginClick()"> <i class="icon-off"></i>退出</a>
							</li>
						</ul></li>
				</ul>
				<!-- /.ace-nav -->
			</div>
			<!-- /.navbar-header -->
		</div>
		<!-- /.container -->
	</div>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>
	
		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> <span
				class="menu-text"></span>
			</a>
			
			 
			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'fixed')
					} catch (e) {
					}
				</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span> <span class="btn btn-info"></span>

						<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
					</div>
				</div>
				<!-- #sidebar-shortcuts -->

				<ul class="nav nav-list">
					<li class="active"><a href="index.html"> <i
							class="icon-dashboard"></i> <span class="menu-text">
								苏微医院控制台 </span>
					</a></li>
					
					<c:forEach items="${menuList }" var="one">
						<li><a href="#" class="dropdown-toggle"> 
							<i class="icon-desktop"></i> 
								<span class="menu-text"> ${one.menuName }</span> 
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<c:forEach items="${one.childMenuPojo}" var="two">
									<li><a href="" class="dropdown-toggle"  id="" onclick="showEmps(${two.menuId})">
											<i class="icon-double-angle-right"></i> ${two.menuName} 
											<b class="arrow icon-angle-down"></b>
										</a>
										<ul class="submenu">
											<c:forEach items="${two.childMenuPojo}" var="three">
												<li><a
													dataUrl="${pageContext.request.contextPath }/${three.menuUrl}">
														<i class="icon-leaf"></i> ${three.menuName}
												</a></li>
											</c:forEach>
										</ul>
									</li>
								</c:forEach>
							</ul></li>
					</c:forEach>
				 </ul> 
					   
				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left"
						data-icon1="icon-double-angle-left"
						data-icon2="icon-double-angle-right"></i>
				</div>

				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'collapsed')
					} catch (e) {
					}
				</script>
			</div>

			<div class="main-content" style="height: 600px">
				
				<!-- 修改的模态框 -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				    <div class="modal-dialog">
				        <div class="modal-content">
				            <div class="modal-header">
				                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				                <h4 class="modal-title" id="myModalLabel">Edit Employee Information</h4>
				            </div>
				            <div class="modal-body">
								<form id="updateForm">
									 
									 <input name="userid" id="userid" style="display: none;" value=""> 
								  <div class="form-group">
								    <label for="exampleInputEmail1">username</label>
								    <input type="email" class="form-control" id="username" name="username" placeholder="Email">
								  </div>
								  
								  <div class="form-group">
								    <label for="exampleInputEmail1">password</label>
								    <input type="email" class="form-control" id="password" name="userpwd" placeholder="Email">
								  </div>
								  
								  <div class="form-group">
								    <label for="exampleInputEmail1">sex</label>
								    <input type="email" class="form-control" id="sex" name="usersex" placeholder="Email">
								  </div>
								  
								  <div class="form-group">
								    <label for="exampleInputEmail1">departmentname</label>
								    <!-- <input type="email" class="form-control" id="postname" placeholder="Email"> -->
								    <select id="departmentSelect" name="departmentname">  
								    	
								    </select>
								  </div>
								  
								</form>
							</div>
				            <div class="modal-footer">
				                <button type="button" class="btn btn-default" id="closeBut" data-dismiss="modal">关闭</button>
				                <button type="button" class="btn btn-primary" id="submitForm">提交更改</button>
				            </div>
				        </div>
				    </div>
				</div>
				 
 
				<!-- 这是现实所有员工信息的table(bootstrap-table) -->
				<div style="float: left;width: 1350px;height: 100px" id="tableId">
					<!-- <table id="table">
					</table> -->
				</div>
				 
			</div>
			<!-- /.main-content -->

			<div class="ace-settings-container" id="ace-settings-container">
				<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
					id="ace-settings-btn">
					<i class="icon-cog bigger-150"></i>
				</div>

				<div class="ace-settings-box" id="ace-settings-box">
					<div>
						<div class="pull-left">
							<select id="skin-colorpicker" class="hide">
								<option data-skin="default" value="#438EB9">#438EB9</option>
								<option data-skin="skin-1" value="#222A2D">#222A2D</option>
								<option data-skin="skin-2" value="#C6487E">#C6487E</option>
								<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
							</select>
						</div>
						<span>&nbsp; 选择皮肤</span>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-navbar" /> <label class="lbl"
							for="ace-settings-navbar"> 固定导航条</label>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-sidebar" /> <label class="lbl"
							for="ace-settings-sidebar"> 固定滑动条</label>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-breadcrumbs" /> <label class="lbl"
							for="ace-settings-breadcrumbs">固定面包屑</label>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-rtl" /> <label class="lbl"
							for="ace-settings-rtl">切换到左边</label>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-add-container" /> <label class="lbl"
							for="ace-settings-add-container"> 切换窄屏 <b></b>
						</label>
					</div>
				</div>
			</div>
			<!-- /#ace-settings-container -->
		</div>
		<!-- /.main-container-inner -->
			

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="icon-double-angle-up icon-only bigger-110"></i>
		</a>
		
		
	</div>
  
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
 

	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='${pageContext.request.contextPath}/assets/js/jquery-2.0.3.min.js'>"
								+ "<"+"script>");
	</script>
 
	<script type="text/javascript">
		if ("ontouchend" in document)
			document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"script>");
	</script>
	<script
		src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/typeahead-bs2.min.js"></script>
 
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.easy-pie-chart.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/flot/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/flot/jquery.flot.pie.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/flot/jquery.flot.resize.min.js"></script>

	<!-- ace scripts -->
	<script
		src="${pageContext.request.contextPath}/assets/js/ace-elements.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/ace.min.js"></script>
	
	<!-- boostraptable -->
	<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/jquery.min.js"></script> --%>
	<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/bootstrap3.3.7.min.js"></script> --%>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/bootstrap-table.js"></script>
	<!-- 导出excel、pdf文件 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/export/bootstrap-table-export.js"></script>
	<script src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/pdfmake/pdfmake.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/pdfmake/vfs_fonts.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/FileSaver/FileSaver.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/jsPDF/jspdf.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/libs/jsPDF-AutoTable/jspdf.plugin.autotable.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/tableExport/tableExport.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/plugin/js/jquery.serializejson.min.js"></script>

	<!-- inline scripts related to this page -->
	<script type="text/javascript">
	jQuery(function($) {
		$('.easy-pie-chart.percentage')
				.each(
						function() {
							var $box = $(this).closest('.infobox');
							var barColor = $(this).data('color')
									|| (!$box.hasClass('infobox-dark') ? $box
											.css('color')
											: 'rgba(255,255,255,0.95)');
							var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)'
									: '#E2E2E2';
							var size = parseInt($(this).data('size')) || 50;
							$(this)
									.easyPieChart(
											{
												barColor : barColor,
												trackColor : trackColor,
												scaleColor : false,
												lineCap : 'butt',
												lineWidth : parseInt(size / 10),
												animate : /msie\s*(8|7|6)/
														.test(navigator.userAgent
																.toLowerCase()) ? false
														: 1000,
												size : size
											});
						})

		$('.sparkline').each(
				function() {
					var $box = $(this).closest('.infobox');
					var barColor = !$box.hasClass('infobox-dark') ? $box
							.css('color') : '#FFF';
					$(this).sparkline('html', {
						tagValuesAttribute : 'data-values',
						type : 'bar',
						barColor : barColor,
						chartRangeMin : $(this).data('min') || 0
					});
				});

		var placeholder = $('#piechart-placeholder').css({
			'width' : '90%',
			'min-height' : '150px'
		});
		var data = [ {
			label : "social networks",
			data : 38.7,
			color : "#68BC31"
		}, {
			label : "search engines",
			data : 24.5,
			color : "#2091CF"
		}, {
			label : "ad campaigns",
			data : 8.2,
			color : "#AF4E96"
		}, {
			label : "direct traffic",
			data : 18.6,
			color : "#DA5430"
		}, {
			label : "other",
			data : 10,
			color : "#FEE074"
		} ]
		function drawPieChart(placeholder, data, position) {
			$.plot(placeholder, data, {
				series : {
					pie : {
						show : true,
						tilt : 0.8,
						highlight : {
							opacity : 0.25
						},
						stroke : {
							color : '#fff',
							width : 2
						},
						startAngle : 2
					}
				},
				legend : {
					show : true,
					position : position || "ne",
					labelBoxBorderColor : null,
					margin : [ -30, 15 ]
				},
				grid : {
					hoverable : true,
					clickable : true
				}
			})
		}
		drawPieChart(placeholder, data);

		/**
		we saved the drawing function and the data to redraw with different position later when switching to RTL mode dynamically
		so that's not needed actually.
		 */
		placeholder.data('chart', data);
		placeholder.data('draw', drawPieChart);

		var $tooltip = $(
				"<div class='tooltip top in'><div class='tooltip-inner'></div></div>")
				.hide().appendTo('body');
		var previousPoint = null;

		placeholder.on('plothover', function(event, pos, item) {
			if (item) {
				if (previousPoint != item.seriesIndex) {
					previousPoint = item.seriesIndex;
					var tip = item.series['label'] + " : "
							+ item.series['percent'] + '%';
					$tooltip.show().children(0).text(tip);
				}
				$tooltip.css({
					top : pos.pageY + 10,
					left : pos.pageX + 10
				});
			} else {
				$tooltip.hide();
				previousPoint = null;
			}

		});

		var d1 = [];
		for (var i = 0; i < Math.PI * 2; i += 0.5) {
			d1.push([ i, Math.sin(i) ]);
		}

		var d2 = [];
		for (var i = 0; i < Math.PI * 2; i += 0.5) {
			d2.push([ i, Math.cos(i) ]);
		}

		var d3 = [];
		for (var i = 0; i < Math.PI * 2; i += 0.2) {
			d3.push([ i, Math.tan(i) ]);
		}

		var sales_charts = $('#sales-charts').css({
			'width' : '100%',
			'height' : '220px'
		});
		$.plot("#sales-charts", [ {
			label : "Domains",
			data : d1
		}, {
			label : "Hosting",
			data : d2
		}, {
			label : "Services",
			data : d3
		} ], {
			hoverable : true,
			shadowSize : 0,
			series : {
				lines : {
					show : true
				},
				points : {
					show : true
				}
			},
			xaxis : {
				tickLength : 0
			},
			yaxis : {
				ticks : 10,
				min : -2,
				max : 2,
				tickDecimals : 3
			},
			grid : {
				backgroundColor : {
					colors : [ "#fff", "#fff" ]
				},
				borderWidth : 1,
				borderColor : '#555'
			}
		});

		$('#recent-box [data-rel="tooltip"]').tooltip({
			placement : tooltip_placement
		});
		function tooltip_placement(context, source) {
			var $source = $(source);
			var $parent = $source.closest('.tab-content')
			var off1 = $parent.offset();
			var w1 = $parent.width();

			var off2 = $source.offset();
			var w2 = $source.width();

			if (parseInt(off2.left) < parseInt(off1.left)
					+ parseInt(w1 / 2))
				return 'right';
			return 'left';
		}

		$('.dialogs,.comments').slimScroll({
			height : '300px'
		});

		//Android's default browser somehow is confused when tapping on label which will lead to dragging the task
		//so disable dragging when clicking on label
		var agent = navigator.userAgent.toLowerCase();
		if ("ontouchstart" in document && /applewebkit/.test(agent)
				&& /android/.test(agent))
			$('#tasks').on('touchstart', function(e) {
				var li = $(e.target).closest('#tasks li');
				if (li.length == 0)
					return;
				var label = li.find('label.inline').get(0);
				if (label == e.target || $.contains(label, e.target))
					e.stopImmediatePropagation();
			});

		$('#tasks').sortable({
			opacity : 0.8,
			revert : true,
			forceHelperSize : true,
			placeholder : 'draggable-placeholder',
			forcePlaceholderSize : true,
			tolerance : 'pointer',
			stop : function(event, ui) {//just for Chrome!!!! so that dropdowns on items don't appear below other items after being moved
				$(ui.item).css('z-index', 'auto');
			}
		});
		$('#tasks').disableSelection();
		$('#tasks input:checkbox').removeAttr('checked').on('click',
				function() {
					if (this.checked)
						$(this).closest('li').addClass('selected');
					else
						$(this).closest('li').removeClass('selected');
				});

	})
	
	
	/* 下面手动添加的代码 */
    function showEmps(id) {
		
		if(id==7){
			//alert("这是员工");
			//往员工表格所在div写入一个表格
			var tab = "<table id='table'></table>";
			
			$("#tableId").append(tab);
			
			window.operateEvents = {
				    'click.btnEditPicGroupDetail': function (e, value, row, index) {
				       alert(row.qxxh);
				       $("#myModal").modal('show');
				     }
			};
			
			$('#table').bootstrapTable({
				  url: '${pageContext.request.contextPath}/user/getUser.action',//访问后台（json）的地址
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
				    field: 'userid',//字段名称    对应json中的key
				    title: '编号',
				    align: 'center',
				    width:100
				  }, 
				  {
				    field: 'username',
				    width:200,
				    align: 'center',
				    title: '姓名'
				  }, 
				  {
					    field: 'userpwd',
					    width:200,
					    align: 'center',
					    title: '密码'
				  }, 
				  {
				    field: 'userphoto',
				    width:200,
				    align: 'center',
				    title: '头像',
				    formatter:function(value,row,index){
				    	//value:值   row：行      index:索引
				    	var imageUrl = '<img alt="" src="/imgeurl/'+row.userphoto+'" width="50" height="50">';
				    	return imageUrl;
				    }
				  }, 
				  {
					    field: 'usersex',
					    width:100,
					    align: 'center',
					    title: '性别'
				  }, 
				  {
					  field:'usercard',
					  title:'身份证',
					  align: 'center',
					  width:200
				  },
				  {
					    field: 'postid',
					    width:200,
					    align: 'center',
					    title: '职位id'
				  }, 
				  {
			            field: 'operate',
			            title: '操作',
			            align: 'center',
			            width: '200px',
			            //events: operateEvents,
			            formatter: operateFormatter
			        },
				  ]
				})
		}else{
			
			$("#tableId").empty();
			
		}
	}
	
	function updateButt(id){
		
		$('#myModal').modal().on('shown.bs.modal',
			 function() {
			  
			  	$.ajax({
		    	    type:"post", //请求方式
		    	    url:"${pageContext.request.contextPath}/department/getAllDepartment.action", //请求路径
		    	    async: false,
		    	    data:{},
		    	    traditional: true,//加上这个就可以传数组
		    	    dataType : 'json', 
		    	    success:function(data){
		    	    	//alert("department数据返回了");
		    	    	//获取select
		    	    	var dar = $("#departmentSelect");
		    	    	dar.empty();
		    	    	//遍历List<Department>
						 $.each(data, function(i, item) {
							//alert(item.departmentId);
							//alert(item.departmentname);
							var op = "<option id="+item.departmentid+" value="+item.departmentname+">"+item.departmentname+"</option>";
							dar.append(op);
							//alert(data.dList[i].departmentname;);
						});
		    	    	
		    	    },
					error : function(data) {
						alert("error");
					}
		        })
			   
			  
			    $.ajax({
		    	    type:"post", //请求方式
		    	    url:"${pageContext.request.contextPath}/user/getUserById.action", //请求路径
		    	    async: false,
		    	    data:{   	
		    	    	"id":id,
		    	    },
		    	    traditional: true,//加上这个就可以传数组
		    	    dataType : 'json', 
		    	    success:function(data){
		    	    	//alert(data.username);
		    	    	//数据填充到修改表单
		    	    	//获取表单给表单清空
		    	    	$("#username").attr("value",data.username);
		    	    	$("#password").attr("value",data.userpwd);
		    	    	$("#sex").attr("value",data.usersex);
		    	    	$("#userid").attr("value",data.userid);
		    	    	$("#departmentSelect option[id="+data.departmentid+"]").attr("selected", true);
		    	    },
					error : function(data) {
						alert("error");
						//$("#updateForm").reset();
					}
		        });
			  	  
		})

	}
	 
	function operateFormatter(value, row, index) {
		
	    return [
	        '<div class="btn-group">',
	        '<button id="btnEditPicGroupDetail1" type="button" onclick="updateButt('+row.userid+')" class="btn btn-default"  singleSelected=true>修改</button>',
	        '<button id="btnEditPicGroupDetail2" type="button" class="btn btn-default"  singleSelected=true>删除</button>',
	        '</div>'
	    ].join('');
	}
	
	$(".nav-list .submenu ul a").click(function() {
			var menuUrl = $(this).attr("dataUrl");
			$("#menuFrame").attr("src", menuUrl);
	});
	
	$("#imgObj").click(function(){
	   $(this).attr("src","${pageContext.request.contextPath}/kaptcha.action");
   	})
   	
   	
	$("#submitForm").click(function(){
	    
		var username = $("#username").val();
		var password = $("#password").val();
		var sex = $("#sex").val();
		var userid = $("#userid").val();
		var departmentname = $('#departmentSelect option:selected').val();
  
		$.ajax({
    	    type:"post", //请求方式
    	    url:"${pageContext.request.contextPath}/user/updateUserById.action", //请求路径
    	    async: false,
    	    data:
				{
    	    		"userid":userid,
    	    		"username":username,
    	    		"userpwd":password,
    	    		"usersex":sex,
    	    		"departmentname":departmentname
				},
    	    traditional: true,//加上这个就可以传数组
    	    dataType : 'json', 
    	    success:function(data){
    	    	//alert("成功了！");
    	    	//关闭窗体
    	    	$("#closeBut").click();
    	    	
    	    	//重新查询员工信息
    	    	$("#table").bootstrapTable('refresh');
    	    	//showEmps(userid);
    	    },
			error : function(data) {
				alert("error");
			}
        })
		 
   	})
	</script>
</body>
</html>