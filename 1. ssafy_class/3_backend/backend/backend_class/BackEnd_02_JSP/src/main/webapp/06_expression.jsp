<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--  선언부에서는 변수와 메서드를 선언할 수 있음. -->
<%!int A = 10;
	int B = -20;
	String name = "김재현";

	public int add(int A, int B) {
		return A + B;
	}

	public int abs(int A) {
		return (A > 0 ? A : -A);
	}
	
	public String babo(){
		return "바보";
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식</title>
</head>
<body>
	<%=name%><br>
	<%=A + B%><br>
	<%=add(A, B)%><br>
	<%=babo() %><br>

	<a href="index.html">홈으로</a>
</body>
</html>