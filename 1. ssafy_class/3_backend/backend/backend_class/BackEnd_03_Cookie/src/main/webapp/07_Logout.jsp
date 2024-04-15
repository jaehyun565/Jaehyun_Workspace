<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<!--  로그아웃 만들어보자 -->
	<!-- 1번 방법은 해당 id만 없앰 -->
	<%session.removeAttribute("id"); %>
	<!-- 세션을 전체 지우기 -->
	<%session.invalidate(); %>
	
	<script>
		alert("로그아웃 했습니당")
		location.href = "index.html";
		
	</script>
</body>
</html>