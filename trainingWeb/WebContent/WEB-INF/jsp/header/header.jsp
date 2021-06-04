<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
	<img id="logo" src="images/logo.png" />
	<c:if test="${empty pageContext.request.userPrincipal }">
		<form action="j_security_check" method="post" id="formLoginHeader">
			<!-- JAAS -->
			<p>
				<label>identifiant</label><input name="j_username" type="text" />
			</p>
			<p>
				<label>password</label><input name="j_password" type="password" />
			</p>
			<input type="submit">
		</form>
	</c:if>
	<c:if test="${not empty pageContext.request.userPrincipal }">
		<c:out value="${pageContext.request.userPrincipal.name }"></c:out>
		<a id="btnDeconnexion" href="deconnexion">Deconnexion</a>
	</c:if>
	<a href="multilangue?langue=en_US">en</a>
	<a href="multilangue?langue=fr_FR">fr</a>
</header>