package com.ssafy.board.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.ssafy.board.interceptor.AdminPageInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Value("${spring.mvc.view.prefix}")
	private String prefix;
	@Value("${spring.mvc.view.suffix}")
	private String suffix;
	
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		// 위에처럼 설정 안 가져오고 직접 작성해도 됨
		resolver.setPrefix(prefix);
		resolver.setSuffix(suffix);
		
		// 작성 안해도 되지만 명확하게 작성하는 부분
		resolver.setViewClass(JstlView.class); 
		return resolver;
	}
	
	// resource 자원을 요청
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	}
	
	// 인터셉터 설정
	@Autowired
	AdminPageInterceptor adminPageInterceptor;	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(adminPageInterceptor).addPathPatterns("/users");
	}
}
