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
<title>BookStory - Admin - Sách - Add</title>
</head>
<body>
	<form:form class="form-horizontal" method="POST" enctype="multipart/form-data" commandName="book"
		action="${pageContext.request.contextPath}/admin/book/add.html">
		<div class="form-group">
			<label for="bookName" class="col-md-3 control-label">Tên
				sách:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="bookName"
					id="bookName" placeholder="Tên sách"/>
			</div>
		</div>
		<div class="form-group">
			<label for="auther" class="col-md-3 control-label">Tên
				tác giả:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="auther"
					id="auther" placeholder="Tác giả"/>
			</div>
		</div>
		<div class="form-group">
			<label for="sortDescription" class="col-md-3 control-label">Tóm tắt</label>
			<div class="col-md-9">
				<form:input class="form-control" path="sortDescription"
					id="sortDescription" placeholder="Tóm tắt"/>
			</div>
		</div>
		<div class="form-group">
			<label for="fullDescription" class="col-md-3 control-label">Chi tiết</label>
			<div class="col-md-9">
				<form:textarea class="form-control" path="fullDescription"
					id="fullDescription" placeholder="Chi tiết"/>
			</div>
		</div>
		<div class="form-group">
			<label for="imagePath" class="col-md-3 control-label">Ảnh đại diện</label>
			<div class="col-md-9">
<%-- 				<form:input class="form-control" path="imagePath" --%>
<%-- 					id="imagePath" placeholder="Ảnh đại diện"/> --%>
				<input type="file" name="file" class="form-control" id="imagePath">
			</div>
		</div>
		<div class="form-group">
			<label for="price" class="col-md-3 control-label">Giá</label>
			<div class="col-md-9">
				<form:input class="form-control" path="price"
					id="price" placeholder="Giá"/>
			</div>
		</div>
		<div class="form-group">
			<label for="category" class="col-md-3 control-label">Chuyên mục</label>
			<div class="col-md-4">
				<form:select path="category.categoryId" class="form-control">
					<form:option value="">---  Select  ---</form:option>
					<form:options items="${categories }" itemLabel="categoryName" itemValue="categoryId"/>
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-3 col-md-9">
				<button type="submit" class="btn btn-primary">Thêm sách</button>
			</div>
		</div>
	</form:form>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/tiny_mce/tiny_mce.js"></script>
<script type="text/javascript">
tinyMCE_GZ.init({
        plugins : 'style,layer,table,save,advhr,advimage,advlink,emotions,iespell,insertdatetime,preview,media,searchreplace,print,contextmenu',
        themes : 'simple,advanced',
        languages : 'en',
        disk_cache : true,
        debug : false
});
</script>
<script type="text/javascript">
tinyMCE.init({
	selector: '#fullDescription',
});
</script>
</body>
</html>