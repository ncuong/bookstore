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
	<core:choose>
		<core:when test="${not empty books}">
			<core:forEach var="book" items="${books}">
				<div class="col-md-4">
					<h3>${book.bookName}</h3>
					<p>Tác giả: <span>${book.auther}</span></p>
					<p>Tóm tắt: <span>${book.sortDescription}</span></p>
					<p>Giá: <span>${book.price}</span></p>
					<p>Chuyên mục: <span>${book.category.categoryName}</span></p>
				</div>
			</core:forEach>
		
		
<!-- 			<h4>Danh mục sách</h4> -->
<!-- 			<br/> -->
<!-- 			<table class="table table-bordered"> -->
<!-- 				<tr> -->
<!-- 					<th>STT</th> -->
<!-- 					<th>Tên sách</th> -->
<!-- 					<th>Tác giả</th> -->
<!-- 					<th>Tóm tắt</th> -->
<!-- 					<th>Chi tiết</th> -->
<!-- 					<th>Ảnh đại diện</th> -->
<!-- 					<th>Giá</th> -->
<!-- 					<th>Chuyên mục</th> -->
<!-- 				</tr> -->
<%-- 				<core:forEach var="book" items="${books}"> --%>
<!-- 					<tr> -->
<%-- 						<td>${book.bookId}</td> --%>
<%-- 						<td>${book.bookName}</td> --%>
<%-- 						<td>${book.auther}</td> --%>
<%-- 						<td>${book.sortDescription}</td> --%>
<%-- 						<td>${book.fullDescription}</td> --%>
<%-- 						<td>${book.imagePath}</td> --%>
<%-- 						<td>${book.price}</td> --%>
<%-- 						<td>${book.category.categoryName}</td> --%>
<!-- 					</tr> -->
<%-- 				</core:forEach> --%>
<!-- 			</table> -->
		</core:when>
		<core:otherwise>
			<p>Không có sách trong chuyên mục này</p>
		</core:otherwise>
	</core:choose>
</body>
</html>