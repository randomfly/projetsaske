<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="erreur/erreur.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>Consultation</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">
	<div id="page">
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		<div id="content">
			<div id="left">left gauche</div>
			<div id="center">
				<h1>Consultation</h1>
				<table id="tabLivres">
					<thead>
					<tr>
						<th>Id</th>
						<th>isbn</th>
						<th>titre</th>
						<th>date de parution</th>
						<th>prix</th>
						<th></th>
						<th></th>
					</tr>
					<thead>
					<tbody>
					<c:forEach items="${requestScope.livres }" var="livre">
						<tr>
							<td><c:out value="${livre.id }"></c:out></td>
							<td><c:out value="${livre.isbn}"></c:out></td>
							<td><c:out value="${livre.titre }"></c:out></td>
							<td><fmt:formatDate value="${livre.dateDeParution }" pattern="dd MMMM y" /></td>
							<td><fmt:formatNumber value="1234567890" type="currency" currencySymbol="&euro;"/></td>
							<c:if test="${ pageContext.request.isUserInRole('admin') }">
								<td><button onclick='modifierLivre("${livre.id }")'>mod</button></td>
								<td><button onclick='supprimerLivre("${livre.id }")'>sup</button></td>  
							</c:if> 
						</tr>
					</c:forEach>
					</tbody>
				</table>
				
				<button onclick="loadLivres()">Rafraichir</button>
				<c:if test="${ pageContext.request.isUserInRole('admin') }">
				<form action="#" id="ajouterLivreForm" onsubmit="return false;">
						<input type="hidden" name="idLivre" />
						<p><label>isbn</label><input type="text" name="isbn" /></p>
						<p><label>titre</label><input type="text" name="titre" /></p>
						<p><label>date de parution</label><input type="date" name="dateDeParution" /></p>					
						<input type="submit" onclick="ajouterLivre()"/>
				</form>
				</c:if>
			</div>
			<div id="right">right</div>
		</div>
		<jsp:include page="footer/footer.jsp"></jsp:include>
	</div> 
</html>