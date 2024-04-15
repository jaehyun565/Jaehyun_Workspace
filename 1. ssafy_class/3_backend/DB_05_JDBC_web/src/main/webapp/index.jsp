<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
request.setAttribute("root", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>SSAFY 게시판</title>
</head>
<body>

	<a href="board?action=writeform">게시글 등록</a>


	<!-- 절대 경로 -->
	<ul>
		<li><a href="/DB_05_JDBC_web/board?action=list">목록1</a></li>
		<li><a href="<%=request.getContextPath()%>/board?action=list">목록2</a></li>
		<li><a
			href="${pageContext.request.contextPath}/board?action=list">목록3</a></li>
		<li><a href="${root}/board?action=list">목록4</a></li>

	</ul>

</body>
</html>