<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Inscription</title>
<%@include file="head/head.jsp" %>
</head>
<body onload="initPage()">
	<div id="page">
		<jsp:include page="header/header.jsp"></jsp:include>
		<%@include file="nav/nav.jsp" %>
		<div id="content">
			<div id="left">left gauche</div>
				<div id="center">
				<h1>Inscription</h1>
				<button onclick="compter()">Compter</button>
				<form action="inscription" method="post" id="inscriptionForm">
					<p class="erreur"><c:out value="${requestScope.erreur }" escapeXml="false"></c:out> </p>
					<fieldset>
						<legend>Vous</legend>
						<p>
							<label>civilit&eacute;</label> <input type="radio"
								name="civilite" value="h" />Mr <input type="radio"
								name="civilite" value="femme" />Mme
						</p>
						<p>
							<label>nom</label><input required="required" value="${sessionScope.utilisateur.nom }" type="text" title="saisir votre nom" name="nom" placeholder="saisir votre nom"/>
						</p>
						<p>
							<label>prenom</label><input value="${sessionScope.utilisateur.prenom }" type="text" name="prenom" />
						</p>
						<p>
							<label>password</label><input type="password" name="password" />
						</p>
						<p>
							<label>date de naissance</label><input type="date"
								name="dateDeNaissance" />
						</p>
						<p>
							<label>Continent</label> 
								<select id="continent" name="continent">
								<option value=""></option>
								<option value="asie">Asie</option>
								<option value="afrique">Afrique</option>
								<option value="amerique">Amerique</option>
								<option value="europe">Europe</option>
							</select>
							<label>Pays</label> 
								<select id="pays">
								<option value=""></option>
							</select>
						</p>


						<p>
							<label>Avez vous des enfants</label><input
								onchange="toggleSectionEnfants()" type="checkbox"
								name="isEnfant" />oui
						</p>
					</fieldset>
					<fieldset id="sectionEnfants">
						<legend>
							<!-- coucou -->
							Enfants
						</legend>
						<p>
							<label>nbr enfants</label><input id="nbrEnfants"
								onchange="afficherNomPrenomEnfants()" type="number"
								name="nbrEnfants" min="1" value="" />
						</p>
						<section></section>
					</fieldset>
					<input type="submit" value="envoyer" />
				</form>
			</div>
			<div id="right">right</div>
		</div>
		<jsp:include page="footer/footer.jsp"></jsp:include>
	</div>
</body>
</html>