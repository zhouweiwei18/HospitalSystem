package com.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.entity.User;

public class LoginFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		// 获得session中用户名
		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("user");

		String url = request.getRequestURI().toString();

		// 非法用户
		if (!url.endsWith("login.jsp") && !url.endsWith("userLogin.action")&& !url.endsWith("kaptcha.action")) {
			if (user == null) {
				//String loginInfo ="/HospitalSystem/login/login.jsp";
				response.sendRedirect(request.getRequestURI()+"/login/login.jsp");
			} else {
				// 不过滤 放行
				chain.doFilter(request, response);
			}
		} else {
			// 不过滤
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}
