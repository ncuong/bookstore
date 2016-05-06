<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Coffee page</p>
	<core:if test="${not empty categories}">
		<table class="table">
			<tr>
				<th>STT</th>
				<th>Tên chuyên mục</th>
			</tr>
			<core:forEach var="category" items="${categories}">
				<tr>
					<td>${category.categoryId}</td>
					<td>${category.categoryName}</td>
				</tr>
			</core:forEach>
			<tr>
			
			</tr>
		</table>
	</core:if>
</body>
</html>