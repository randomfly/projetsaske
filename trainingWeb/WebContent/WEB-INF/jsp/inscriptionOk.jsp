<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Inscription Ok</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">
	<div id="page">
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		<div id="content">
			<div id="left">left gauche</div>
			<div id="center">
				<h1>Inscription Ok</h1>
				<p>
				<c:out value="${sessionScope.utilisateur.prenom }"></c:out> 
				<c:out value="${sessionScope.utilisateur.nom }"></c:out>
				 &ecirc;tes bien inscrit(e)</p>
			</div>
			<div id="right">right</div>
		</div>
		<jsp:include page="footer/footer.jsp"></jsp:include>
	</div>
</body>
</html>