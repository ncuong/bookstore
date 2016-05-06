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

<link rel="stylesheet" type="text/css" href="${contextPath}/css/site/style.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/site/examples.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/site/transitions.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/site/nav-styles.css" />
<link rel="stylesheet" type="text/css" href="${contextPath}/css/site/slide-style.css" />

<script type="text/javascript" src="${contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/nav-script.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/jquery.collagePlus.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/jquery.removeWhitespace.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/jmpress.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/jquery.jmslideshow.js"></script>
<script type="text/javascript" src="${contextPath}/js/site/modernizr.custom.48780.js"></script>

<script type="text/javascript">
	// All images need to be loaded for this plugin to work so
	// we end up waiting for the whole window to load in this example
	$(window).load(function() {
		$(document).ready(function() {
			collage();
			//                    $('.Collage').collageCaption();
		});
	});

	// Here we apply the actual CollagePlus plugin
	function collage() {
		$('.Collage').removeWhitespace().collagePlus({
			'fadeSpeed' : 2000,
			'targetHeight' : 200,
			'effect' : 'effect-5',
			'direction' : 'vertical'
		});
	};

	// This is just for the case that the browser window is resized
	var resizeTimer = null;
	$(window).bind('resize', function() {
		// hide all the images until we resize them
		$('.Collage .Image_Wrapper').css("opacity", 0);
		// set a timer to re-apply the plugin
		if (resizeTimer)
			clearTimeout(resizeTimer);
		resizeTimer = setTimeout(collage, 200);
	});
</script>
<noscript>
	<style>
.step {
	width: 100%;
	position: relative;
}

.step
:not
 
(
.active
 
)
{
opacity
:
 
1;
filter
:
 
alpha
(opacity
 
=
99);
-ms-filter
:
 
"
progid
:DXImageTransform
.Microsoft
.Alpha
(opacity=99)";


}
.step:not (.active ) a.jms-link {
	opacity: 1;
	margin-top: 40px;
}
</style>
</noscript>
<script type="text/javascript">
	$(function() {
		var jmpressOpts = {
			animation : {
				transitionDuration : '0.8s'
			}
		};

		$('#jms-slideshow').jmslideshow($.extend(true, {
			jmpressOpts : jmpressOpts
		}, {
			autoplay : true,
			bgColorSpeed : '0.8s',
			arrows : true
		}));
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<nav id="menu-wrap">
					<%@ include file="/WEB-INF/jsp/include/site/header.jsp"%>
				</nav>
			</div>
			<div class="col-md-12 hidden-sm hidden-xs">
				<div id="slide">
					<div id="jms-slideshow" class="jms-slideshow">
						<div class="step" data-color="color-1">
							<div class="jms-content">
								<h3>Just when I thought...</h3>
								<p>From fairest creatures we desire increase, that thereby
									beauty's rose might never die</p>
								<a class="jms-link" href="#">Read more</a>
							</div>
							<!--<img src="img/slide/1.png" />-->
							<img src="${contextPath}/img/site/slide/1.png" alt="1" />
						</div>
						<div class="step" data-color="color-2" data-y="500"
							data-scale="0.4" data-rotate-x="30">
							<div class="jms-content">
								<h3>Holy cannoli!</h3>
								<p>But as the riper should by time decease, his tender heir
									might bear his memory</p>
								<a class="jms-link" href="#">Read more</a>
							</div>
							<!--<img src="img/slide/2.png" />-->
							<img src="${contextPath}/img/site/slide/2.png" alt="1" />
						</div>
						<div class="step" data-color="color-3" data-x="2000" data-z="3000"
							data-rotate="170">
							<div class="jms-content">
								<h3>No time to waste</h3>
								<p>Within thine own bud buriest thy content and, tender
									churl, makest waste in niggarding</p>
								<a class="jms-link" href="#">Read more</a>
							</div>
							<!--<img src="img/slide/3.png" />-->
							<img src="${contextPath}/img/site/slide/3.png" alt="1" />
						</div>
						<div class="step" data-color="color-4" data-x="3000">
							<div class="jms-content">
								<h3>Supercool!</h3>
								<p>Making a famine where abundance lies, thyself thy foe, to
									thy sweet self too cruel</p>
								<a class="jms-link" href="#">Read more</a>
							</div>
							<!--<img src="img/slide/4.png" />-->
							<img src="${contextPath}/img/site/slide/4.png" alt="1" />
						</div>
						<div class="step" data-color="color-5" data-x="4500" data-z="1000"
							data-rotate-y="45">
							<div class="jms-content">
								<h3>Did you know that...</h3>
								<p>Thou that art now the world's fresh ornament and only
									herald to the gaudy spring</p>
								<a class="jms-link" href="#">Read more</a>
							</div>
							<!--<img src="img/slide/5.png" />-->
							<img src="${contextPath}/img/site/slide/5.png" alt="1" />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-3">
				<%@ include file="/WEB-INF/jsp/include/site/sidebar.jsp"%>
			</div>
			<div class="col-md-9" id="content">
				<div id="img-content">
					<section class="Collage effect-parent">
						<decorator:body />
					</section>
				</div>
			</div>
		</div>
		<div class="row" id="footer">
			<%@ include file="/WEB-INF/jsp/include/site/footer.jsp"%>
		</div>
	</div>

</body>
</html>
