<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
request.setAttribute("root", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>SSAFY �Խ���</title>
</head>
<body>

	<a href="board?action=writeform">�Խñ� ���</a>


	<!-- ���� ��� -->
	<ul>
		<li><a href="/DB_05_JDBC_web/board?action=list">���1</a></li>
		<li><a href="<%=request.getContextPath()%>/board?action=list">���2</a></li>
		<li><a
			href="${pageContext.request.contextPath}/board?action=list">���3</a></li>
		<li><a href="${root}/board?action=list">���4</a></li>

	</ul>

</body>
</html>