$("#modal-editFormacao").on('show.bs.modal', function (event) {
	
  var button = $(event.relatedTarget)

  var id = button.data('idformacao')
  var curso = button.data('cursoformacao') 
  var instituicao = button.data('instformacao')
  var datainicio = button.data('datainicio')
  var datatermino = button.data('datatermino')
  var nivelformacao = button.data('nivelformacao')
  var situacaoformacao = button.data('situacaoformacao')
  var anoconclusao = button.data('anoconclusao')
  
  
  var modal = $(this)

  modal.find('#idFormacao').val(id)
  modal.find('#cursoEdit').val(curso)
  modal.find('#instituicaoEdit').val(instituicao)
  modal.find('#dtInicioEdit').val(datainicio)
  modal.find('#dtTerminoEdit').val(datatermino)
  modal.find('#nivelFormacaoEdit').val(nivelformacao)
  modal.find('#situacaoFormacaoEdit').val(situacaoformacao)
  modal.find('#anoConclusaoEdit').val(anoconclusao)
});

$("#modal-editExperiencia").on('show.bs.modal', function (event) {
	
  var button = $(event.relatedTarget)

  var id = button.data('idexperiencia')
  var cargo = button.data('cargo') 
  var empresa = button.data('empresa')
  var dataentrada = button.data('dataentrada')
  var datasaida = button.data('datasaida')
  var atribuicoes = button.data('atribuicoes')
  
  
  var modal = $(this)

  modal.find('#idExperiencia').val(id)
  modal.find('#cargoEdit').val(cargo)
  modal.find('#empresaEdit').val(empresa)
  modal.find('#dtEntradaEdit').val(dataentrada)
  modal.find('#dtSaidaEdit').val(datasaida)
  modal.find('#atribuicoesCargoEdit').val(atribuicoes)
});

$("#modal-editIdioma").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var id = button.data('ididioma')
	  var idioma = button.data('idioma') 
	  var nivelIdioma = button.data('nivelidioma')

	  
	  
	  var modal = $(this)

	  modal.find('#idIdioma').val(id)
	  modal.find('#idiomaEdit').val(idioma)
	  modal.find('#nivelIdiomaEdit').val(nivelIdioma)

});

$("#modal-editCurso").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var id = button.data('idcurso')
	  var descricao = button.data('descricaocurso') 
	  var instituicao = button.data('instcurso')
	  var ch = button.data('chcurso')
	  
	  
	  var modal = $(this)

	  modal.find('#idCurso').val(id)
	  modal.find('#cursoProfEdit').val(descricao)
	  modal.find('#instituicaoCursoEdit').val(instituicao)
	  modal.find('#chEdit').val(ch)

});

$("#modal-editCertificacao").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var id = button.data('idcertificacao')
	  var descricao = button.data('certificacao') 
	  var dtObtencao = button.data('dtobtencao')
	  
	  
	  var modal = $(this)

	  modal.find('#idCertificacao').val(id)
	  modal.find('#certificacaoEdit').val(descricao)
	  modal.find('#dtObtencaoEdit').val(dtObtencao)

});

$("#modal-editAreaInteresse").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var id = button.data('idarea')
	  var area = button.data('area') 
	  var tipocargo = button.data('tipocargo')
	  var nivelhierarquico = button.data('nivelhierarquico')
	  var cargo = button.data('cargo')
	  var pretensaosalarial = button.data('pretensaosalarial')
	  
	  
	  var modal = $(this)

	  modal.find('#idArea').val(id)
	  modal.find('#areaEdit').val(area)
	  modal.find('#tipoCargoEdit').val(tipocargo)
	  modal.find('#nivelHierarquicoEdit').val(nivelhierarquico)
	  modal.find('#cargoPretendidoEdit').val(cargo)
	  modal.find('#pretensaoSalarialEdit').val(pretensaosalarial)

});

