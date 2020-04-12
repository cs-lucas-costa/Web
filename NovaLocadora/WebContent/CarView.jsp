<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/LoginViewStyle.css">
<title>Car</title>
</head>
<body>
	<div class="container center_div">
		<form class="form-horizontal" action="car" method="get">
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-1">
					<label for="nome">Nome</label>
					<input type="text" class="form-control" name="nome" placeholder="Nome" required="required">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-1">
					<label for="fabricante">Fabricante</label>
					<input type="text" class="form-control" name="fabricante" placeholder="Fabricante" required="required">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-1">
					<label for="valor">Valor R$</label>
					<input type="number" class="form-control" name="valor" placeholder="Valor" min="5000" max="1000000" required="required">
				</div>
			</div>
			<div class="form-group">
				<div class="text-center">
					<button type="submit" class="btn btn-primary">Create</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>