
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.web.Locadora.Model.Car"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/listCarStyle.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>Lista de Carros</title>
</head>
<body>
	<table id="cars">
		<caption>Carros</caption>
		<tr>
			<th>Marca</th>
			<th>Modelo</th>
			<th>Preço</th>
		</tr>
		<c:forEach var="car" items="${cars}">
			<tr>
				<td>${car.mark}</td>
				<td>${car.name}</td>
				<td id="price">${car.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>