$("#modal-perfilprofissional").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var cpf = button.data('cpf')
	  var nome = button.data('nome') 
	  var email = button.data('email')
	  var senha = button.data('senha')
	  var cep = button.data('cep')
	  var logradouro = button.data('logradouro')
	  var complemento = button.data('complemento')
	  var bairro = button.data('bairro')
	  var cidade = button.data('cidade')
	  var uf = button.data('uf')
	  var numero = button.data('numero')
	  var telefone = button.data('telefone')
	  var celularum = button.data('celularum')
	  var celulardois = button.data('celulardois')
	  var whatsapp = button.data('whatsapp')
	  var twitter = button.data('twitter')
	  var facebook = button.data('facebook')
	  var instagram = button.data('instagram')
	  var linkedin = button.data('linkedin')
	  var rg = button.data('rg')
	  var tituloeleitoral = button.data('tituloeleitoral')
	  var zona = button.data('zona')
	  var secao = button.data('secao')
	  var orgaoemissorrg = button.data('orgaoemissorrg')
	  var cnh = button.data('cnh')
	  var categoriacnh = button.data('categoriacnh')
	  var dtnascimento = button.data('dtnascimento')
	  var nacionalidade = button.data('nacionalidade')
	  var ufnascimento = button.data('ufnascimento')
	  var cidadenascimento = button.data('cidadenascimento')
	  var qtfilhos = button.data('qtfilhos')
	  var estadocivil = button.data('estadocivil')
	  var genero = button.data('genero')
	  var fumante = button.data('fumante')
	  var pcd = button.data('pcd')
	  var deficiencia = button.data('deficiencia')
	  var cartadeapresentacao = button.data('cartadeapresentacao')
	  var objetivosprofissionais = button.data('objetivosprofissionais')
	  var competencias = button.data('competencias')
	  
	  
	  
	  var modal = $(this)

	  modal.find('#cpfEdit').val(cpf)
	  modal.find('#nomeEdit').val(nome)
	  modal.find('#emailEdit').val(email)
	  modal.find('#senhaEdit').val(senha)
	  modal.find('#cepEdit').val(cep)
	  modal.find('#logradouroEdit').val(logradouro)
	  modal.find('#complementoEdit').val(complemento)
	  modal.find('#bairroEdit').val(bairro)
	  modal.find('#cidadeEdit').val(cidade)
	  modal.find('#ufEdit').val(uf)
	  modal.find('#numeroEdit').val(numero)
	  modal.find('#telefoneEdit').val(telefone)
	  modal.find('#celularUmEdit').val(celularum)
	  modal.find('#celularDoisEdit').val(celulardois)
	  modal.find('#whatsappEdit').val(whatsapp)
	  modal.find('#twitterEdit').val(twitter)
	  modal.find('#facebookEdit').val(facebook)
	  modal.find('#instagramEdit').val(instagram)
	  modal.find('#linkedinEdit').val(linkedin)
	  modal.find('#rgEdit').val(rg)
	  modal.find('#tituloeleitoralEdit').val(tituloeleitoral)
	  modal.find('#zonaEdit').val(zona)
	  modal.find('#secaoEdit').val(secao)
	  modal.find('#orgaoemissorrgEdit').val(orgaoemissorrg)
	  modal.find('#cnhEdit').val(cnh)
	  modal.find('#categoriacnhEdit').val(categoriacnh)
	  modal.find('#dtNascimentoEdit').val(dtnascimento)
	  modal.find('#nacionalidadeEdit').val(nacionalidade)
	  modal.find('#ufNascimentoEdit').val(ufnascimento)
	  modal.find('#cidadeNascimentoEdit').val(cidadenascimento)
	  modal.find('#qtFilhosEdit').val(qtfilhos)
	  modal.find('#estadoCivilEdit').val(estadocivil)
	  modal.find('#generoEdit').val(genero)
	  modal.find('#fumanteEdit').val(fumante)
	  modal.find('#pcdEdit').val(pcd)
	  modal.find('#deficienciaEdit').val(deficiencia)
	  modal.find('#cartadeapresentacaoEdit').val(cartadeapresentacao)
	  modal.find('#objetivosprofissionaisEdit').val(objetivosprofissionais)
	  modal.find('#competenciasEdit').val(competencias)

});

