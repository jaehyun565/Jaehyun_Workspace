<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캠퍼스</title>
</head>
<body>
	<h3>c:forToken</h3>
	<c:forTokens items="서울, 대전, 구미. 광주. 부울경" delims="," var="campus">
	${campus }<br>
	</c:forTokens>
	
	<h3>c:forToken</h3>
	<c:forTokens items="서울, 대전, 구미. 광주. 부울경" delims=",." var="campus">
	${campus }<br>
	</c:forTokens>


</body>
</html>