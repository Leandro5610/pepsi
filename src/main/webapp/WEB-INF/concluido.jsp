<%@page import="site_pepsi.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	div {
	position:absolute;
	top:40%;
	left:45%;
	padding:20px;
	width: 200px;
	border: 2px solid #fff;
	border-radius:25px;
	background: #fff;
	text-align: center;
}
div p , h1{
	color: #0062be;
}
body{
	background-color: #0062be;
}



</style>
</head>
<body>
	
	<%
		Pessoa pessoa = (Pessoa)request.getAttribute("pessoa");
	%>
	<div>
		<h1>Cadastrado com sucesso</h1>
		<p>${genero} ${pessoa.nome} ${pessoa.sbNome} ${dia }</p>
	</div>
</body>
</html>