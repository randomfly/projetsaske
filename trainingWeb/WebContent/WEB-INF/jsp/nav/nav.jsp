<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="messages"></fmt:setBundle>
<nav>
	<ul>
		<li><a href="accueil" title="retour Accueil"><fmt:message
					key="menu.accueil"></fmt:message></a></li>
		<li><a href="inscription" title="s'inscrire">Inscription</a></li>
		<li><a href="consultation" title="consulter">Consultation</a>
			<ul>
				<li><a href="rechercher?typeRecherche=auteur" title="recherche par nom auteur">Rechercher
						par Auteur</a></li>
				<li><a href="rechercher?typeRecherche=titre" title="recherche par titre">Rechercher
						par titre</a></li>

				<li><a href="rechercher?typeRecherche=isbn" title="recherche par isbn">Rechercher
						par isbn</a></li>
			</ul></li>
		<li><a href="contact" title="nous contacter">Contact</a></li>
	</ul>
</nav>