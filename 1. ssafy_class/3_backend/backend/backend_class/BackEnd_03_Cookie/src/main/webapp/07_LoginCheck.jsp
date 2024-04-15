<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 화면을 보여줄게 아니라서 html부분 다 지워버림, 로그인 처리 용도만 할 거임. --%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	
	// 실제로는 id와 pw를 이용하여 DB에 저장되어있는 유저가 맞는지를 체크!
	// DB가 없다면 적어도 manager라도 있어야 검증이 된다
	// 그래서 그냥 임시로 만들어서 쓰자
	
	if(id.equals("ssafy") && pw.equals("1234")){
		// 로그인 성공
		// 세션에 정보를 저장할것!
		// request.getCookies() 반복문 돌면서 JSESSIONID 쿠키를 찾아서 값을 이용해서 메모리 접근!이 답인가?!
		
		// jsp는 session 변수를 이미 가지고 있기 때문에 session이라고 쓸 수 없음.
		// 그래서 사실 그냥 아래 객체 생성하는거 없애고 session.setAttribute("id",id); 해도 됨.
		HttpSession mySession = request.getSession();
		
		mySession.setAttribute("id", id);
		// 쿠키, 세션에 패스워드를 저장하는건 보안상 옳지 않음		
		
		// 이걸 포워딩하면 불필요하게 암호정보를 가지고 넘어가기 때문에 조금 위험함.
		// 그래서 포워딩을 하지 않고 redirect를 함
		// request.getRequestDispatcher("08_Main.jsp").forward(request, response);
		
		response.sendRedirect("08_Main.jsp");
		
	} else{
		// 로그인 실패
		response.sendRedirect("07_LoginForm.jsp");
	}
%>