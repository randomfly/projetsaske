
/**
 * changes inputs to the login form
 */
function showLogin() {
	document.getElementById("formAction").setAttribute('value', 'login');
	document.getElementById("titleForm").innerHTML = 'Connexion';
	document.getElementById("switchForm").setAttribute('onclick', 'showSignup()');
	document.getElementById("switchForm").innerHTML = 's\'inscrire';
	document.getElementById("fullnameForm").style.visibility = 'hidden';
	document.getElementById("submitForm").innerHTML = 'Se connecter';
	/* change input names for JAAS */
	document.getElementById("submitForm")

}

/**
 * changes inputs to the signup form
 */
function showSignup() {
	/* change html attributes to the signup form */
	document.getElementById("formAction").setAttribute('value', 'signup');
	document.getElementById("titleForm").innerHTML = 'Inscription';
	document.getElementById("switchForm").setAttribute('onclick', 'showLogin()');
	document.getElementById("switchForm").innerHTML = 'se connecter';
	document.getElementById("fullnameForm").style.visibility = 'visible';
	document.getElementById("submitForm").innerHTML = 'S\'enregistrer';


}