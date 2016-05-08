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
<title>BookStory - Admin - Post Category - Edit</title>
</head>
<body>
	<form:form class="form-horizontal" method="POST" commandName="postCategory"
		action="${pageContext.request.contextPath}/admin/post_category/add.html">
		<div class="form-group">
			<label for="categoryName" class="col-md-3 control-label">Tên
				chuyên mục bài viết:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="postCategoryName"
					id="postCategoryName" placeholder="Tên chuyên mục bài viết"/>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-3 col-md-9">
				<button type="submit" class="btn btn-primary">Thêm chuyên mục bài viết</button>
			</div>
		</div>
	</form:form>
</body>
</html>