package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainCotroller {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(HttpSession session, @RequestParam("id") String id, @RequestParam("password") String password ) {
		
		// UserService라는 것을 만들어서 호출하는 게 원래 맞음
		if(id.equals("ssafy") && password.equals("1234")) {
			// 로그인 성공!!
			session.setAttribute("id", id);
//			return "index"; // 포워딩 방식
			return "redirect:/";
		}
		// 로그인에 실패했다면
		return "redirect:/login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return"redirect:/";
	}
	
	@GetMapping("/regist")
	public String regsitForm() {
		return "regist";
	}
	
	
	
}