$("#modal-objetivos").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var cpf = button.data('cpf')
	  var nome = button.data('nome') 
	  var email = button.data('email')
	  var senha = button.data('senha')
	  var cep = button.data('cep')
	  var logradouro = button.data('logradouro')
	  var complemento = button.data('complemento')
	  var bairro = button.data('bairro')
	  var cidade = button.data('cidade')
	  var uf = button.data('uf')
	  var numero = button.data('numero')
	  var telefone = button.data('telefone')
	  var celularum = button.data('celularum')
	  var celulardois = button.data('celulardois')
	  var whatsapp = button.data('whatsapp')
	  var twitter = button.data('twitter')
	  var facebook = button.data('facebook')
	  var instagram = button.data('instagram')
	  var linkedin = button.data('linkedin')
	  var rg = button.data('rg')
	  var tituloeleitoral = button.data('tituloeleitoral')
	  var zona = button.data('zona')
	  var secao = button.data('secao')
	  var orgaoemissorrg = button.data('orgaoemissorrg')
	  var cnh = button.data('cnh')
	  var categoriacnh = button.data('categoriacnh')
	  var dtnascimento = button.data('dtnascimento')
	  var nacionalidade = button.data('nacionalidade')
	  var ufnascimento = button.data('ufnascimento')
	  var cidadenascimento = button.data('cidadenascimento')
	  var qtfilhos = button.data('qtfilhos')
	  var estadocivil = button.data('estadocivil')
	  var genero = button.data('genero')
	  var fumante = button.data('fumante')
	  var pcd = button.data('pcd')
	  var deficiencia = button.data('deficiencia')
	  var cartadeapresentacao = button.data('cartadeapresentacao')
	  var objetivosprofissionais = button.data('objetivosprofissionais')
	  var competencias = button.data('competencias')
	  
	  
	  
	  var modal = $(this)

	  modal.find('#cpfEdit2').val(cpf)
	  modal.find('#nomeEdit2').val(nome)
	  modal.find('#emailEdit2').val(email)
	  modal.find('#senhaEdit2').val(senha)
	  modal.find('#cepEdit2').val(cep)
	  modal.find('#logradouroEdit2').val(logradouro)
	  modal.find('#complementoEdit2').val(complemento)
	  modal.find('#bairroEdit2').val(bairro)
	  modal.find('#cidadeEdit2').val(cidade)
	  modal.find('#ufEdit2').val(uf)
	  modal.find('#numeroEdit2').val(numero)
	  modal.find('#telefoneEdit2').val(telefone)
	  modal.find('#celularUmEdit2').val(celularum)
	  modal.find('#celularDoisEdit2').val(celulardois)
	  modal.find('#whatsappEdit2').val(whatsapp)
	  modal.find('#twitterEdit2').val(twitter)
	  modal.find('#facebookEdit2').val(facebook)
	  modal.find('#instagramEdit2').val(instagram)
	  modal.find('#linkedinEdit2').val(linkedin)
	  modal.find('#rgEdit2').val(rg)
	  modal.find('#tituloeleitoralEdit2').val(tituloeleitoral)
	  modal.find('#zonaEdit2').val(zona)
	  modal.find('#secaoEdit2').val(secao)
	  modal.find('#orgaoemissorrgEdit2').val(orgaoemissorrg)
	  modal.find('#cnhEdit2').val(cnh)
	  modal.find('#categoriacnhEdit2').val(categoriacnh)
	  modal.find('#dtNascimentoEdit2').val(dtnascimento)
	  modal.find('#nacionalidadeEdit2').val(nacionalidade)
	  modal.find('#ufNascimentoEdit2').val(ufnascimento)
	  modal.find('#cidadeNascimentoEdit2').val(cidadenascimento)
	  modal.find('#qtFilhosEdit2').val(qtfilhos)
	  modal.find('#estadoCivilEdit2').val(estadocivil)
	  modal.find('#generoEdit2').val(genero)
	  modal.find('#fumanteEdit2').val(fumante)
	  modal.find('#pcdEdit2').val(pcd)
	  modal.find('#deficienciaEdit2').val(deficiencia)
	  modal.find('#cartadeapresentacaoEdit2').val(cartadeapresentacao)
	  modal.find('#objetivosprofissionaisEdit2').val(objetivosprofissionais)
	  modal.find('#competenciasEdit2').val(competencias)


});

