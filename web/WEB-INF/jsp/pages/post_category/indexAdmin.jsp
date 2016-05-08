<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Admin - Danh sách chuyên mục bài viết</title>
</head>
<body>
	
	<h4>Danh sách chuyên mục bài viết</h4>
	<br/>
	<a href="${pageContext.request.contextPath}/admin/post_category/add.html" class="btn btn-primary" role="button">Thêm chuyên mục bài viết</a>
	<core:if test="${not empty postCategories}">
		<table class="table table-bordered">
			<tr>
				<th>STT</th>
				<th>Tên chuyên mục bài viết</th>
				<th>Thay đổi</th>
				<th>Xóa</th>
			</tr>
			<core:forEach var="postCategory" items="${postCategories}">
				<tr>
					<td>${postCategory.postCategoryId}</td>
					<td>${postCategory.postCategoryName}</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/post_category/edit/${postCategory.postCategoryId}.html">Thay đổi</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/post_category/delete/${postCategory.postCategoryId}.html">Xóa</a>
					</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>