<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>단일파일 업로드</h2>
	<a href="${pageContext.request.contextPath }/resources/upload/${fileName}">${fileName }</a>
	<img src="${pageContext.request.contextPath }/resources/upload/${fileName}">
	
	
	<a href="download?fileName=${fileName}">${fileName} 다운로드</a>
</body>
</html>