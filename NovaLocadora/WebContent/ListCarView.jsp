<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <jsp:useBean id="carBO" class="br.com.Locadora.model.bo.CarBO"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Cars</title>
</head>
<body>
	<ul class="list-group list-group-flush">
		<c:forEach var="car" items="${carBO.getAllCars()}">
			<li class="list-group-item">${car.fabricante} - ${car.nome}
				<span class="pull-right">
					<label>
						R$ ${car.valor}
					</label>
				</span>
			</li>
		</c:forEach>
	</ul>
</body>
</html>