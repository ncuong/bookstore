<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookStore - Danh mục bài viết</title>
</head>
<body>
	<core:choose>
		<core:when test="${not empty posts}">
			<core:forEach var="post" items="${posts}">
				<div class="col-md-12">
					<h3>${post.postTitle}</h3>
					<div id="post_content">
						${post.postSortContent}
					</div>
					<h6> Chuyên mục: <span>${post.postCategory.postCategoryName}</span></h6>
				</div>
			</core:forEach>
		</core:when>
		<core:otherwise>
			<p>Không có bài viết nào trong chuyên mục này</p>
		</core:otherwise>
	</core:choose>
</body>
</html>