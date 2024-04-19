package com.ssafy.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration //설정파일로 쓰겠다!
@MapperScan(basePackages = "com.ssafy.board.model.dao")
public class DBConfig {

}
