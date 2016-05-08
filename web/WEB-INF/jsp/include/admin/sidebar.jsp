<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="left-sidebar">
	<section class="effect-parent">
		<div id="cssmenu">
			<ul>
				<li class="active"><a href="${pageContext.request.contextPath}"><span>Home</span></a></li>
				<li class="has-sub"><a href="#"><span>Dashboard</span></a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/admin/category/index.html"><span>Chuyên mục</span></a></li>
						<li class="last"><a href="${pageContext.request.contextPath}/admin/book/index.html"><span>Sách</span></a></li>
					</ul>
				</li>
				<li class="has-sub"><a href="#"><span>User & Role</span></a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/admin/user/index.html"><span>User</span></a></li>
						<li class="last"><a href="${pageContext.request.contextPath}/admin/role/index.html"><span>Role</span></a></li>
					</ul></li>
				<li class="last"><a href="#"><span>Service</span></a></li>
				<li class="last"><a href="#"><span>About</span></a></li>
				<li class="last"><a href="#"><span>Contact</span></a></li>
			</ul>
		</div>
	</section>
</div>
