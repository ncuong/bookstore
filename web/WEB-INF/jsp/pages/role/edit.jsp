<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStory - Admin - Quyền - Edit</title>
</head>
<body>
	<form:form class="form-horizontal" method="POST" commandName="role"
		action="${pageContext.request.contextPath}/admin/role/edit/${category.categoryId}.html">
		<form:hidden path="roleId"/>
		<div class="form-group">
			<label for="categoryName" class="col-md-3 control-label">Tên quyền:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="roleName"
					id="roleName" placeholder="Tên quyền"/>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-3 col-md-9">
				<button type="submit" class="btn btn-primary">Thay đổi</button>
			</div>
		</div>
	</form:form>
</body>
</html>