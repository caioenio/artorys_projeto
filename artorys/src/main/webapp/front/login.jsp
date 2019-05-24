<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
div.a {
	text-align: center;
	color: #0a58ce;
	font-family: "arial";
	font-size: 25px;
}
div.login{
text-align: center;
color: black;
font-size: 25px;

}
</style>
</head>
<body>
	<div class="a">
		<h1>LOGIN</h1>	
	</div>
	
		<div class="login">
		<form action="/artorys/cadastro" method="post">
		Seu Email<br> <input type="text" size="45"><br>
		Sua Senha<br> <input type="text" size="45"><br>
		<br>
		<input type="submit" value="LOGIN"><br>
	</form>
	<h2>Não é Cliente? <a href="cadastro_cliente.jsp" target="_self">Cadastre-se</a></h2>
	</div>
</body>
</html>