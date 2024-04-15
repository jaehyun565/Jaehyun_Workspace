package com.ssafy.servlet;

import java.io.IOException;

import com.ssafy.dto.Person;
import com.ssafy.manager.PersonManager;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		switch (action) {
		case "regist": {
			doRegist(request, response);
			break;
		}
		case "list":{
			doList(request, response);
			break;
		}
		}
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("보내");
		
	}

	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		
		Person p = new Person(name, age, gender, hobbies);
		
		PersonManager pm = PersonManager.getInstance(); // 싱글턴이라 이렇게 불러옴
		pm.regist(p);
		
		// 포워딩할 때 보내는 용도로 쓰는 메서드 setAttribute <-> 받는용도로 쓰는 메서드 getAttribute
		request.setAttribute("person", p); // p의 이름을 가진 person을 보내겠다.
		// requestdispatcher : 경로설정
//		RequestDispatcher disp = request.getRequestDispatcher("/12_result.jsp");
//		disp.forward(request, response);
		
		
		// 리다이렉트 방식으로 해보기
		response.sendRedirect("/12_result.jsp"); // => 리다이렉트 방식으로 이렇게 작성하면 제대로 안 돌아감. why? context_root가 없어서.
		response.sendRedirect(request.getContextPath()+"/12_result.jsp"); // => 이렇게 context_root를 받아서 작성해서 보내보면 역시나 안된다!!! 왜?
		// 이 메인서블릿을 가지고 p의 정보를 주고 받았는데, 12_result로.jsp로 리다이렉트 하면 이 p의 정보가 사라지므로 제대로 안 돌아간다!!
	}

}
