
/**
 * changes inputs to the login form
 */
function showLogin() {
	document.getElementById("formAuth").setAttribute('action', 'j_security_check');
	document.getElementById("titleForm").innerHTML = 'Connexion';
	document.getElementById("switchForm").setAttribute('onclick', 'showSignup()');
	document.getElementById("switchForm").innerHTML = 's\'inscrire';
	document.getElementById("fullnameForm").style.visibility = 'hidden';
	document.getElementById("submitForm").innerHTML = 'Se connecter';
	document.getElementById("submitForm")
}

/**
 * changes inputs to the signup form
 */
function showSignup() {
	document.getElementById("formAuth").setAttribute('action', 'signup');
	document.getElementById("titleForm").innerHTML = 'Inscription';
	document.getElementById("switchForm").setAttribute('onclick', 'showLogin()');
	document.getElementById("switchForm").innerHTML = 'se connecter';
	document.getElementById("fullnameForm").style.visibility = 'visible';
	document.getElementById("submitForm").innerHTML = 'S\'enregistrer';
}