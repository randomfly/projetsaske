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
			<a href="#" class="navbar-brand">Known</a>
		</div>

		<!-- MENU LINKS -->
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-nav-first">
				<li><a href="home" class="smoothScroll">Home</a></li>
				<c:if test="${ !isLogged }">
					<li><a href="#about" class="smoothScroll">About</a></li>
					<li><a href="#team" class="smoothScroll">Our Teachers</a></li>
					<li><a href="#courses" class="smoothScroll">Courses</a></li>
					<li><a href="#testimonial" class="smoothScroll">Reviews</a></li>
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