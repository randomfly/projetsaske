<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Accueil biblioWeb</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">
	<div id="page">
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		<div id="content">
			<div id="left">left gauche</div>
			<div id="center">
				<h1>Accueil</h1>
				<div id="pub">ma pub</div>
			</div>
			<div id="right">right</div>
		</div>
		<jsp:include page="footer/footer.jsp"></jsp:include>
	</div>
</body>
</html>