<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-50 p-b-90">
				<form action="j_security_check" class="login100-form validate-form flex-sb flex-w">
					<span class="login100-form-title p-b-51"> Connexion </span>
					<div class="wrap-input100 validate-input m-b-16"
						data-validate="Veuillez entrer une adresse mail valide">
						<input class="input100" type="email" name="j_username"
							placeholder="e-mail@mail.com"> <span class="focus-input100"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-16"
						data-validate="Veuillez entrer le mot de passe">
						<input class="input100" type="password" name="j_password"
							placeholder="mot de passe"> <span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn m-t-17">
						<button class="login100-form-btn">Se Connecter</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>