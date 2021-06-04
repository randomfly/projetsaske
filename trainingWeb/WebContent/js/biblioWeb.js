/**
 * 
 */
/**
 */

/**
 */
function initPage() {

	switch (window.location.pathname) {
		case "/index.html":
			if (getCookie("isPubDisplayed") == "") {
				//on affiche la pub
				document.querySelector("#pub").style.display = 'block';
				//on maj le cookie
				document.cookie = 'isPubDisplayed=true';
			}

			break;

		case "/inscription.html":
			//mise en place des callback sur la page
			document.querySelector("#continent").onchange = majPays;

			break;
		default:
			break;
	}
}


function loadPaysAmericain() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.querySelector("#pays").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "paysAmericain.html", true);
	//appel au serveur
	xhttp.send();
}

function loadLivres() {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			let options = {year: "numeric", month: "long", day: "2-digit"};
			let livres = JSON.parse(this.responseText);
			let livresHTML = "";
			livres.forEach(element => livresHTML += "<tr><td>" + element.id + "</td><td>" + element.isbn + "</td><td>" + element.titre + "</td><td>"
			 + (new Date(element.dateDeParution)).toLocaleDateString("fr-FR", options) + 
		"</td><td><button onclick='modifierLivre(" + element.id + ")'>mod</button></td>"+
		"<td><button onclick='supprimerLivre(" + element.id + ")'>sup</button></td></tr>");
			let tbody = document.querySelector("#tabLivres tbody");
			tbody.innerHTML = livresHTML;
			console.log(livres);
		}
	};
	xhttp.open("GET", "/biblioRS/serviceRS/livre/livres", true);
	//appel au serveur
	xhttp.send();
}
function modifierLivre(id) {
	//recuperation du livre a partir de l'id
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			let livre = JSON.parse(this.responseText);
			//maj des champs du livre dans la zone d'update
			majUpdateLivre(livre);
		}else if (this.readyState == 4 && this.status == 204) {
			confirm("liste livres plus a jour");
			//on raffraichit la liste
			loadLivres();
		}
	};
	xhttp.open("GET", "/biblioRS/serviceRS/livre/" + id, true);
	//appel au serveur
	xhttp.send();
	
}
function majUpdateLivre(livre){
	//maj du id
	document.querySelector("#ajouterLivreForm input[name='idLivre']").value=livre.id;
	//maj du isbn
	document.querySelector("#ajouterLivreForm input[name='isbn']").value=livre.isbn;
	//maj du titre
	document.querySelector("#ajouterLivreForm input[name='titre']").value=livre.titre;
	//maj de date de parution
	let dateDeParution=new Date(livre.dateDeParution);
	//let chaineDateDeParution=dateDeParution.getFullYear+"-"+""  //2021-05-20
	document.querySelector("#ajouterLivreForm input[name='dateDeParution']").value=dateDeParution.toISOString().split("T")[0];
}



function supprimerLivre(id) {
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			alert("livre supprime");
			loadLivres();
		}
	};
	xhttp.open("DELETE", "/biblioRS/serviceRS/livre/" + id, true);
	//appel au serveur
	xhttp.send();
}
var Livre = class {
	constructor() { }
	/* truc() {
	   return "Coucou monde !";
	 }*/
};


function ajouterLivre() {
	var xhttp = new XMLHttpRequest();
	
	//recuperation des champs du formulaire
	let ajouterLivreForm = document.querySelector("#ajouterLivreForm");
	let livre = new Livre();
	livre.id = ajouterLivreForm.querySelector("input[name='idLivre']").value;
	livre.isbn = ajouterLivreForm.querySelector("input[name='isbn']").value;
	livre.titre = ajouterLivreForm.querySelector("input[name='titre']").value;
	livre.dateDeParution = ajouterLivreForm.querySelector("input[name='dateDeParution']").value;
	
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			loadLivres();
		}
	};
	if(livre.id != undefined){
		//update
		xhttp.open("PUT", "/biblioRS/serviceRS/livre", true);
	}else{
		//ajout d un livre
		xhttp.open("POST", "/biblioRS/serviceRS/livre", true);

	}
	//raz des champs du livre dans le formulaire
	//maj du id
	document.querySelector("#ajouterLivreForm input[name='idLivre']").value="";
	//maj du isbn
	document.querySelector("#ajouterLivreForm input[name='isbn']").value="";
	//maj du titre
	document.querySelector("#ajouterLivreForm input[name='titre']").value="";
	//date de parution
	document.querySelector("#ajouterLivreForm input[name='dateDeParution']").value="";
	
	xhttp.setRequestHeader('Content-type',
			'application/json; charset=utf-8');
	//appel au serveur
	xhttp.send(JSON.stringify(livre));
	return false;
}

