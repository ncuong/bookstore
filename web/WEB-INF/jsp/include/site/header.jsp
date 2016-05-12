<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<ul id="menu">
						<li><a href="${pageContext.request.contextPath}">Home</a></li>
						<core:choose>
							<core:when test="${pageContext['request'].userPrincipal != null}">
								<li><a href="#">Dashboard</a>
									<ul>
										<li>
											<a href="${pageContext.request.contextPath}/admin/category/index.html">Chuyên mục sách</a>
										</li>
										<li>
											<a href="${pageContext.request.contextPath}/admin/book/index.html">Sách</a>
										</li>
										<li>
											<a href="${pageContext.request.contextPath}/admin/post_category/index.html">Chuyên mục bài viết</a>
										</li>
										<li>
											<a href="${pageContext.request.contextPath}/admin/post/index.html">Bài viết</a>
										</li>
										<li>
											<a href="${pageContext.request.contextPath}/admin/role/index.html">Phân quyền</a>
										</li>
										<li>
											<a href="${pageContext.request.contextPath}/admin/user/index.html">Users</a>
										</li>
									</ul>
								</li>
							</core:when>
							<core:otherwise>
								
							</core:otherwise>
						</core:choose>
						<li><a href="${pageContext.request.contextPath}/book/index.html">Danh mục sách</a>
							<ul>
								<li><a href="${pageContext.request.contextPath}">Sách giáo khoa</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/book/toan.html">Toán</a></li>
										<li><a href="${pageContext.request.contextPath}/book/van_hoc.html">Văn học</a></li>
										<li><a href="${pageContext.request.contextPath}/book/lich_su.html">Lịch sử</a></li>
										<li><a href="${pageContext.request.contextPath}/book/dia_ly.html">Địa lý</a></li>
										<li><a href="${pageContext.request.contextPath}/book/hoa_hoc.html">Hóa học</a></li>
										<li><a href="${pageContext.request.contextPath}/book/vat_ly.html">Vật lý</a></li>
									</ul>
								</li>
								<li><a href="${pageContext.request.contextPath}">Tạp chí</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/book/tin_hoc_va_tuoi_tre.html">Tin học và tuổi trẻ</a></li>
										<li><a href="${pageContext.request.contextPath}/book/toan_hoc_va_tuoi_tre.html">Toán học và tuổi trẻ</a></li>
										<li><a href="${pageContext.request.contextPath}/book/hoa_hoc_tro.html">Hoa Học Trò - H2T</a></li>
										<li><a href="${pageContext.request.contextPath}/book/tuoi_tre_cuoi.html">Tuôi trẻ cười</a></li>
									</ul>
								</li>
								<li><a href="${pageContext.request.contextPath}/book/nghe_thuat.html">Nghệ thuật</a></li>
								<li><a href="${pageContext.request.contextPath}/book/tin_hoc.html">Tin học</a></li>
							</ul></li>
						<li><a href="${pageContext.request.contextPath}">Blog</a>
							<ul>
								<li><a href="${pageContext.request.contextPath}">Doanh nhân</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}">Steve Job</a></li>
										<li><a href="${pageContext.request.contextPath}">Bill Gate</a></li>
									</ul>
								</li>
								<li><a href="${pageContext.request.contextPath}">Truyện cười</a>
									<ul>
										<li><a href="${pageContext.request.contextPath}/post/viet_nam_vo_doi.html">Việt Nam vô đối</a></li>
										<li><a href="${pageContext.request.contextPath}/post/truyen_cuoi_vo_va.html">Truyện cười vô va</a></li>
										<li><a href="${pageContext.request.contextPath}/post/truyen_trang_quynh.html">Trạng Quỳnh</a></li>
										<li><a href="${pageContext.request.contextPath}/post/luom_lat.html">Lượm lặt</a></li>
									</ul>
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
						
						<core:choose>
							<core:when test="${pageContext['request'].userPrincipal != null}">
								<a href="${pageContext.request.contextPath}/logout.html">Log out</a>
							</core:when>
							<core:otherwise>
								<a href="${pageContext.request.contextPath}/login.html">Log in</a>
							</core:otherwise>
						</core:choose>
						
					</ul>