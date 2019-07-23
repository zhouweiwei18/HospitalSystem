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

/**
 * Servlet Filter implementation class LoginFilter
 */

public class LoginFilter implements Filter {

	FilterConfig config;

	public void destroy() {
		this.config = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 调用该方法过滤器通过验证，不调用打回
		// chain.doFilter(request,response)
		System.out.println("before the login filter!");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		req.setCharacterEncoding("utf-8");// 设置字符集
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=UTF-8");

		String url = req.getRequestURI().toString();// 请求的路径
		HttpSession session = req.getSession(true);

		Object obj = session.getAttribute("user");// 获取session

		// req.getSession().removeAttribute("loginName");

		System.out.println("-----------url-----------" + url);

		if (url.endsWith("login.jsp")||url.endsWith("kaptcha.action")) { // 判断此字符串是否是以指定的后缀结束

			chain.doFilter(request, response);// 对拦截的资源放行

		} else if (url.contains("login")) { // 判断当此字符串是否包含指定值，返回true

			chain.doFilter(request, response);// 对拦截的资源放行

		} else if (obj != null) { // 获取当前的session不为空时
			//当用户这个时候要请求index.jsp页面时，需要重定向到login登录方法
			//分配用户菜单
			if(url.endsWith("index.jsp")) {
				res.sendRedirect(req.getContextPath() + "/login.action"); // 重定向
			}

			chain.doFilter(request, response);// 对拦截的资源放行

		} else { // if (null == obj || ((String) obj).length() == 0)

			System.out.println("after the login filter!");

			res.sendRedirect(req.getContextPath() + "/login.jsp"); // 重定向
		}
	}

	public void init(FilterConfig config) throws ServletException {

		System.out.println("begin do the login filter!");

		this.config = config;
	}
}
