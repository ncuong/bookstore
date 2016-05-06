<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="website ban sach online">
<meta name="author" content="Tai Bui Thi">

<title>zMedia - Home</title>
<!--old browse-->
<!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!--[if lt IE 9]>
            <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <![endif]-->

<!--[if (gte IE 9) | (!IE)]>
            <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
            <link rel="stylesheet" type="text/css" href="css/style_ie.css" />
        <!<![endif]-->

<!--[if IE]>
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

<link
	href="http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300,300italic"
	rel="stylesheet" type="text/css">

<link rel="stylesheet" type="text/css" href="css/site/style.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/site/examples.css" />
<link rel="stylesheet" type="text/css" href="css/site/transitions.css" />
<link rel="stylesheet" type="text/css" href="css/site/nav-styles.css" />
<link rel="stylesheet" type="text/css" href="css/site/slide-style.css" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/site/nav-script.js"></script>
<script type="text/javascript" src="js/site/jquery.collagePlus.js"></script>
<script type="text/javascript" src="js/site/jquery.removeWhitespace.js"></script>
<script type="text/javascript" src="js/site/jmpress.js"></script>
<script type="text/javascript" src="js/site/jquery.jmslideshow.js"></script>
<script type="text/javascript" src="js/site/modernizr.custom.48780.js"></script>

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
					<ul id="menu">
						<li><a href="#">Home</a></li>
						<li><a href="#">Tutorials</a>
							<ul>
								<li><a href="#">Web Design</a>
									<ul>
										<li><a href="">Html</a></li>
										<li><a href="">CSS</a></li>
										<li><a href="">JavaScript</a></li>
										<li><a href="">jQuyery</a></li>
									</ul></li>
								<li><a href="#">Java</a>
									<ul>
										<li><a href="">Basic</a></li>
										<li><a href="">JSF</a></li>
										<li><a href="">Spring</a></li>
										<li><a href="">Hibernate</a></li>
									</ul></li>
								<li><a href="">PHP</a></li>
								<li><a href="">CMS</a></li>
							</ul></li>
						<li><a href="#">Stories</a>
							<ul>
								<li><a href="#">Doanh nhân</a>
									<ul>
										<li><a href="#s">Steve Job</a></li>
										<li><a href="">Bill Gate</a></li>
									</ul></li>
								<li><a href="#">Truyện cười</a>
									<ul>
										<li><a href="">Việt Nam vô đối</a></li>
										<li><a href="">Truyện cười vô va</a></li>
										<li><a href="">Trạng Quỳnh</a></li>
										<li><a href="">Khác</a></li>
									</ul></li>
								<li><a href="">Truyện tranh</a></li>
							</ul></li>
						<li>
							<!--<a href="">Services</a>--> <a href="#service">Service</a>
						</li>
						<li>
							<!--<a href="">About</a>--> <a href="#about">About</a>
						</li>
						<li>
							<!--<a href="">Contact</a>--> <a href="#contact">Contact</a>
						</li>
						<li>
							<!--<a href="">Contact</a>--> <a href="#login">Log in</a>
						</li>
						<li>
							<!--<a href="">Contact</a>-->

						</li>
					</ul>
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
							<img src="img/site/slide/1.png" alt="1" />
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
							<img src="img/site/slide/2.png" alt="1" />
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
							<img src="img/site/slide/3.png" alt="1" />
						</div>
						<div class="step" data-color="color-4" data-x="3000">
							<div class="jms-content">
								<h3>Supercool!</h3>
								<p>Making a famine where abundance lies, thyself thy foe, to
									thy sweet self too cruel</p>
								<a class="jms-link" href="#">Read more</a>
							</div>
							<!--<img src="img/slide/4.png" />-->
							<img src="img/site/slide/4.png" alt="1" />
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
							<img src="img/site/slide/5.png" alt="1" />
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-3">
				<div id="left-sidebar">
					<section class="Collage effect-parent">
						<div id="cssmenu">
							<ul>
								<li class="active"><a href="#"><span>Home</span></a></li>
								<li class="has-sub"><a href="#"><span>Tutorials</span></a>
									<ul>
										<li><a href="#"><span>Web Design</span></a></li>
										<li><a href="#"><span>Java</span></a></li>
										<li><a href="#"><span>PHP</span></a></li>
										<li class="last"><a href="#"><span>CMS</span></a></li>
									</ul></li>
								<li class="has-sub"><a href="#"><span>Stories</span></a>
									<ul>
										<li><a href="#"><span>Doanh nhân</span></a></li>
										<li><a href="#"><span>Truyện cười</span></a></li>
										<li><a href="#"><span>Thơ</span></a></li>
										<li class="last"><a href="#"><span>Truyện ngắn</span></a></li>
									</ul></li>
								<li class="last"><a href="service"><span>Service</span></a>
								</li>
								<li class="last"><a href="about"><span>About</span></a></li>
								<li class="last"><a href="contact"><span>Contact</span></a>
								</li>
							</ul>
						</div>
					</section>
				</div>
			</div>
			<div class="col-md-9" id="content">
				<!--<div Collage effect-parent>-->
				<div id="img-content">
					<section class="Collage effect-parent">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>

					</section>
				</div>
				<!--</div>-->
			</div>
		</div>
		<div class="row" id="footer">
			<div class="col-md-12">
				<p>
					Design and coding by <a href="mailto:taibt@gmail.com">Tai Bui Thi</a>
				</p>
			</div>
		</div>
	</div>

</body>
</html>
