<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/style/style1.css'/>" >
<link rel="stylesheet" href="<c:url value='/style/layout.css'/>" >
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">

<title><dec:title default="Gjun cake"/></title>
<dec:head/>
<style type="text/css">
a{color:#400000;}
a:hover {
	color: #BD6D6D;
	position: relative;
	top: 1px;
	left: 1px;
}
</style>
</head>
<body>
<div id="bodyWrapper">
		<div id="header">
			<table border="0">
			<tr>
				<td>
					<a href="<c:url value='/index.jsp'/>">
						<img alt="Gjun" src="<c:url value='/images/icon150.png'/>"/></a>
				<td width="400">
				<td>G J U N
			</table>
		</div>	
			<div id="pageBody">
				<div id="sidebar">
					<ul>
						<li><a style=text-decoration:none href="<c:url value='/mporder/cake.jsp'/>" >蛋糕</a></li>			
						<li><a style=text-decoration:none href="<c:url value='/mporder/bread.jsp'/>">麵包</a></li>
						
					</ul>
				</div>
			<dec:body />		
		</div>
				
			<div id="wrapper">
				<p class="btn-gnavi">
					<span></span>
					<span></span>
					<span></span>
				</p>
				<nav id="global-navi">
					<ul class="menu">
						<li><a href="<c:url value='/index.jsp'/>">HOME</a></li>
						<li><a href="<c:url value='/about.jsp'/>">ABOUT</a></li>
						<li><a href="<c:url value='/login.jsp'/>">LOGIN</a></li>
						<li><a href="<c:url value='/qa.jsp'/>">Q & A</a></li>
					</ul>
				</nav>
				
			</div>
			<a href="#"><img src="<c:url value='/images/btn-pagetop.png'/>" alt="↑PAGETOP"></a>	
		<div id="footer">Copyright &copy; 2020 XXX - All Rights Reserved</div>
	</div>
<script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
<script src="<c:url value='/js/js1.js'/>"></script>
</body>
</html>