<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.dto.Person"%>
<%
	Person p = new Person();
	p.setName("김재현");
	p.setAge(31);
	p.setGender("남성");
	p.setHobbies(new String[]{"하스스톤"});
	p.Bravo();
	/* 지금만 JSP에서 쓰려고 아래에 직접 심음. */
	pageContext.setAttribute("p", p);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JavaBeans</h2>
	<div>전체정보 : ${p }</div>
	<div>이름 : ${p.name }</div>
	<div>나이 : ${p["age"] }</div>
	<div>취미 : ${p["hobbies"][0]}</div>
	<div>브라보 : ${p.Bravo }</div>

</body>
</html>