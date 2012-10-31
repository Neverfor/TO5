<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="<s:url value='/css/bootstrap.css'/>" rel="stylesheet" />
<style>
body {
	padding-top: 60px;
	/* 60px to make the container go all the way to the bottom of the topbar */
}
</style>
<link href="<s:url value="/css/bootstrap-responsive.css"/>"
	rel="stylesheet" />
<link href="<s:url value="/css/ui-lightness/jquery-ui.css"/>"
	rel="stylesheet" />

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="<s:url value="/ico/apple-touch-icon-144-precomposed.png"/>" />
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="<s:url value="ico/apple-touch-icon-114-precomposed.png"/>" />
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="<s:url value="ico/apple-touch-icon-72-precomposed.png"/>" />
<link rel="apple-touch-icon-precomposed"
	href="<s:url value="ico/apple-touch-icon-57-precomposed.png"/>" />
<script src="<s:url value="/js/jquery.js"/>"></script>
</head>

<body>

	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="#">Veilingsite</a>
				<tiles:insertAttribute name="menu" />
			</div>
		</div>
	</div>

	<div class="container">
	<tiles:insertAttribute name="body" />


	</div>
	<!-- /container -->

	<tiles:insertAttribute name="footer" />
</body>
</html>
