<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de Login</title>
</head>
<body>
	<h1>Login</h1>
	
	<form action=LoginServlet method=post>
	<table>
		<tr>
			<td>Seu nome: </td>
			<td><input type=text name=txtNome></td>
		</tr>
		<tr>
			<td>Sua senha: </td>
			<td><input type=password name=txtSenha></td>
		</tr>
		<tr>
			<td><input type=submit value=Login></td>
		</tr>
	</table>
	</form>
</body>
</html>