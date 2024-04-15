package com.ssafy.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// text로 쓰면 html로 바꿔서 써라. UTF8로 인코딩해서
		response.setContentType("text/html;characterset=UTF-8");
		PrintWriter writer = response.getWriter();

		writer.write("""
				<html>
				  <head><title>Hello! SSAFY!</title></head>
				  <body>
				    <h1>Hello! Servlet! MyServlet 4!</h1>
				  </body>
				</html>
				""");
	}
}