$("#modal-habilidades").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var cpf = button.data('cpf')
	  var nome = button.data('nome') 
	  var email = button.data('email')
	  var senha = button.data('senha')
	  var cep = button.data('cep')
	  var logradouro = button.data('logradouro')
	  var complemento = button.data('complemento')
	  var bairro = button.data('bairro')
	  var cidade = button.data('cidade')
	  var uf = button.data('uf')
	  var numero = button.data('numero')
	  var telefone = button.data('telefone')
	  var celularum = button.data('celularum')
	  var celulardois = button.data('celulardois')
	  var whatsapp = button.data('whatsapp')
	  var twitter = button.data('twitter')
	  var facebook = button.data('facebook')
	  var instagram = button.data('instagram')
	  var linkedin = button.data('linkedin')
	  var rg = button.data('rg')
	  var tituloeleitoral = button.data('tituloeleitoral')
	  var zona = button.data('zona')
	  var secao = button.data('secao')
	  var orgaoemissorrg = button.data('orgaoemissorrg')
	  var cnh = button.data('cnh')
	  var categoriacnh = button.data('categoriacnh')
	  var dtnascimento = button.data('dtnascimento')
	  var nacionalidade = button.data('nacionalidade')
	  var ufnascimento = button.data('ufnascimento')
	  var cidadenascimento = button.data('cidadenascimento')
	  var qtfilhos = button.data('qtfilhos')
	  var estadocivil = button.data('estadocivil')
	  var genero = button.data('genero')
	  var fumante = button.data('fumante')
	  var pcd = button.data('pcd')
	  var deficiencia = button.data('deficiencia')
	  var cartadeapresentacao = button.data('cartadeapresentacao')
	  var objetivosprofissionais = button.data('objetivosprofissionais')
	  var competencias = button.data('competencias')
	  
	  
	  
	  var modal = $(this)

	  modal.find('#cpfEdit3').val(cpf)
	  modal.find('#nomeEdit3').val(nome)
	  modal.find('#emailEdit3').val(email)
	  modal.find('#senhaEdit3').val(senha)
	  modal.find('#cepEdit3').val(cep)
	  modal.find('#logradouroEdit3').val(logradouro)
	  modal.find('#complementoEdit3').val(complemento)
	  modal.find('#bairroEdit3').val(bairro)
	  modal.find('#cidadeEdit3').val(cidade)
	  modal.find('#ufEdit3').val(uf)
	  modal.find('#numeroEdit3').val(numero)
	  modal.find('#telefoneEdit3').val(telefone)
	  modal.find('#celularUmEdit3').val(celularum)
	  modal.find('#celularDoisEdit3').val(celulardois)
	  modal.find('#whatsappEdit3').val(whatsapp)
	  modal.find('#twitterEdit3').val(twitter)
	  modal.find('#facebookEdit3').val(facebook)
	  modal.find('#instagramEdit3').val(instagram)
	  modal.find('#linkedinEdit3').val(linkedin)
	  modal.find('#rgEdit3').val(rg)
	  modal.find('#tituloeleitoralEdit3').val(tituloeleitoral)
	  modal.find('#zonaEdit3').val(zona)
	  modal.find('#secaoEdit3').val(secao)
	  modal.find('#orgaoemissorrgEdit3').val(orgaoemissorrg)
	  modal.find('#cnhEdit3').val(cnh)
	  modal.find('#categoriacnhEdit3').val(categoriacnh)
	  modal.find('#dtNascimentoEdit3').val(dtnascimento)
	  modal.find('#nacionalidadeEdit3').val(nacionalidade)
	  modal.find('#ufNascimentoEdit3').val(ufnascimento)
	  modal.find('#cidadeNascimentoEdit3').val(cidadenascimento)
	  modal.find('#qtFilhosEdit3').val(qtfilhos)
	  modal.find('#estadoCivilEdit3').val(estadocivil)
	  modal.find('#generoEdit3').val(genero)
	  modal.find('#fumanteEdit3').val(fumante)
	  modal.find('#pcdEdit3').val(pcd)
	  modal.find('#deficienciaEdit3').val(deficiencia)
	  modal.find('#cartadeapresentacaoEdit3').val(cartadeapresentacao)
	  modal.find('#objetivosprofissionaisEdit3').val(objetivosprofissionais)
	  modal.find('#competenciasEdit3').val(competencias)


});

