package com.ssafy.rest.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.rest.model.dto.User;

@RestController
@RequestMapping("/rest5")
public class RestCotroller5 {
	
	//application/x-www-form-urlencoded
	@PostMapping("/user1")
	public String test1(@ModelAttribute User user) {
		return user.toString();
	}
	
	// json방식으로 보낼때는 requestBody!!
	@PostMapping("/user2")
	public String test2(@RequestBody User user) {
		return user.toString();
	}
	
}
