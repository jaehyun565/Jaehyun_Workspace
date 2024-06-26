<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>드라마 반복</title>
</head>
<body>
	<%
	String[] dramaList = { "파리의 연인", "고려거란전쟁", "대조영", "대장금" };
	pageContext.setAttribute("List", dramaList);
	%>

	<h3>c:ForEach</h3>
	<ol>
		<c:forEach items="${List }" var="drama">
			<li>${drama }</li>
		</c:forEach>
	</ol>

	<hr>


	<!-- varStatus :  -->
	<c:forEach var="drama" items="${List }" varStatus="status" begin="1" end="3" step="2">
		<div>
		${status.index } : ${drama} index
		</div>
	</c:forEach>
	<hr>
	<c:forEach var="drama" items="${List }" varStatus="status" begin="1" end="3" step="2">
		<div>
		${status.count } : ${drama} count
		</div>
	</c:forEach>
</body>
</html>