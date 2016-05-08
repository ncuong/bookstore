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
				<a href="#">Role</a>
			</li>
		</ul>
	</li>
	<li>
		<a href="#">Service</a>
	</li>
	<li>
		<a href="#">About</a>
	</li>
	<li>
		<a href="#">Contact</a>
	</li>
	<li>
		<a href="${pageContext.request.contextPath}/login.html">Log in</a>
	</li>
</ul>