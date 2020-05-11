<%@page import="br.com.locadora.model.bean.CarBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="carController" class="br.com.locadora.controllers.CarController"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loccars</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="styles/ListCarStyle.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script type="text/javascript" src="scripts/ListCarScript.js"></script>

</head>
<body>
	<header>
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
		<a class="navbar-brand" href="HomeView.jsp">Loccars</a> 
		
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			    <li class="nav-item">
			      	<a class="nav-link" href="ListCarView.jsp">Alugar</a>
			    </li>
			     <li class="nav-item">
		     		<a class="nav-link" href="CadastrarCarView.jsp">Cadastrar</a>
		   		</li>
		   		<li class="nav-item">
		     		<a class="nav-link" href="loginView.htm">Sair</a>
		   		</li>
			</ul>  
			<form class="form-inline my-2 my-lg-0">
				<input id="txtSearch" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
			</form>
		</div>
	</nav>
	</header>		
	<div class="card-columns">
		<c:forEach var="car" items="${carController.getCars()}">
			<div class="card">	
				<img class="card-img-top" src="cars/${car.urlImage}" alt="Card image">  
				<div class="card-body">
					<h4 class="card-title">${car.fabricante} ${car.modelo}</h4>
					<p class="card-text">R$ ${car.preco} - ${car.cambio}</p>
					<c:choose>
						<c:when test="${car.disponivel}">			
							<form method="get" action="car">
								<input type="number" name="carroID" value='${car.id}' hidden="true">
								<input type="button" id="alugar" class="btn btn-primary" value="Alugar" onclick="alugarCarro(${car.id});">
								<button id="editar" type="submit" class="btn btn-secondary">Editar</button>
							</form>
						</c:when>
						<c:otherwise>
							<button class="btn btn-danger disabled">Alugado</button>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>