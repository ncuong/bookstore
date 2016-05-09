<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Danh mục sách</title>
</head>
<body>
	
	<h4>Danh mục sách</h4>
	<br/>
	<core:if test="${not empty books}">
		<table class="table table-bordered">
			<tr>
				<th>STT</th>
				<th>Tên sách</th>
				<th>Tác giả</th>
				<th>Tóm tắt</th>
				<th>Chi tiết</th>
				<th>Ảnh đại diện</th>
				<th>Giá</th>
				<th>Chuyên mục</th>
			</tr>
			<core:forEach var="book" items="${books}">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.auther}</td>
					<td>${book.sortDescription}</td>
					<td>${book.fullDescription}</td>
					<td>${book.imagePath}</td>
					<td>${book.price}</td>
					<td>${book.category.categoryName}</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>