function deleteIdioma(id){
	var url = window.location.href; 
	var tipo = url.split("/")
	
		    $.ajax({
		        url: '/'+tipo[3]+'/idioma/remover/'+id,
		        method: 'GET',
		        success: function () {
		            $("#idiomas").fadeOut(1000).load(" #idiomas").fadeIn(1000);
		            $("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
		        },
		        error: function (error) {
		            alert(error);
		        }
		    })
		}
		
		function deleteCertificacao(id){
			
			var url = window.location.href; 
			var tipo = url.split("/")
			
		    $.ajax({
		        url: '/'+tipo[3]+'/certificacao/remover/'+id,
		        method: 'GET',
		        success: function () {
		            $("#certificacoes").fadeOut(1000).load(" #certificacoes").fadeIn(1000);
		            $("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
		        },
		        error: function (error) {
		            alert(error);
		        }
		    })
		}
		
		function deleteFormacao(id){
			
			var url = window.location.href; 
			var tipo = url.split("/")
			
		    $.ajax({
		        url: '/'+tipo[3]+'/formacao/remover/'+id,
		        method: 'GET',
		        success: function () {
		            $("#formacoes").fadeOut(1000).load(" #formacoes").fadeIn(1000);
		            $("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
		        },
		        error: function (error) {
		            alert(error);
		        }
		    })
		}
		
		function deleteCurso(id){
			
			var url = window.location.href; 
			var tipo = url.split("/")
			
		    $.ajax({
		        url: '/'+tipo[3]+'/curso/remover/'+id,
		        method: 'GET',
		        success: function () {
		            $("#cursos").fadeOut(1000).load(" #cursos").fadeIn(1000);
		            $("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
		        },
		        error: function (error) {
		            alert(error);
		        }
		    })
		}
		
		function deleteExperiencia(id){
			
			var url = window.location.href; 
			var tipo = url.split("/")
			
		    $.ajax({
		        url: '/'+tipo[3]+'/experiencia/remover/'+id,
		        method: 'GET',
		        success: function () {
		            $("#experiencias").fadeOut(1000).load(" #experiencias").fadeIn(1000);
		            $("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
		        },
		        error: function (error) {
		            alert(error);
		        }
		    })
		}
		
		function deleteAreaInteresse(id){
			
			var url = window.location.href; 
			var tipo = url.split("/")
			
		    $.ajax({
		        url: '/'+tipo[3]+'/areainteresse/remover/'+id,
		        method: 'GET',
		        success: function () {
		            $("#areainteresse").fadeOut(1000).load(" #areainteresse").fadeIn(1000);
		            $("#progress").fadeOut(1000).load(" #progress").fadeIn(1000);
		        },
		        error: function (error) {
		            alert(error);
		        }
		    })
		}