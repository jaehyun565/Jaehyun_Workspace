package com.ssafy.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class RestCotroller2 {
	// http://localhost:8080/mvx/rest2/test1
	// 에러가 안난다!! 왜? => @RestController를 붙여놔서 알아서 모든 메서드에 
	// responsebody가 붙은 것으로 인식한다
	@GetMapping("/test1")
	public String test1() {
		return "Hello REST API";
	}
}
