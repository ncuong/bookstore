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
					<img alt="" src="${pageContext.request.contextPath}/${book.imagePath}">
					<h3>${book.bookName}</h3>
					<p>Tác giả: <span>${book.auther}</span></p>
					<p>Tóm tắt: <span>${book.sortDescription}</span></p>
					<p>Giá: <span>${book.price}</span></p>
					<p>Chuyên mục: <span>${book.category.categoryName}</span></p>
				</div>
			</core:forEach>
		</core:when>
		<core:otherwise>
			<p>Không có sách trong chuyên mục này</p>
		</core:otherwise>
	</core:choose>
</body>
</html>