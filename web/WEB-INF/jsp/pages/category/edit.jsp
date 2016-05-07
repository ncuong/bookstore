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
<title>BookStory - Admin - Category - Edit</title>
</head>
<body>
	<form:form class="form-horizontal" method="POST" commandName="category"
		action="${pageContext.request.contextPath}/admin/category/edit/${category.categoryId}.html">
		<form:hidden path="categoryId"/>
		<div class="form-group">
			<label for="categoryName" class="col-md-6 control-label">Tên
				chuyên mục:</label>
			<div class="col-md-6">
				<form:input class="form-control" path="categoryName"
					id="categoryName" placeholder="Tên chuyên mục"/>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-6 col-md-6">
				<button type="submit" class="btn btn-primary">Thay đổi</button>
			</div>
		</div>
	</form:form>
</body>
</html>