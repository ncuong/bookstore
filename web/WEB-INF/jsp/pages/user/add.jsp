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
<title>BookStory - Admin - User - Add</title>
</head>
<body>
	<form:form class="form-horizontal" method="POST" enctype="multipart/form-data" commandName="user"
		action="${pageContext.request.contextPath}/admin/user/add.html">
		<div class="form-group">
			<label for="fullName" class="col-md-3 control-label">Họ & Tên:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="fullName"
					id="fullName" placeholder="Họ & Tên"/>
			</div>
		</div>
		<div class="form-group">
			<label for="userName" class="col-md-3 control-label">Username:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="userName"
					id="userName" placeholder="Username"/>
			</div>
		</div>
		<div class="form-group">
			<label for="password" class="col-md-3 control-label">Password:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="password"
					id="password" placeholder="Password"/>
			</div>
		</div>
		<div class="form-group">
			<label for="email" class="col-md-3 control-label">Email:</label>
			<div class="col-md-9">
				<form:input class="form-control" path="email"
					id="email" placeholder="Email"/>
			</div>
		</div>
		<div class="form-group">
			<label for="role" class="col-md-3 control-label">Quyền:</label>
			<div class="col-md-4">
				<form:select path="role.roleId" class="form-control" id="role">
					<form:option value="">---  Select  ---</form:option>
					<form:options items="${roles }" itemLabel="roleName" itemValue="roleId"/>
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-3 col-md-9">
				<button type="submit" class="btn btn-primary">Thêm User</button>
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