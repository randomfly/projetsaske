
/**
 * changes inputs to the login form
 */
function showLogin() {
	document.getElementById("formAction").setAttribute('value', 'login');
	document.getElementById("titleForm").innerHTML = 'Connexion';
	document.getElementById("switchForm").setAttribute('onclick', 'showSignup()');
	document.getElementById("switchForm").innerHTML = 's\'inscrire';
	document.getElementById("fullnameForm").style.visibility = 'hidden';
	document.getElementById("submitForm").setAttribute('value','Se connecter');
	/* change input names for JAAS */
	document.getElementById("formAuth").setAttribute('action', 'j_security_check');
	document.getElementById("emailForm").setAttribute('name', 'j_username');
	document.getElementById("passwordForm").setAttribute('name', 'j_password');
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
	document.getElementById("submitForm").setAttribute('value','S\'enregistrer');
	/* revert the changes of JAAS */
	document.getElementById("formAuth").setAttribute('action', '');
	document.getElementById("emailForm").setAttribute('name', 'login');
	document.getElementById("passwordForm").setAttribute('name', 'password');

}