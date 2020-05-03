<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="styles/CadastrarCarStyle.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Loccars - Cadastrar</title>
</head>
<body>
	<%@ include file="NavBarView.jsp"%>
	<!-- Cadastrar -->	
	<div id="cadastrar-carro" class="container">
		<div class="card">
			<div class="card-body">
			<form action="car" method="post">
				<!-- FABRICANTE -->
				<div class="form-group row">
					<label for="inputFabricante" class="col-sm-2 col-form-label">Fabricante</label>
					<div class="col-sm-10">
						<input type=text class="form-control" id="fabricante" name="fabricante" placeholder="Fabricante" maxlength="45" required="required">
					</div>		
				</div>	
				
				<!--  MODELO -->
				<div class="form-group row">
					<label for="inputModelo" class="col-sm-2 col-form-label">Modelo</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="modelo" name="modelo" placeholder="Modelo" maxlength="45" required="required">
					</div>		
				</div>		
				
				<!-- CAMBIO -->
				<fieldset class="form-group">
					<div class="row">
						<legend class="col-form-label col-sm-2 pt-0">Câmbio</legend>
						<div class="col-sm-10">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="cambio" id="automatico" value="1" checked="checked">
	  							<label class="form-check-label" for="automatico">Automático</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="cambio" id="manual" value="2">
	  							<label class="form-check-label" for="manual">Manual</label>
							</div>
						</div>
					</div>
				</fieldset>
					
				<!-- PRECO -->
				<div class="form-group row">
					<label for="inputPreco" class="col-sm-2 col-form-label">Preço</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" id="preco" name="preco" placeholder="Preço" min="5000.00" max="1000000.00" step="0.01"  required="required">
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-sm-2">
						<button type="submit" class="btn btn-primary">Salvar</button>
					</div>
				</div>
			</form>
			</div>	
		</div> 
	</div>
</body>
</html>