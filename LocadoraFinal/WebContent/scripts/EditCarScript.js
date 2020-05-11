
function definirCambio(cambio) {
	
	const options = document.getElementsByName('cambio');
	var i;

	for(i = 0; i < options.length; i++) {
		
		if (cambio == options[i].value) {
			options[i].checked = true;
		}
	}

}

function editarElementos() {
	
	var editButton = document.getElementById('editarCarro');
	var saveButton = document.getElementById('salvarCarro');
	const inputs = document.getElementsByTagName('INPUT')
	var i;
	
	for(i = 0; i < inputs.length; i++) {
		inputs[i].disabled = false
	}
		
	editButton.hidden = true
	saveButton.hidden = false
}

function atualizarCarro() {
	
	const fabricante = document.getElementById('fabricante').value;
	const modelo = document.getElementById('modelo').value;
	const preco = Number(document.getElementById('preco').value);
	const id = Number(document.getElementById('id').value);
	const automatico = document.getElementById('automatico');
	var cambio;
	const isAlterar = true
	
	if (automatico.checked == true) {
		cambio = 1;
	} else {
		cambio = 2;
	}

	$.ajax({
		type: 'PUT',
		url: `http://localhost:8080/LocadoraFinal/car?id=${id}&modelo=${modelo}&fabricante=${fabricante}&preco=${preco}&cambio=${cambio}&alterar=${isAlterar}`
	}).done (function(){
		window.location.reload();
	})

}




