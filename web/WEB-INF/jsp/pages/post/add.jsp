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
<title>BookStory - Admin - Post - Add</title>
<link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
</head>
<body>
	<form:form class="form-horizontal" method="POST" commandName="post"
		action="${pageContext.request.contextPath}/admin/post/add.html">
		<div class="form-group">
			<label for="bookName" class="col-md-3 control-label">Tiêu đề:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="postTitle"
					id="postTitle" placeholder="Tiêu đề"/>
			</div>
		</div>
		<div class="form-group">
			<label for="bookName" class="col-md-3 control-label">Nội dung ngắn gọn:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="postSortContent"
					id="postSortContent" placeholder="Nội dung ngắn gọn"/>
			</div>
		</div>
		<div class="form-group">
			<label for="auther" class="col-md-3 control-label">Nội dung:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="postContent"
					id="postContent" placeholder="Nội dung"/>
			</div>
		</div>
<!-- 		<div class="form-group"> -->
<!-- 			<label for="sortDescription" class="col-md-3 control-label">Ngày chỉnh sửa:</label> -->
<!-- 			<div class="col-md-4"> -->
<!-- 				<div class="input-group date" id="datetimepicker"> -->
<%-- 					<form:input class="form-control" path="dateModified" id="dateModified" placeholder="Ngày chỉnh sửa"/> --%>
<!-- 	                <span class="input-group-addon"> -->
<!-- 	                    <span class="glyphicon glyphicon-calendar"></span> -->
<!-- 	                </span> -->
<!-- 	           	</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
		<div class="form-group">
			<label for="category" class="col-md-3 control-label">Chuyên mục:</label>
			<div class="col-md-4">
				<form:select path="postCategory.postCategoryId" class="form-control">
					<form:options items="${postCategories }" itemLabel="postCategoryName" itemValue="postCategoryId"/>
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-3 col-md-9">
				<button type="submit" class="btn btn-primary">Thêm bài viết</button>
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
	selector: '#postContent',
});
</script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>


<script type="text/javascript">
    $(function () {
        $('#dateModified').datetimepicker({
        	format: "dd/mm/yyyy",
        	weekStart: 1,
            todayBtn:  1,
    		autoclose: 1,
    		todayHighlight: 1,
    		startView: 2,
    		minView: 2,
    		forceParse: 0
            });
    });
</script>
</body>
</html>