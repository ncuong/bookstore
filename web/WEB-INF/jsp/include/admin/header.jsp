<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul id="menu">
	<li><a href="${pageContext.request.contextPath}">Home</a></li>
	<li><a href="#">Dashboard</a>
		<ul>
			<li>
				<a href="${pageContext.request.contextPath}/admin/category/index.html">Chuyên mục</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/admin/book/index.html">Sách</a>
			</li>
		</ul>
	</li>
	<li><a href="#">User & Role</a>
		<ul>
			<li>
				<a href="${pageContext.request.contextPath}/admin/user/index.html">User</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/admin/role/index.html">Role</a>
			</li>
		</ul>
	</li>
	<li><a href="#">Post</a>
		<ul>
			<li>
				<a href="${pageContext.request.contextPath}/admin/post_category/index.html">Chuyên mục post</a>
			</li>
			<li>
				<a href="${pageContext.request.contextPath}/admin/post/index.html">Danh sách post</a>
			</li>
		</ul>
	</li>
	<li>
		<a href="${pageContext.request.contextPath}/service.html">Service</a>
	</li>
	<li>
		<a href="${pageContext.request.contextPath}/about.html">About</a>
	</li>
	<li>
		<a href="${pageContext.request.contextPath}/contact.html">Contact</a>
	</li>
	<li>
		<a href="${pageContext.request.contextPath}/logout.html">Log out</a>
	</li>
</ul>