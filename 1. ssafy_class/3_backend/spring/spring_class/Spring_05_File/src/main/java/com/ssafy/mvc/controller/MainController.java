package com.ssafy.mvc.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {
	
	// file이나 class경로 등 리소스를 로드하는데 사용하는 인터페이스
	private final ResourceLoader resourceLoader;
	
	public MainController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/singleFileForm")
	public String singleFileForm() {
		return "singleFileForm";
	}

	@PostMapping("/singleFileUpload")
	public String singleFileUpload(@RequestParam("file") MultipartFile file, Model model) throws IllegalStateException, IOException {
		// 파일 있는지 검사, 용량이 없으면 등록하지 않겠다.
		if (file != null && file.getSize() > 0) {
			String fileName = file.getOriginalFilename();
			
			System.out.println(fileName);
			// resources/upload라는 경로에 fileName이라는 이름으로 파일을 저장하겠다.
			Resource resource = resourceLoader.getResource("resources/upload");
			file.transferTo(new File(resource.getFile(), fileName));
			model.addAttribute("fileName", fileName);			
		}
		return "result";
	}
	
		
	@GetMapping("/download")
	public String download(@RequestParam("fileName") String fileName, Model model) {
		model.addAttribute("fileName", fileName);
		return "fileDownloadView";
	}
	

}