$("#modal-editardadospessoais").on('show.bs.modal', function (event) {
	
	  var button = $(event.relatedTarget)

	  var cpf = button.data('cpf')
	  var nome = button.data('nome') 
	  var email = button.data('email')
	  var cep = button.data('cep')
	  var logradouro = button.data('logradouro')
	  var complemento = button.data('complemento')
	  var bairro = button.data('bairro')
	  var cidade = button.data('cidade')
	  var uf = button.data('uf')
	  var numero = button.data('numero')
	  var telefone = button.data('telefone')
	  var celularum = button.data('celularum')
	  var celulardois = button.data('celulardois')
	  var whatsapp = button.data('whatsapp')
	  var twitter = button.data('twitter')
	  var facebook = button.data('facebook')
	  var instagram = button.data('instagram')
	  var linkedin = button.data('linkedin')
	  var rg = button.data('rg')
	  var tituloeleitoral = button.data('tituloeleitoral')
	  var zona = button.data('zona')
	  var secao = button.data('secao')
	  var orgaoemissorrg = button.data('orgaoemissorrg')
	  var cnh = button.data('cnh')
	  var categoriacnh = button.data('categoriacnh')
	  var dtnascimento = button.data('dtnascimento')
	  var nacionalidade = button.data('nacionalidade')
	  var ufnascimento = button.data('ufnascimento')
	  var cidadenascimento = button.data('cidadenascimento')
	  var qtfilhos = button.data('qtfilhos')
	  var estadocivil = button.data('estadocivil')
	  var genero = button.data('genero')
	  var pcd = button.data('pcd')
	  var deficiencia = button.data('deficiencia')
	  var cartadeapresentacao = button.data('cartadeapresentacao')
	  var objetivosprofissionais = button.data('objetivosprofissionais')
	  var competencias = button.data('competencias')
	  var canalComunicacao = button.data('canalcomunicacao')
	  var exfuncionario = button.data('exfuncionario')
	  
	  
	  
	  
	  var modal = $(this)

	  modal.find('#cpf').val(cpf)
	  modal.find('#cpf0').val(cpf)
	  modal.find('#nome').val(nome)
	  modal.find('#email').val(email)
	  modal.find('#cep').val(cep)
	  modal.find('#logradouro').val(logradouro)
	  modal.find('#complemento').val(complemento)
	  modal.find('#bairro').val(bairro)
	  modal.find('#cidade').val(cidade)
	  modal.find('#uf').val(uf)
	  modal.find('#numero').val(numero)
	  modal.find('#telefone').val(telefone)
	  modal.find('#celularUm').val(celularum)
	  modal.find('#celularDois').val(celulardois)
	  modal.find('#whatsapp').val(whatsapp)
	  modal.find('#twitter').val(twitter)
	  modal.find('#facebook').val(facebook)
	  modal.find('#instagram').val(instagram)
	  modal.find('#linkedin').val(linkedin)
	  modal.find('#rg').val(rg)
	  modal.find('#tituloeleitoral').val(tituloeleitoral)
	  modal.find('#zona').val(zona)
	  modal.find('#secao').val(secao)
	  modal.find('#orgaoemissorrg').val(orgaoemissorrg)
	  modal.find('#cnh').val(cnh)
	  modal.find('#categoriacnh').val(categoriacnh)
	  modal.find('#dtNascimento').val(dtnascimento)
	  modal.find('#nacionalidade').val(nacionalidade)
	  modal.find('#ufNascimento').val(ufnascimento)
	  modal.find('#cidadeNascimento').val(cidadenascimento)
	  modal.find('#qtFilhos').val(qtfilhos)
	  modal.find('#estadoCivil').val(estadocivil)
	  modal.find('#genero').val(genero)
	  modal.find('#pcd').val(pcd)
	  modal.find('#deficiencia').val(deficiencia)
	  modal.find('#cartadeapresentacao').val(cartadeapresentacao)
	  modal.find('#objetivosprofissionais').val(objetivosprofissionais)
	  modal.find('#competencias').val(competencias)
	  modal.find('#exFuncionario').val(exfuncionario)
	  modal.find('#canalComunicacao').val(canalComunicacao)
	  modal.find('#foto').val(foto)


});


