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
<title>BookStory - Admin - Sách - Edit</title>
</head>
<body>
	<form:form class="form-horizontal" method="POST" commandName="book"
		action="${pageContext.request.contextPath}/admin/book/add.html">
		<div class="form-group">
			<label for="bookName" class="col-md-6 control-label">Tên
				sách:</label>
			<div class="col-md-6">
				<form:input class="form-control" path="bookName"
					id="bookName" placeholder="Tên sách"/>
			</div>
		</div>
		<div class="form-group">
			<label for="auther" class="col-md-6 control-label">Tên
				tác giả:</label>
			<div class="col-md-6">
				<form:input class="form-control" path="auther"
					id="auther" placeholder="Tác giả"/>
			</div>
		</div>
		<div class="form-group">
			<label for="category" class="col-md-6 control-label">Chuyên mục</label>
			<div class="col-md-6">
				<form:select path="category.categoryId" class="form-control">
					<form:options items="${categories }" itemLabel="categoryName" itemValue="categoryId"/>
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-6 col-md-6">
				<button type="submit" class="btn btn-primary">Thêm sách</button>
			</div>
		</div>
	</form:form>
</body>
</html>