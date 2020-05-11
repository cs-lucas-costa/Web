<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="styles/CadastrarCarStyle.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script type="text/javascript" src="scripts/EditCarScript.js"></script>
<title>Loccars</title>
</head>
<body onload="definirCambio(${cambio});">
	<%@ include file="NavBarView.jsp"%>
	<!-- Cadastrar -->	
	<form action="car" method="post">
	
	<!-- ID DO CARRO -->
	<input type="number" hidden="true" name="carroID" value="${car.id}">
	
	<div id="cadastrar-carro" class="container">
		<div class="card">
			<div class="card-body">
				<!-- FABRICANTE -->
				<div class="form-group row">
					<label for="inputFabricante" class="col-sm-2 col-form-label">Fabricante</label>
					<div class="col-sm-10">
						<input type=text class="form-control" id="fabricante" value="${car.fabricante}" disabled="disabled" name="fabricante" placeholder="Fabricante" maxlength="45" required="required">
					</div>		
				</div>	
				
				<!--  MODELO -->
				<div class="form-group row">
					<label for="inputModelo" class="col-sm-2 col-form-label">Modelo</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="modelo" value="${car.modelo}" disabled="disabled" name="modelo" placeholder="Modelo" maxlength="45" required="required">
					</div>		
				</div>		
				
				<!-- CAMBIO -->
  				<fieldset class="form-group">
					<div class="row">
						<legend class="col-form-label col-sm-2 pt-0">Câmbio</legend>
						<div class="col-sm-10">
							<div class="form-check">
								<input class="form-check-input" type="radio" disabled="disabled" name="cambio" id="automatico" value="1">
	  							<label class="form-check-label" for="automatico">Automático</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" disabled="disabled" name="cambio" id="manual" value="2">
	  							<label class="form-check-label" for="manual">Manual</label>
							</div>
						</div>
					</div>
				</fieldset>
					
				<!-- PRECO -->
				<div class="form-group row">
					<label for="inputPreco" class="col-sm-2 col-form-label">Preço</label>
					<div class="col-sm-10">
						<input type="number" class="form-control" value="${car.preco}" disabled="disabled" id="preco" name="preco" placeholder="Preço" min="5000.00" max="1000000.00" step="0.01"  required="required">
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-sm-2">
						<input type="button" id="editarCarro" class="btn btn-secondary" onclick="editarElementos();" value="Editar">
						<input type="button" id="salvarCarro" class="btn btn-primary" value="Salvar" onclick="atualizarCarro();" hidden="true">
					</div>
					<div class="col-sm-4">
						<input type="hidden" name="action" value="delete">
						<button class="btn btn-danger">Excluir</button>
					</div>
				</div>
			</div>	
		</div> 
	</div>
	</form>
</body>
</html>