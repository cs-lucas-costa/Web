<%@page import="br.com.locadora.model.bean.CarBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="carController" class="br.com.locadora.controllers.CarController"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carros</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="styles/ListCarStyle.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="scripts/ListCarScript.js"></script>

</head>
<body>
	<header>
		<%@ include file="NavBarView.jsp"%>
	</header>
				
		<div class="card-columns">
			<c:forEach var="car" items="${carController.getCars()}" varStatus="status">
				<div class="card">	
					<img class="card-img-top" src="cars/${car.urlImage}" alt="Card image">  
					<div class="card-body">
						<h4 class="card-title">${car.fabricante} ${car.modelo}</h4>
						<p class="card-text">R$ ${car.preco} - ${car.cambio}</p>
						<c:choose>
							<c:when test="${car.disponivel}">
								<button id="alugar" class="btn btn-primary" onclick="alugarCarro(${car.id});">Alugar</button>
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