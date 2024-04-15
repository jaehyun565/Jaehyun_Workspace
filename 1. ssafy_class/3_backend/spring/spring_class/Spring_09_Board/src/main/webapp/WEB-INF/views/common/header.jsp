<%@ page language="java" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<div>
	<!-- ��α��� ���� -->
	<c:if test="${empty loginUser}">
		<a href = "login" class="btn btn-outline-warning">�α���</a>
		<a href = "signup" class="btn btn-outline-primary">ȸ������</a>	
	</c:if>
	<!-- �α��� ���� -->
	<c:if test="${not empty loginUser }">
		<span>${loginUser}�� �ݰ����ϴ�.</span>
		<a href = "logout" class="btn btn-outline-danger">�α׾ƿ�</a>
		<c:if test="${'admin' eq loginUser }">
			<a href = "users">������������</a>
		</c:if>	
	</c:if>

</div>