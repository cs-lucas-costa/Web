function alugarCarro(id) {
			
	$.ajax({
		url : `http://localhost:8080/LocadoraFinal/car?id=${id}`,
		type : 'PUT',
		sucess: function(message){
			console.log(message);
		},
		error: function(message){
			console.log(message);
		}
	}).done (function() {
		window.location.reload();
	})
}

function editarCarro(id) {
	$.ajax({
		url : `http://localhost:8080/LocadoraFinal/car?id=${id}`,
		type : 'GET',
		sucess: function(message){
			console.log(message);
		},
		error: function(message){
			console.log(message);
		}
	})
}

//Filtrar carros
$(document).ready(function(){
	$("#txtSearch").on("keyup", function(){
		var value = $(this).val().toLowerCase();
		$(".card .card-body .card-title").filter(function(){
			$(this).parent().parent().toggle($(this).text().toLowerCase().indexOf(value)>=0)
		});
	});
});
