package com.ssafy.board.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyAppSqlConfig {
	// 공장 세워서 계속 불러다 쓸 것임
	private static SqlSessionFactory factory;
	
	static{
		// 공장 세울 때 그 설정파일의 위치!
		String resource = "config/mybatis-config.xml";
		// try catch문 쓸 떄 try안에 이렇게 resource를 담으면 쓰고 안 닫아줘도 알아서 없애줌
		try (InputStream inputStream = Resources.getResourceAsStream(resource)){			
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("공장 건설 완료");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("공장 건설 실패");
		} 
	}
	
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}
