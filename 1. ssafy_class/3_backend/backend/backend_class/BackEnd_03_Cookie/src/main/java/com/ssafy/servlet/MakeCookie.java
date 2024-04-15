package com.ssafy.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MakeCookie extends HttpServlet{
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		
		//쿠키를 생성하자!
		Cookie cookie = new Cookie(key, value);
		
		// setMaxAge : 유효시간 만료, 초단위임.
		// 쿠키는 remove나 delete메서드가 따로 없음. 
		// 쿠키를 없애고 싶으면 해당 쿠키를 가져와서 setMaxAge를 0으로 만들어 줘야
		cookie.setMaxAge(60); 
		
		// 사용자에게 이 쿠키를 다시 돌려줘야 한다.
		resp.addCookie(cookie);
		
		resp.sendRedirect(req.getContextPath()+"/02_CookieResult.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
