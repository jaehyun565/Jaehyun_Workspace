<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부</title>
</head>
<body>
	<!--  선언부에서는 변수와 메서드를 선언할 수 있음. -->
	<%!int A = 10;
	int B = -20;
	String name = "김재현";

	public int add(int A, int B) {
		return A + B;
	}

	public int abs(int A) {
		return (A > 0 ? A : -A);
	}%>
	<!-- 일반 스크립트릿에서는 메서드를 선언할 수 없다. -->
		
	<%
	int C = 10;
	out.print(add(A, B));
	out.print("<br/>");
	out.print(abs(B));
	out.print("<br/>");
	out.print(name);
	%>
	<a href="index.html">홈으로</a>
</body>
</html>