<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/taglibs_include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="website ban sach online">
<meta name="author" content="Tai Bui Thi">

<title><decorator:title /></title>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<link
	href="http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300,300italic"
	rel="stylesheet" type="text/css">

<link rel="stylesheet" type="text/css"
	href="${contextPath}/css/site/style.css" />
<link rel="stylesheet" type="text/css"
	href="${contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${contextPath}/css/site/examples.css" />
<link rel="stylesheet" type="text/css"
	href="${contextPath}/css/site/transitions.css" />
<link rel="stylesheet" type="text/css"
	href="${contextPath}/css/site/nav-styles.css" />
<link rel="stylesheet" type="text/css"
	href="${contextPath}/css/site/slide-style.css" />

<script type="text/javascript" src="${contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${contextPath}/js/site/nav-script.js"></script>
<script type="text/javascript"
	src="${contextPath}/js/site/jquery.collagePlus.js"></script>
<script type="text/javascript"
	src="${contextPath}/js/site/jquery.removeWhitespace.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/jmpress.js"></script>
<script type="text/javascript"
	src="${contextPath}/js/site/jquery.jmslideshow.js"></script>
<script type="text/javascript"
	src="${contextPath}/js/site/modernizr.custom.48780.js"></script>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<nav id="menu-wrap">
					<%@ include file="/WEB-INF/jsp/include/admin/header.jsp"%>
				</nav>
			</div>
		</div>
		<div class="row" style="height: 50px;"></div>

		<div class="row">
			<div class="col-md-3">
				<%@ include file="/WEB-INF/jsp/include/admin/sidebar.jsp"%>
			</div>
			<div class="col-md-9" id="content">
				<section class="effect-parent" style="border: 1px solid black; padding: 20px;">
					<decorator:body />
				</section>
			</div>
		</div>
		<div class="row" id="footer">
			<%@ include file="/WEB-INF/jsp/include/admin/footer.jsp"%>
		</div>
	</div>

</body>
</html>
