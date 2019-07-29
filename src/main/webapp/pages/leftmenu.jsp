<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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