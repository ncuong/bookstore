<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="left-sidebar">
	<section class="effect-parent">
		<div id="cssmenu">
			<ul>
				<li class="active"><a href="${pageContext.request.contextPath}"><span>Home</span></a></li>
				<li class="has-sub"><a href="#"><span>Danh mục sách</span></a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/book/toan.html"><span>Toán</span></a></li>
						<li><a href="${pageContext.request.contextPath}/book/van_hoc.html"><span>Văn học</span></a></li>
						<li><a href="${pageContext.request.contextPath}/book/lich_su.html"><span>Lịch sử</span></a></li>
						<li class="last"><a href="${pageContext.request.contextPath}/book/dia_ly.html"><span>Địa lý</span></a></li>
					</ul></li>
				<li class="has-sub"><a href="#"><span>Truyện cười</span></a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/post/viet_nam_vo_doi.html"><span>Việt Nam vô đối</span></a></li>
						<li><a href="${pageContext.request.contextPath}/post/truyen_cuoi_vo_va.html"><span>Truyện cười Vô Va</span></a></li>
						<li><a href="${pageContext.request.contextPath}/post/truyen_trang_quynh.html"><span>Trạng Quỳnh</span></a></li>
						<li class="last"><a href="${pageContext.request.contextPath}/post/luom_lat.html"><span>Lượm lặt</span></a></li>
					</ul></li>
				<li class="last"><a href="service"><span>Service</span></a></li>
				<li class="last"><a href="about"><span>About</span></a></li>
				<li class="last"><a href="contact"><span>Contact</span></a></li>
			</ul>
		</div>
	</section>
</div>
