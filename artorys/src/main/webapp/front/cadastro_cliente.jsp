<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
<style type="text/css">
div.cadastro {
	background: blue;
	text-align: center;
	color: white;
	font-size: 25px;
	text-align: center;
}

div.a {
	text-align: center;
}
</style>
</head>
<body>

	<div class="a">
		<h1>Cadastro Cliente</h1>
	</div>

	<div class="cadastro">

		<form action="/artorys/cadastro" method="post">
			Nome<br> <input type="text" size="45" name="nome"><br>
			CPF<br> <input type="text" size="45" name="cpf"><br>
			Telefone<br> <input type="text" size="45" name="telefone"><br>
			Email<br> <input type="text" size="45" name="email"><br>
			Senha<br> <input type="text" size="45" name="senha"><br>
			<br> <input type="submit" size="45" value="SALVAR"><br>

		</form>
	</div>
</body>
</html>