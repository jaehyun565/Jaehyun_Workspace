package com.ssafy.mvc.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
	
	public FilterConfig filterConfig;
     
	// 필터 초기화 하는 과정
    public void init(FilterConfig fConfig) throws ServletException {
    	this.filterConfig = fConfig;
    }
	
    // 필터 종료될 때
	public void destroy() {
		
	}

	// 필터 동작 과정
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		///////////////////////서버에 가기 전 필요한 코드 작성
		System.out.println("서블릿 전 1");
		String encoding = this.filterConfig.getInitParameter("encoding");
		request.setCharacterEncoding(encoding);
		// 다음 필터로 전달!!
		// 다음 필터가 없으면 서블릿으로 간닷!
		chain.doFilter(request, response);
		
		/////////////////////사용자에게 가기 전 필요한 코드 작성
		System.out.println("서블릿 후 1");
	}

}
