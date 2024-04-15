package com.ssafy.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// 로그인 페이지로
	@GetMapping("/login")
	public String loginfForm() {
		return "/user/loginform";
	}

	// 로그인하기
	@PostMapping("/login")
	// public String login(@RequestParam("id") String id, @RequestParam("password") String password) {
	public String login(@ModelAttribute User user, HttpSession session) {
		User tmp = userService.login(user.getId(), user.getPassword());
		// tmp에 들어갈 수 있는 값은?
		// 1. 로그인이 실패한다면 > null 반환
		if(tmp == null) {
			return "redirect:login";
		}
		// 2. 실제로 로그인 잘 되었다면? > 유저 객체가 반환되어 사용할 수 있음
		// 로그인이 잘 됐으면 세션영역에 데이터를 전해줄거고, 이름정도만 전해준다고 생각해보자
		session.setAttribute("loginUser", tmp.getName());
		return "redirect:list";
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:list";
	}
	
	//유저등록
	@GetMapping("/signup")
	public String signupForm() {
		return "/user/signupform";
	}
	
	@PostMapping("/signup")
	public String signup(@ModelAttribute User user) {
		userService.signup(user);
		// 회원가입 축하페이지, 로그인페이지, 메인페이지 등으로 이동할 수 있음
		return "redirect:login";
	}
	
	@GetMapping("/users")
	public String userList(Model model) {
		model.addAttribute("userList", userService.getUserList());
		return "/user/adminPage";
	}
	
	
	
	

}
