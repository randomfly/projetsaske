<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- MENU -->
<section class="navbar custom-navbar navbar-fixed-top" role="navigation">
	<div class="container">

		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="icon icon-bar"></span> <span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
			<!-- lOGO TEXT HERE -->
			<a href="#home" class="navbar-brand"
				style="color: rgb(41, 202, 142); text-shadow: 1px 1px #becad4; font-size: 2em; font-weight: 600;">IT-Training</a>
		</div>

		<!-- MENU LINKS -->
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-nav-first">
				<li><a href="home" class="smoothScroll">Accueil</a></li>
				<c:if test="${ !isLogged }">
					<li><a href="#about" class="smoothScroll">S'inscrire</a></li>
					<li><a href="#team" class="smoothScroll">Nos formateurs</a></li>
					<li><a href="#courses" class="smoothScroll">Formations</a></li>
					<li><a href="#testimonial" class="smoothScroll">Témoignages</a></li>
					<li><a href="#contact" class="smoothScroll">Contact</a></li>
				</c:if>
				<c:if test="${ isLogged }">
					<li><a href="session">Mes Sessions</a></li>
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${ isLogged}">
						<li class="non-link"><a><i class="fa fa-user-circle"></i>
								${pageContext.request.userPrincipal.name}</a></li>
						<li><a href="logout">se déconnecter</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="session"><i class="fa fa-sign-in"></i>se
								connecter</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</section>