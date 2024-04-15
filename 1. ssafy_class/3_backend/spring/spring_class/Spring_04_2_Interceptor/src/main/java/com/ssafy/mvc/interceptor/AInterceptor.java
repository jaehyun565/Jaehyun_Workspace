package com.ssafy.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Interceptor는 HandlerInterceptor를 구현
public class AInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// boolean형태의 반환타입 -> true면 진행, false면 종료
		// 정상 수행 후 실행, 예외 발생 시 미실행.
		System.out.println("A : preHandle");
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("A : postHandle");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// View가 전달된 후 실행 => 무조건 실횅되며, 예외 미 발생시 객체는 null로 초기화
		System.out.println("A : afterCompletion");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
