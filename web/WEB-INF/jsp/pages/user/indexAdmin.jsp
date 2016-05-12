<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Admin - Danh sách User</title>
</head>
<body>
	
	<h4>Danh mục sách</h4>
	<br/>
	<a href="${pageContext.request.contextPath}/admin/user/add.html" class="btn btn-primary" role="button">Thêm User</a>
	<core:if test="${not empty users}">
		<table class="table table-bordered">
			<tr>
				<th>STT</th>
				<th>Họ & Tên</th>
				<th>Username</th>
				<th>Email</th>
				<th>Quyền</th>
				<th>Thay đổi</th>
				<th>Xóa</th>
			</tr>
			<core:forEach var="user" items="${users}">
				<tr>
					<td>${user.userId}</td>
					<td>${user.fullName}</td>
					<td>${user.userName}</td>
					<td>${user.email}</td>
					<td>${user.role.roleName}</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/user/edit/${user.userId}.html">Thay đổi</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/user/delete/${user.userId}.html">Xóa</a>
					</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>