$("#form-edit-areainteresse").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var area = {};
	area.id = $("#idArea").val();
	area.area = $("#areaEdit").val();
	area.tipoCargo = $("#tipoCargoEdit").val();
	area.nivelHierarquico = $("#nivelHierarquicoEdit").val();
	area.cargo = $("#cargoPretendidoEdit").val();
	area.pretensaoSalarial = $("#pretensaoSalarialEdit").val();
	area.candidato = $("#candidato").val();
	
	
	console.log('area > ', area);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/areainteresse/editar",
		data: area,

		success: function() {
			
			$("#areainteresse").fadeOut(1000).load(" #areainteresse").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-areainteresse").addClass("alert alert-success").text("OK! Área de interesse editada com sucesso.");
			$(".close").trigger('click');
			
		},
		statusCode: {
			406: function (xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				$("#alert-areainteresse")
					.addClass("alert alert-warning alert-dismissible")
					.text("Esta área de interesse já existe, por favor insira outra!!! ")
					.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
					
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert-areainteresse")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar esta área de interesse.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-certificacao").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var cert = {};
	cert.id = $("#idCertificacao").val();
	cert.descricao = $("#certificacaoEdit").val();
	cert.dtObtencao = $("#dtObtencaoEdit").val();
	cert.candidato = $("#candidato").val();
	
	
	
	console.log('cert > ', cert);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/certificacao/editar",
		data: cert,

		success: function() {
					
			$("#certificacao").fadeOut(1000).load(" #certificacao").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-certificacao")
				.addClass("alert alert-success")
				.text("OK! Certificação editada com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
			
		},
		statusCode: {
			406: function (xhr) {
				console.log("> error: ", xhr.responseText);
				$(".close").trigger('click');
				$("#alert-areainteresse")
					.addClass("alert alert-warning alert-dismissible")
					.text("Esta certificação já existe, por favor insira outra!!! ")
					.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
					
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert-certificacao")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar esta certificação.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-curso").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var curso = {};
	curso.id = $("#idCurso").val();
	curso.descricao = $("#cursoProfEdit").val();
	curso.instituicao = $("#instituicaoCursoEdit").val();
	curso.cargaHoraria = $("#chEdit").val();
	curso.anoConclusao = $("#anoConclusaoEdit").val();
	curso.candidato = $("#candidato").val();
	
	
	console.log('curso > ', curso);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/curso/editar",
		data: curso,

		success: function() {
			
			$("#alert-curso").addClass("alert alert-success").text("OK! Curso editado com sucesso.");
			$("#cursos").fadeOut(1000).load(" #cursos").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$(".close").trigger('click');
			
		},
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert-curso").addClass("alert alert-danger").text("Não foi possível salvar esta formação.");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-experiencia").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var exp = {};
	exp.id = $("#idExperiencia").val();
	exp.cargo = $("#cargoEdit").val();
	exp.empresa = $("#empresaEdit").val();
	exp.dataEntrada = $("#dtEntradaEdit").val();
	exp.dataSaida = $("#dtSaidaEdit").val();
	exp.periodo = $("#periodoEdit").val();
	exp.atribuicoes = $("#atribuicoesCargoEdit").val();
	exp.candidato = $("#candidato").val();	
	
	console.log('exp > ', exp);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/experiencia/editar",
		data: exp,

		success: function() {
			
			$("#experiencias").fadeOut(1000).load(" #experiencias").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-experiencia")
				.addClass("alert alert-success")
				.text("OK! Experiencia editada com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
			
			
		},

		statusCode: {
			406: function (xhr0) {
				console.log("> error: ", xhr0.responseText);
				$(".close").trigger('click');
				$("#alert-experiencia")
					.addClass("alert alert-warning alert-dismissible")
					.text("Esta experiencia já existe, por favor insira outra!!! ")
					.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
					
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			$("#alert-experiencia")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar esta experiencia.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-formacao").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var formacao = {};
	formacao.id = $("#idFormacao").val();
	formacao.curso = $("#cursoEdit").val();
	formacao.instituicao = $("#instituicaoEdit").val();
	formacao.nivel = $("#nivelFormacaoEdit").val();
	formacao.dataInicio = $("#dtInicioEdit").val();
	formacao.dataTermino = $("#dtTerminoEdit").val();
	formacao.situacao = $("#situacaoFormacaoEdit").val();
	formacao.anoConclusao = $("#anoConclusaoEdit").val();
	formacao.candidato = $("#candidato").val();
	
	
	console.log('formacao > ', formacao);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/formacao/editar",
		data: formacao,

		success: function() {
			
			$("#formacoes").fadeOut(1000).load(" #formacoes").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$("#alert-formacao")
				.addClass("alert alert-success")
				.text("OK! Formação editada com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
			
			
		},

		statusCode: {
			406: function (xhr0) {
				console.log("> error: ", xhr0.responseText);
				$(".close").trigger('click');
				$("#alert-experiencia")
					.addClass("alert alert-warning alert-dismissible")
					.text("Esta formacao já existe, por favor insira outra!!! ")
					.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
					
			}
		},
		
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			$("#alert-experiencia")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar esta experiencia.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-idioma").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var candidato = {};
	candidato.id = $("#idIdioma").val();
	candidato.candidato = $("#candidatoEdit").val();
	candidato.nivel = $("#nivelIdiomaEdit").val();
	candidato.candidato = $("#candidato").val();
	
	
	console.log('candidato > ', candidato);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/candidato/editar",
		data: candidato,

		success: function() {
			
			$("#alert").addClass("alert alert-success").text("OK! Idioma adicionado com sucesso.");
			$("#candidatos").fadeOut(1000).load(" #candidatos").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$(".close").trigger('click');
			
		},
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert").addClass("alert alert-danger").text("Não foi possível salvar este candidato.");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-perfilprofissional").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var candidato = {};
	candidato.cpf = $("#cpfEdit").val();
	candidato.nome = $("#nomeEdit").val();
	candidato.email = $("#emailEdit").val();
	candidato.senha = $("#senhaEdit").val();
	candidato.cep = $("#cepEdit").val();
	candidato.logradouro = $("#logradouroEdit").val();
	candidato.complemento = $("#complementoEdit").val();
	candidato.bairro = $("#bairroEdit").val();
	candidato.cidade = $("#cidadeEdit").val();
	candidato.uf = $("#ufEdit").val();
	candidato.numero = $("#numeroEdit").val();
	candidato.telefone = $("#telefoneEdit").val();
	candidato.celularUm = $("#celularUmEdit").val();
	candidato.celularDois = $("#celularDoisEdit").val();
	candidato.whatsapp = $("#whatsappEdit").val();
	candidato.twitter = $("#twitterEdit").val();
	candidato.facebook = $("#facebookEdit").val();
	candidato.instagram = $("#instagramEdit").val();
	candidato.linkedin = $("#linkedinEdit").val();
	candidato.rg = $("#rgEdit").val();
	candidato.tituloeleitoral = $("#tituloeleitoralEdit").val();
	candidato.zona = $("#zonaEdit").val();
	candidato.secao = $("#secaoEdit").val();
	candidato.orgaoemissorrg = $("#orgaoemissorrgEdit").val();
	candidato.cnh = $("#cnhEdit").val();
	candidato.categoriacnh = $("#categoriacnhEdit").val();
	candidato.dtNascimento = $("#dtNascimentoEdit").val();
	candidato.nacionalidade = $("#nacionalidadeEdit").val();
	candidato.ufNascimento = $("#ufNascimentoEdit").val();
	candidato.cidadeNascimento = $("#cidadeNascimentoEdit").val();
	candidato.qtFilhos = $("#qtFilhosEdit").val();
	candidato.estadoCivil = $("#estadoCivilEdit").val();
	candidato.genero = $("#generoEdit").val();
	candidato.pcd = $("#pcdEdit").val();
	candidato.deficiencia = $("#deficienciaEdit").val();
	candidato.cartadeapresentacao = $("#cartadeapresentacaoEdit").val();
	candidato.objetivosprofissionais = $("#objetivosprofissionaisEdit").val();
	candidato.competencias = $("#competenciasEdit").val();
	
	console.log('candidato > ', candidato);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/candidato/editar",
		data: candidato,

		success: function() {
			
			$("#perfilprofissional").fadeOut(1000).load(" #perfilprofissional").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$(".close").trigger('click');
			$("#alert")
				.addClass("alert alert-success")
				.text("OK! Dados editados com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			
			
		},
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			$("#alert")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar os dados.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-objetivos").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var candidato = {};
	candidato.cpf = $("#cpfEdit2").val();
	candidato.nome = $("#nomeEdit2").val();
	candidato.email = $("#emailEdit2").val();
	candidato.senha = $("#senhaEdit2").val();
	candidato.cep = $("#cepEdit2").val();
	candidato.logradouro = $("#logradouroEdit2").val();
	candidato.complemento = $("#complementoEdit2").val();
	candidato.bairro = $("#bairroEdit2").val();
	candidato.cidade = $("#cidadeEdit2").val();
	candidato.uf = $("#ufEdit2").val();
	candidato.numero = $("#numeroEdit2").val();
	candidato.telefone = $("#telefoneEdit2").val();
	candidato.celularUm = $("#celularUmEdit2").val();
	candidato.celularDois = $("#celularDoisEdit2").val();
	candidato.whatsapp = $("#whatsappEdit2").val();
	candidato.twitter = $("#twitterEdit2").val();
	candidato.facebook = $("#facebookEdit2").val();
	candidato.instagram = $("#instagramEdit2").val();
	candidato.linkedin = $("#linkedinEdit2").val();
	candidato.rg = $("#rgEdit2").val();
	candidato.tituloeleitoral = $("#tituloeleitoralEdit2").val();
	candidato.zona = $("#zonaEdit2").val();
	candidato.secao = $("#secaoEdit2").val();
	candidato.orgaoemissorrg = $("#orgaoemissorrgEdit2").val();
	candidato.cnh = $("#cnhEdit2").val();
	candidato.categoriacnh = $("#categoriacnhEdit2").val();
	candidato.dtNascimento = $("#dtNascimentoEdit2").val();
	candidato.nacionalidade = $("#nacionalidadeEdit2").val();
	candidato.ufNascimento = $("#ufNascimentoEdit2").val();
	candidato.cidadeNascimento = $("#cidadeNascimentoEdit2").val();
	candidato.qtFilhos = $("#qtFilhosEdit2").val();
	candidato.estadoCivil = $("#estadoCivilEdit2").val();
	candidato.genero = $("#generoEdit2").val();
	candidato.fumante = $("#fumanteEdit2").val();
	candidato.pcd = $("#pcdEdit2").val();
	candidato.deficiencia = $("#deficienciaEdit2").val();
	candidato.cartadeapresentacao = $("#cartadeapresentacaoEdit2").val();
	candidato.objetivosprofissionais = $("#objetivosprofissionaisEdit2").val();
	candidato.competencias = $("#competenciasEdit2").val();

	
	console.log('candidato > ', candidato);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/candidato/editar",
		data: candidato,

		success: function() {
			
			$("#alert").addClass("alert alert-success").text("OK! Idioma adicionado com sucesso.");
			$("#objetivos").fadeOut(1000).load(" #objetivos").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$(".close").trigger('click');
			
		},
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert").addClass("alert alert-danger").text("Não foi possível salvar este candidato.");
		},
		
		complete: function() {
			
		}

	});
});

$("#form-edit-habilidades").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var candidato = {};
	candidato.cpf = $("#cpfEdit3").val();
	candidato.competencias = $("#competenciasEdit3").val();

	
	console.log('candidato > ', candidato);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/habilidades/editar",
		data: candidato,

		success: function() {
			
			$("#habilidades").fadeOut(1000).load(" #habilidades").fadeIn(1000);
			$("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
			$(".close").trigger('click');
			$("#alert-habilidades")
				.addClass("alert alert-success")
				.text("OK! Dados editados com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			
			
		},
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$(".close").trigger('click');
			$("#alert-habilidades")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar os dados.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
		},
		
		complete: function() {
			
		}

	});
});
$("#form-edit-dadospessoais").submit(function(evt) {
	//bloquear o comportamento padrão do submit
	evt.preventDefault();
	
	var url = window.location.href; 
	var tipo = url.split("/")

	var candidato = {};
	candidato.cpf = $("#cpf").val();
	candidato.nome = $("#nome").val();
	candidato.email = $("#email").val();
	candidato.senha = $("#senha").val();
	candidato.cep = $("#cep").val();
	candidato.logradouro = $("#logradouro").val();
	candidato.complemento = $("#complemento").val();
	candidato.bairro = $("#bairro").val();
	candidato.cidade = $("#cidade").val();
	candidato.uf = $("#uf").val();
	candidato.numero = $("#numero").val();
	candidato.telefone = $("#telefone").val();
	candidato.celularUm = $("#celularUm").val();
	candidato.celularDois = $("#celularDois").val();
	candidato.whatsapp = $("#whatsapp").val();
	candidato.twitter = $("#twitter").val();
	candidato.facebook = $("#facebook").val();
	candidato.instagram = $("#instagram").val();
	candidato.linkedin = $("#linkedin").val();
	candidato.rg = $("#rg").val();
	candidato.tituloeleitoral = $("#tituloeleitoral").val();
	candidato.zona = $("#zona").val();
	candidato.secao = $("#secao").val();
	candidato.orgaoemissorrg = $("#orgaoemissorrg").val();
	candidato.cnh = $("#cnh").val();
	candidato.categoriacnh = $("#categoriacnh").val();
	candidato.dtNascimento = $("#dtNascimento").val();
	candidato.nacionalidade = $("#nacionalidade").val();
	candidato.ufNascimento = $("#ufNascimento").val();
	candidato.cidadeNascimento = $("#cidadeNascimento").val();
	candidato.qtFilhos = $("#qtFilhos").val();
	candidato.estadoCivil = $("#estadoCivil").val();
	candidato.genero = $("#genero").val();
	candidato.pcd = $("#pcd").val();
	candidato.deficiencia = $("#deficiencia").val();
	candidato.cartadeapresentacao = $("#cartadeapresentacao").val();
	candidato.objetivosprofissionais = $("#objetivosprofissionais").val();
	candidato.competencias = $("#competencias").val();
	candidato.exFuncionario = $("#exFuncionario").val();
	candidato.canalComunicacao = $("#canalComunicacao").val();
	candidato.foto = $("#foto").val();

	
	console.log('candidato > ', candidato);
	
	$.ajax({
		method: "POST",
		url: "/"+tipo[3]+"/candidato/editar",
		data: candidato,

		success: function() {
			
			$("#alert")
				.addClass("alert alert-success")
				.text("OK! Dados pessoais editados com sucesso.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			location.reload().fadeOut(1000);
			$(".close").trigger('click');
			
		},
		error: function(xhr) {
			console.log("> error: ", xhr.responseText);
			$("#alert")
				.addClass("alert alert-danger")
				.text("Não foi possível salvar este candidato.")
				.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>");
			$(".close").trigger('click');
		},
		
		complete: function() {
			
		}

	});
});
