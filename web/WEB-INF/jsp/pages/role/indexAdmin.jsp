<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Admin - Danh sách phân quyền</title>
</head>
<body>
	
	<h4>Danh sách phân quyền</h4>
	<br/>
	<a href="${pageContext.request.contextPath}/admin/role/add.html" class="btn btn-primary" role="button">Thêm quyền</a>
	<core:if test="${not empty roles}">
		<table class="table table-bordered">
			<tr>
				<th>STT</th>
				<th>Tên quyền</th>
				<th>Thay đổi</th>
				<th>Xóa</th>
			</tr>
			<core:forEach var="role" items="${roles}">
				<tr>
					<td>${role.roleId}</td>
					<td>${role.roleName}</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/role/edit/${role.roleId}.html">Thay đổi</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/role/delete/${role.roleId}.html">Xóa</a>
					</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>