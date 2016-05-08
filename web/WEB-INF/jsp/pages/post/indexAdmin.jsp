<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Admin - Danh mục bài viết</title>
</head>
<body>
	
	<h4>Danh mục bài viết</h4>
	<br/>
	<a href="${pageContext.request.contextPath}/admin/post/add.html" class="btn btn-primary" role="button">Thêm bài viết</a>
	<core:if test="${not empty posts}">
		<table class="table table-bordered">
			<tr>
				<th>STT</th>
				<th>Tiêu đề</th>
				<th>Nội dung ngắn gọn</th>
<!-- 				<th>Nội dung</th> -->
<!-- 				<th>Ngày đăng</th> -->
				<th>Chuyên mục</th>
				<th>Thay đổi</th>
				<th>Xóa</th>
			</tr>
			<core:forEach var="post" items="${posts}">
				<tr>
					<td>${post.postId}</td>
					<td>${post.postTitle}</td>
<%-- 					<td>${post.postContent}</td> --%>
					<td>${post.postSortContent}</td>
<%-- 					<td>${post.dateModified}</td> --%>
					<td>${post.postCategory.postCategoryName}</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/post/edit/${post.postId}.html">Thay đổi</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/admin/post/delete/${post.postId}.html">Xóa</a>
					</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>