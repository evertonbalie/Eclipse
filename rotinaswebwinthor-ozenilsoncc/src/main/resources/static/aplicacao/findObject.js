$(".cpf").blur(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var cpf = $(".cpf").val();
	
	console.log('cpf > ', cpf);
	
	$.ajax({
		method: "POST",
        url: "/"+tipo[3]+"/buscausuario/"+cpf,

		success: function() {
		
		},

		statusCode: {
			404: function(xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				bootbox.alert(":( , Este usuário já existe em nossa base de dados, entre com usuário e senha ou recupere sua senha");
			}
		},

		error: function(xhr) {
			
		}

	});
});