$("#form-add-areainteresse").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var area = {};
	area.area = $("#area").val();
	area.tipoCargo = $("#tipoCargo").val();
	area.nivelHierarquico = $("#nivelHierarquico").val();
	area.cargo = $("#cargoPretendido").val();
	area.pretensaoSalarial = $("#pretensaoSalarial").val();
	area.candidato = $("#candidato").val();
	
	
	console.log('area > ', area);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/areainteresse/adicionar",
		data: area,

		success: function() {
			$(".close").trigger('click');
			$("#areainteresse").fadeOut(1000).load(" #areainteresse").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-areainteresse")
				.addClass("alert alert-success alert-dismissible")
				.text("OK! Área de interesse adicionada com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
				window.setTimeout(function() {
					$(".alert")
						.fadeTo(1500, 0)
						.slideUp(1500, function(){
							$(this).remove();
						});
				}, 2000);
			
			
		},

		statusCode: {
			406: function(xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				bootbox.alert("Área de Interesse já existe no seu cadastro, por favor escolha outra!");
			},
			
			407: function(xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				bootbox.alert("Desculpe :( , somente três áreas podem ser cadastradas!");
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			bootbox.alert(":( , Algo deu errado, tente novamente!");
		},
		
		complete: function() {
			
		}

	});
});


$("#form-add-experiencia").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var exp = {};
	exp.cargo = $("#cargo").val();
	exp.empresa = $("#empresa").val();
	exp.dataEntrada = $("#dtEntrada").val();
	exp.dataSaida = $("#dtSaida").val();
	exp.atribuicoes = $("#atribuicoesCargo").val();
	exp.periodo = $("#periodo").val();
	exp.candidato = $("#candidato").val();	
	
	console.log('exp > ', exp);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/experiencia/adicionar",
		data: exp,

		success: function() {
			$(".close").trigger('click');
			$("#experiencias").fadeOut(1000).load(" #experiencias").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-experiencia")
				.addClass("alert alert-success alert-dismissible")
				.text("OK! Experiencia adicionado com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
				window.setTimeout(function() {
					$(".alert")
						.fadeTo(1500, 0)
						.slideUp(1500, function(){
							$(this).remove();
						});
				}, 2000);
		},

		statusCode: {
			406: function (xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				bootbox.alert("Esta experiencia já existe, por favor insira outra!!! ");
			},
			
			407: function (xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				bootbox.alert("Desculpe :(, somente as três últimas experiências podem ser cadastradas.");
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			bootbox.alert("Algo deu errado por favor tente novamente.");
		},
		
		complete: function() {
			
		}

	});
});


$("#form-add-certificacao").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var cert = {};
	cert.descricao = $("#certificacao").val();
	cert.dtObtencao = $("#dtObtencao").val();
	cert.candidato = $("#candidato").val();
	
	
	
	console.log('cert > ', cert);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/certificacao/adicionar",
		data: cert,

		success: function() {
			
			$("#certificacao").fadeOut(1000).load(" #certificacao").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-certificacao")
				.addClass("alert alert-success")
				.text("OK! Área de interesse adicionada com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
			
		},

		statusCode: {
			406: function (xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				$("#alert-certificacao")
					.addClass("alert alert-warning alert-dismissible")
					.text("Esta área de interesse já existe, por favor insira outra!!! ")
					.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
					
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert-certificacao")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar esta área de interesse.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-add-curso").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var curso = {};
	curso.descricao = $("#cursoProf").val();
	curso.instituicao = $("#instituicaoCurso").val();
	curso.cargaHoraria = $("#ch").val();
	curso.candidato = $("#candidato").val();
	
	
	console.log('curso > ', curso);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/curso/adicionar",
		data: curso,

		success: function() {
			
			$("#cursos").fadeOut(1000).load(" #cursos").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-curso")
				.addClass("alert alert-success")
				.text("OK! Curso adicionado com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
			
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			bootbox.alert("Algo deu errado por favor tente novamente.");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-add-formacao").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var formacao = {};
	formacao.curso = $("#curso").val();
	formacao.instituicao = $("#instituicao").val();
	formacao.nivel = $("#nivelFormacao").val();
	formacao.dataInicio = $("#dtInicio").val();
	formacao.dataTermino = $("#dtTermino").val();
	formacao.situacao = $("#situacaoFormacao").val();
	formacao.anoConclusao = $("#anoConclusao").val();
	formacao.candidato = $("#candidato").val();
	
	
	console.log('formacao > ', formacao);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/formacao/adicionar",
		data: formacao,

		success: function() {
			$(".close").trigger('click');
			$("#formacoes").fadeOut(1000).load(" #formacoes").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-formacao")
				.addClass("alert alert-success alert-dismissible")
				.text("OK! Formação adicionada com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			
			
		},
		
		statusCode: {
			406: function (xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				bootbox.alert("Desculpe :(, esse nível de formação já existe em seu cadastro!");
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			bootbox.alert(":( , Algo deu errado, tente novamente!");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-add-idioma").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var idioma = {};
	idioma.idioma = $("#idioma").val();
	idioma.nivel = $("#nivelIdioma").val();
	idioma.candidato = $("#candidato").val();
	
	
	
	console.log('idioma > ', idioma);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/idioma/adicionar",
		data: idioma,

success: function() {
			
			$("#idiomas").fadeOut(1000).load(" #idiomas").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-idioma")
				.addClass("alert alert-success")
				.text("OK! Idioma adicionado com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
			
		},
		
		statusCode: {
			406: function (xhr0) {
				console.log("> error: ", xhr0.responseText);
				$(".close").trigger('click');
				$("#alert-idioma")
					.addClass("alert alert-warning alert-dismissible")
					.text("Este idioma já existe, por favor insira outra!!! ")
					.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			$("#alert-idioma")
				.addClass("alert alert-danger alert-dismissible")
				.text("Algo deu errado!!!, não foi possível salvar este idioma.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});
