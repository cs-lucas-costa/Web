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