package com.ssafy.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.rest.model.dto.User;

@Controller
@RequestMapping("/rest1")
public class RestCotroller1 {
	// http://localhost:8080/mvx/rest1/test1 --> 404가 떴네?!
	// 뷰 리졸버에게 Hello REST API1이 뷰네임으로 넘어가서 그럼
	@GetMapping("/test1")
	public String test1() {
		return "Hello REST API";
	}
	
	// http://localhost:8080/mvx/rest1/test2
	// @responsebody를 붙이면?!-> 뷰리졸버에게 넘기지 않고 해당 반환값 자체를 클라이언트에게 줌
	@GetMapping("/test2")
	@ResponseBody
	public String test2() {
		return "Hello REST API2";
	}
	
	// http://localhost:8080/mvx/rest1/test3
	// map을 바로 반환해보기!
	@GetMapping("/test3")
	@ResponseBody
	public Map<String, String> test3() {
		Map<String, String> map = new HashMap<>();
		map.put("id", "ssafy");
		map.put("name", "Yang");
		map.put("password", "1234");
		// map이면 key-value인데 JSON 형태로 알잘딱으로 바꿔주면 좋은데.. 안되고 에러남
		// 이를 해결하기 위해 Jacson Databind라는 것을 사용해서 해결
		// Jackson 을 메이븐 추가해줬더니 된다!
		
		return map;
	}
	
	// http://localhost:8080/mvx/rest1/test4
	// DTO객체를 반환해보자 => map과 마찬가지로 jackson이 알아서 json으로 바꿔줌!
	@GetMapping("/test4")
	@ResponseBody
	public User test4() {
		User user = new User("ssafy1", "1234","김재현");
		return user;
	
	}
	
	// http://localhost:8080/mvx/rest1/test5
	// User 전체 조회
	@GetMapping("/test5")
	@ResponseBody
	public List<User> test5() {
		List<User> list = new ArrayList<>();
		
		list.add(new User("admin", "admin","admin"));
		list.add(new User("kebin", "1357","케빈"));
		list.add(new User("lion", "234","라이언"));
		list.add(new User("odin", "asdf","오딘"));
		list.add(new User("torr", "gaja","토르"));
		
		return list;		
	}
	
	
}
