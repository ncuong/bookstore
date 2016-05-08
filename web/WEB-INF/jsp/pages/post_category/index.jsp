<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Danh sách chuyên mục bài viết</title>
</head>
<body>
	
	<h4>Danh sách chuyên mục</h4>
	<core:if test="${not empty postCategories}">
		<table class="table table-bordered">
			<tr>
				<th>STT</th>
				<th>Tên chuyên mục bài viết</th>
			</tr>
			<core:forEach var="postCategory" items="${postCategories}">
				<tr>
					<td>${postCategory.postCategoryId}</td>
					<td>${postCategory.postCategoryName}</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>