/************************* ADMIN ****************************/

$("#editar-usuario").on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget)
  
	var nome = button.data('nome')
	var login = button.data('login') 
	var email = button.data('email')
	var ativo = button.data('ativo')

	var modal = $(this)
  
	modal.find('#nome').val(nome)
	modal.find('#login').val(login)
	modal.find('#email').val(email)
	modal.find('#ativo').val(ativo)
  });

  $("#editar-empresa").on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget)
  
	var descricao = button.data('descricao')
	var cnpj = button.data('cnpj') 
	var filial = button.data('filial')
	var id = button.data('id')

	var modal = $(this)
  
	modal.find('#descricao').val(descricao)
	modal.find('#cnpj').val(cnpj)
	modal.find('#filial').val(filial)
	modal.find('#id').val(id)
  });

  $("#editar-cargo").on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget)
  
	var descricao = button.data('descricao')
	var nivel = button.data('nivel') 
	var area = button.data('area')
	var id = button.data('id')

	var modal = $(this)
  
	modal.find('#descricao').val(descricao)
	modal.find('#nivel').val(nivel)
	modal.find('#area').val(area)
	modal.find('#id').val(id)
  });

  $("#editar-area").on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget)
  
	var descricao = button.data('descricao')
	var id = button.data('id')

	var modal = $(this)
  
	modal.find('#descricao').val(descricao)
	modal.find('#id').val(id)
  });

  $("#editar-nivel").on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget)
  
	var descricao = button.data('descricao')
	var id = button.data('id')

	var modal = $(this)
  
	modal.find('#descricao').val(descricao)
	modal.find('#id').val(id)
  });

  $("#editar-vaga").on('show.bs.modal', function (event) {
	
	var button = $(event.relatedTarget)
  
	var id = button.data('id')
	var cargo = button.data('cargo')
	var descricao = button.data('descricao')
	var formacao = button.data('formacao')
	var empresa = button.data('empresa')
	var numeroVagas = button.data('numerovagas')
	var dtCadastro = button.data('dtcadastro')
	var dtDisp = button.data('dtdisp')
	var dtExpiracao = button.data('dtexpiracao')
	var qtdiasexpiracao = button.data('qtdiasexpiracao')
	var experienciaMinima = button.data('experienciaminima')
	var conhecimentoBasico = button.data('conhecimentobasico')
	var conhecimentoDesejavel = button.data('conhecimentodesejavel')
	var ativo = button.data('ativo')

	var modal = $(this)
  
	
	modal.find('#id').val(id)
	modal.find('#cargo').val(cargo)
	modal.find('#descricao').val(descricao)
	modal.find('#formacao').val(formacao)
	modal.find('#empresa').val(empresa)
	modal.find('#numeroVagas').val(numeroVagas)
	modal.find('#dtCadastro').val(dtCadastro)
	modal.find('#dtDisp').val(dtDisp)
	modal.find('#dtExpiracao').val(dtExpiracao)
	modal.find('#qtdiasexpiracao').val(qtdiasexpiracao)
	modal.find('#experienciaMinima').val(experienciaMinima)
	modal.find('#conhecimentoBasico').val(conhecimentoBasico)
	modal.find('#conhecimentoDesejavel').val(conhecimentoDesejavel)
	modal.find('#ativo').val(ativo)
  });

  /************************* ADMIN ****************************/