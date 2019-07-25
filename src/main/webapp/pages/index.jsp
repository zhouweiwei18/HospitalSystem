<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>控制台</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/plugin/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/plugin/assets/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/plugin/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/plugin/assets/css/ace-rtl.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/plugin/assets/css/ace-skins.min.css" />

<script
	src="${pageContext.request.contextPath }/plugin/assets/js/ace-extra.min.js"></script>

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
						class="icon-leaf"></i> 医院信息管理系统
				</small>
				</a>
			</div>

			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">
					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="/imgeurl/${user.userphoto}"
							alt="Jason's Photo" /> <span class="user-info"> <small>欢迎光临,</small>
								${user.username}
						</span> <i class="icon-caret-down"></i>
					</a>

						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="#"> <i class="icon-cog"></i> 设置
							</a></li>

							<li><a href="#"> <i class="icon-user"></i> 个人资料
							</a></li>

							<li class="divider"></li>

							<li><a href="#"> <i class="icon-off"></i> 退出
							</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
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
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="icon-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="icon-pencil"></i>
						</button>

						<button class="btn btn-warning">
							<i class="icon-group"></i>
						</button>

						<button class="btn btn-danger">
							<i class="icon-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span> <span class="btn btn-info"></span>

						<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
					</div>
				</div>

				<ul class="nav nav-list">
					<li class="active">
						<a href="${pageContext.request.contextPath }/main.jsp"> 
							<i class="icon-dashboard"></i> 
							<span class="menu-text"> 控制台 </span>
						</a>
					</li>

					<c:forEach items="${menuList}" var="one">
						<li>
							<a href="#" class="dropdown-toggle"> 
								<i class="icon-desktop"></i> 
								<span class="menu-text"> ${one.menuName } </span> 
								<b class="arrow icon-angle-down"></b>
						    </a>
							<ul class="submenu">
								<c:forEach items="${one.childMenuPojo}" var="two">
									<li>
									   <a href="#" class="dropdown-toggle" dataUrl="${pageContext.request.contextPath }/${two.menuUrl}">
											<i class="icon-double-angle-right"></i> ${two.menuName} 
											<b class="arrow icon-angle-down"></b>
									   </a>
										<ul class="submenu">
											<c:forEach items="${two.childMenuPojo}" var="three">
												<li>
													<a href="#" dataUrl="${pageContext.request.contextPath }/${three.menuUrl}">
														<i class="icon-leaf"></i> ${three.menuName}
													</a>
												</li>
											</c:forEach>
										</ul> 
									</li>
								</c:forEach>
							</ul>
						</li>
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

			<div class="main-content">
				<div class="page-content">
					<iframe id="menuFrame" name="menuFrame"
						src="${pageContext.request.contextPath }/pages/background.jsp"
						style="overflow: visible;" scrolling="no" frameborder="yes"
						width="100%" height="700"> </iframe>
					<div>
						<hr style="margin-top: -10px;">
						<p class="pull-right">
							Collect from <a href="http://www.cssmoban.com/"
								title="继续支持酒店后台系统" target="_blank">WelCome</a>
						</p>
						<p>
							© 2017 <a href="#" target="_blank">Portnine</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath }/plugin/js/jquery.min.js"></script>

	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='${pageContext.request.contextPath }/plugin/assets/js/jquery-2.0.3.min.js'>"
								+ "<"+"script>");
	</script>

	<script type="text/javascript">
		if ("ontouchend" in document)
			document
					.write("<script src='${pageContext.request.contextPath }/plugin/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"script>");
	</script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/typeahead-bs2.min.js"></script>

	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/jquery.slimscroll.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/jquery.easy-pie-chart.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/flot/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/flot/jquery.flot.pie.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/flot/jquery.flot.resize.min.js"></script>

	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/ace-elements.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/plugin/assets/js/ace.min.js"></script>


	<script type="text/javascript">
		//菜单点击事件
		$(function() {
			$(".submenu li a").click(function() {
				var menuUrl = $(this).attr("dataUrl");
				
				//alert(menuUrl);
				
				//项目名
				//var proName = '${pageContext.request.contextPath }';
				
				//alert(proName);
				
				//防止menuUrl只是单纯的项目名
				if(menuUrl == "/HospitalSystem/"){
					//alert("相等了");
					$("#menuFrame").attr("src", "${pageContext.request.contextPath }/pages/background.jsp");
				}else{
					//alert("不相等");
					$("#menuFrame").attr("src", menuUrl);
				}
				
			});
		});
	</script>
</body>
</html>