function getCookie(cname) {
	let name = cname + "=";
	let decodedCookie = decodeURIComponent(document.cookie);
	let ca = decodedCookie.split(';');
	for (let i = 0; i < ca.length; i++) {
		let c = ca[i];
		while (c.charAt(0) == ' ') {
			c = c.substring(1);
		}
		if (c.indexOf(name) == 0) {
			return c.substring(name.length, c.length);
		}
	}
	return "";
}
function majPays() {
	let eltContinent = document.querySelector("#continent");

	let eltPays = document.querySelector("#pays");
	let continent = eltContinent.value;

	//vidage de la liste
	eltPays.innerHTML = "<option value=''></option>";

	//remplissage avec la liste des pays du continent
	switch (continent) {
		case "afrique":
			eltPays.insertAdjacentHTML('beforeend', "<option value='Maroc'>Maroc</option>");
			eltPays.insertAdjacentHTML('beforeend', "<option value='Senegal'>Sénégal</option>");
			break;
		case "asie":
			eltPays.insertAdjacentHTML('beforeend', "<option value='Chine'>Chine</option>");
			eltPays.insertAdjacentHTML('beforeend', "<option value='Japon'>Japon</option>");
			break;
		case "europe":
			eltPays.insertAdjacentHTML('beforeend', "<option value='France'>France</option>");
			eltPays.insertAdjacentHTML('beforeend', "<option value='Italie'>Italie</option>");
			break;
		case "amerique":
			loadPaysAmericain();
			break;
		default:
			break;
	}
}

function toggleSectionEnfants() {

	let sectionEnfants = document.getElementById("sectionEnfants");
	/*alert(sectionEnfants.querySelector("legend").childNodes[0].nextSibling.nodeValue);
	alert(document.forms[0][3].value);*/
	/*if(sectionEnfants.stye.display == ""){
		sectionEnfants.style.display="block";
	}else{
		sectionEnfants.style.display="";
	}*/

	sectionEnfants.style.display = (sectionEnfants.style.display == "") ? "block" : "";

}
if (window.localStorage.maVariable == undefined) {
	/*document.maVariable=0;*/
	window.localStorage.maVariable = 0;
	document.cookie = 'maVariable=0';
}
function compter() {
	//document.maVariable++;
	window.localStorage.maVariable++;
	alert(window.localStorage.maVariable);
}


function afficherNomPrenomEnfants() {
	//recuperation du nombre d enfants demande
	let nbrEnfants = document.querySelector("#nbrEnfants").value;
	//recuperation du nbr enfants affiches
	let listeEnfants = document.querySelectorAll("#sectionEnfants section div");
	let nbrEnfantsAffiches = listeEnfants.length;
	//recuperation de la section
	let section = document.querySelector("#sectionEnfants section");

	//si nbrEnfants affiche == 0
	if (nbrEnfantsAffiches == 0) {
		let enfants = "";
		for (i = 1; i <= nbrEnfants; i++) {
			enfants += "<div><h2>Enfant " + i + "</h2><p>" + "<label>nom</label>" +
				"<input type='text' name='nomEnfant" + i + "' /></p></div>";
		}
		section.innerHTML = enfants;
	} else {
		//si nbrEnfantsAffiches>nbrEnfants
		if (nbrEnfantsAffiches > nbrEnfants) {
			//on en supprime nbrEnfantsAffiches-nbrEnfants
			for (i = 1; i <= nbrEnfantsAffiches - nbrEnfants; i++) {
				section.removeChild(listeEnfants[nbrEnfantsAffiches - i]);
			}
		} else {
			let enfants = "";
			for (i = 1; i <= nbrEnfants - nbrEnfantsAffiches; i++) {
				enfants += "<div><h2>Enfant " + (nbrEnfantsAffiches + i) + "</h2><p>" + "<label>nom</label>" +
					"<input type='text' name='nomEnfant" + (nbrEnfantsAffiches + i) + "' /></p></div>";
			}
			section.insertAdjacentHTML('beforeend', enfants);
		}
	}
}
