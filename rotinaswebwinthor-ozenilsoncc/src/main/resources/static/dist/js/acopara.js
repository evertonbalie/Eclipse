$(document).ready(function () {

    function limpa_formulario_cep() {
        // Limpa valores do formulÃ¡rio de cep.
        $("#enderecoEntrega").val("");
        $("#bairroEntrega").val("");
        $("#municipioEntrega").val("");
        $("#ufEntrega").val("");
        $("#cidadeIbge").val("");
    }

    //Quando o campo cep perde o foco.
    $("#cepEntrega").blur(function () {

        //Nova variÃ¡vel "cep" somente com dÃ­gitos.
        var cep = $(this).val().replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep != "" || cep != "________") {

            //ExpressÃ£o regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if (validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                $("#enderecoEntrega").val("...");
                $("#bairroEntrega").val("...");
                $("#municipioEntrega").val("...");
                $("#ufEntrega").val("...");
                $("#cidadeIbge").val("...");

                //Consulta o webservice viacep.com.br/
                $.getJSON("https://viacep.com.br/ws/" + cep + "/json/?callback=?", function (dados) {

                    if (!("erro" in dados)) {
                        //Atualiza os campos com os valores da consulta.
                        $("#enderecoEntrega").val(dados.logradouro+" "+dados.complemento);
                        $("#bairroEntrega").val(dados.bairro);
                        $("#municipioEntrega").val(dados.localidade);
                        $("#ufEntrega").val(dados.uf);
                        $("#cidadeIbge").val(dados.ibge);
                    } //end if.
                    else {
                        //CEP pesquisado nÃ£o foi encontrado.
                        limpa_formulario_cep();
                        bootbox.alert("CEP não encontrado.");
                    }
                });
            } //end if.
            else {
                //cep Ã© invÃ¡lido.
                limpa_formulario_cep();
                bootbox.alert("Formato de CEP inválido.");
            }
        } //end if.
        else {
            //cep sem valor, limpa formulÃ¡rio.
            limpa_formulario_cep();
        }
    });


});

$(document).ready(function () {

    function limpa_formulario_cep() {
        // Limpa valores do formulÃ¡rio de cep.
        $("#logradouro").val("");
        $("#bairro").val("");
        $("#municipio").val("");
        $("#uf").val("");
        $("#codigoMunicipio").val("");
    }

    //Quando o campo cep perde o foco.
    $("#cep").blur(function () {

        //Nova variÃ¡vel "cep" somente com dÃ­gitos.
        var cep = $(this).val().replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep != "") {

            //ExpressÃ£o regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if (validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                $("#logradouro").val("...");
                $("#bairro").val("...");
                $("#municipio").val("...");
                $("#uf").val("...");
                $("#codigoMunicipio").val("...");

                //Consulta o webservice viacep.com.br/
                $.getJSON("https://viacep.com.br/ws/" + cep + "/json/?callback=?", function (dados) {

                    if (!("erro" in dados)) {
                        //Atualiza os campos com os valores da consulta.
                        $("#logradouro").val(dados.logradouro+" "+dados.complemento);
                        $("#bairro").val(dados.bairro);
                        $("#municipio").val(dados.localidade);
                        $("#uf").val(dados.uf);
                        $("#codigoMunicipio").val(dados.ibge);
                    } //end if.
                    else {
                        //CEP pesquisado nÃ£o foi encontrado.
                        limpa_formulario_cep();
                        bootbox.alert("CEP não encontrado.");
                    }
                });
            } //end if.
            else {
                //cep Ã© invÃ¡lido.
                limpa_formulario_cep();
                bootbox.alert("Formato de CEP inválido.");
            }
        } //end if.
        else {
            //cep sem valor, limpa formulÃ¡rio.
            limpa_formulario_cep();
        }
    });
});


$(document).ready(function () {

    function limpa_formulario_cpf() {
        $("#cpfCnpj").val("");
    }

    function isCpf (c) {

        if((c = c.replace(/[^\d]/g,"")).length != 11)
            return false
        if (c == "00000000000")
            return false;
        var r;
        var s = 0;
        for (i=1; i<=9; i++)
            s = s + parseInt(c[i-1]) * (11 - i);
        r = (s * 10) % 11;
        if ((r == 10) || (r == 11))
            r = 0;
        if (r != parseInt(c[9]))
            return false;
        s = 0;
        for (i = 1; i <= 10; i++)
            s = s + parseInt(c[i-1]) * (12 - i);
        r = (s * 10) % 11;
        if ((r == 10) || (r == 11))
            r = 0;
        if (r != parseInt(c[10]))
            return false;
        return true;
    }

    $("#cpfCnpj").blur(function () {

        var uri = document.URL;

        var server = uri.substring(0, uri.indexOf("8080")+4);

        var cpf = $(this).val();

        //Verifica se campo cep possui valor informado.
        if (cpf != "") {
            if(isCpf(cpf)){
                $.getJSON(server+"/api/clientes/cpf/" + cpf, function (dados) {

                    if (!("erro" in dados)) {
                        limpa_formulario_cpf();
                        bootbox.alert("Cliente já existe em nossa base de dados! CÒDIGO: <b>"+dados.id+"</b>");
                    }
                });
            } //end if.
            else {
                //cep Ã© invÃ¡lido.
                limpa_formulario_cpf();
                bootbox.alert("CPF: <b>"+cpf+"</b> inválido, verifique essa informação com o cliente");
            }
        }
    });
});

$(document).ready(function () {

    function limpa_formulario_codigo() {
        $("#codcli").val("");
    }

    $("#codcli").blur(function () {

        var uri = document.URL;

        var server = uri.substring(0, uri.indexOf("8080")+4);

        var codigo = $(this).val();

        //Verifica se campo cep possui valor informado.
        if (codigo != "") {

            $.getJSON(server+"/api/clientes/codigo/" + codigo, function (dados) {

                if (!("erro" in dados)) {
                    $("#codcli").prop("disabled",true);
                    $("#nome").val(dados.nome);
                    $("#codigoCliente").val(dados.id);
                }
                else {
                    //CEP pesquisado nÃ£o foi encontrado.
                    limpa_formulario_codigo();
                    alert("Cliente não encontrado.");
                }
            });
        } //end if.
        else {
            //cep Ã© invÃ¡lido.
            limpa_formulario_codigo();
            bootbox.alert("Código inválido.");
        }
    });
});

$(document).ready(function () {

    function limpa_formulario() {
        $("#usuario").val("");
    }

    $("#usuario").change(function () {

        var uri = document.URL;

        var server = uri.substring(0, uri.indexOf("8080")+4);

        var user = $(this).val();

        //Verifica se campo cep possui valor informado.
        if (user != "") {

            $.getJSON(server+"/api/usuariowinthor/" + user, function (dados) {

                if (!("erro" in dados)) {
                    $("#nome").val(dados.nome);
                    $("#nomeH").val(dados.nome);
                    $("#usuarioWinthor").val(dados.id);
                    $("#usuarioWinthorH").val(dados.id);
                    $("#codigoRca").val(dados.codigoRca);
                    $("#codigoRcaH").val(dados.codigoRca);

                }
            });
        } //end if.
        else {
            //cep Ã© invÃ¡lido.
            limpa_formulario();
            bootbox.alert("Formato de CPF inválido.");
        }
    });
});

function buscarcep(){

    $("#tabela").empty();

    var logradouro = $("#logradouro").val();
    var localidade = $("#localidade").val();
    var uf = $("#estado").val();

    $.ajax({
        type: 'get',
        dataType: 'json',
        url : 'https://viacep.com.br/ws/' + uf + '/' + localidade + '/' + logradouro + '/json/',
        success : function (dados) {
            for(var i=0;dados.length>i;i++){
                $("#tabela").append('<tr><td>'+dados[i].cep+'</td><td>'+dados[i].logradouro+ ' ' +dados[i].complemento+'</td><td>'+dados[i].bairro+'</td><td>'+dados[i].uf+'</td><td>'+dados[i].localidade+'</td></tr>');
            }
        }
    });
}

function buscarcep2(){

    $("#tabela2").empty();

    var logradouro = $("#logradouro2").val();
    var localidade = $("#localidade2").val();
    var uf = $("#estado2").val();

    $.ajax({
        type: 'get',
        dataType: 'json',
        url : 'https://viacep.com.br/ws/' + uf + '/' + localidade + '/' + logradouro + '/json/',
        success : function (dados) {
            for(var i=0;dados.length>i;i++){
                $("#tabela2").append('<tr><td>'+dados[i].cep+'</td><td>'+dados[i].logradouro+ ' ' +dados[i].complemento+'</td><td>'+dados[i].bairro+'</td><td>'+dados[i].uf+'</td><td>'+dados[i].localidade+'</td></tr>');
            }
        }
    });
}

$(function () {
    'use strict'

    var uri = document.URL;

    var server = uri.substring(0, uri.indexOf("8080")+4);

    var url = server+'/api/faturamento/dozemeses';

    $.getJSON(url, function (result) {

        var labels = result.map(function (item) {
            return item.mes
        });

        var data = result.map(function (item) {
            return item.valor
        });

        var ticksStyle = {
            fontColor: '#495057',
            fontStyle: 'bold'
        }

        var mode      = 'index'
        var intersect = true

        var $salesChart = $('#sales-chart')
        var salesChart  = new Chart($salesChart, {
            type   : 'bar',
            data   : {
                labels  : labels,
                datasets: [
                    {
                        backgroundColor: '#007bff',
                        borderColor    : '#007bff',
                        data           : data
                    }
                ]
            },
            options: {
                maintainAspectRatio: false,
                tooltips           : {
                    mode     : mode,
                    intersect: intersect
                },
                hover              : {
                    mode     : mode,
                    intersect: intersect
                },
                legend             : {
                    display: false
                },
                scales             : {
                    yAxes: [{
                        // display: false,
                        gridLines: {
                            display      : true,
                            lineWidth    : '4px',
                            color        : 'rgba(0, 0, 0, .2)',
                            zeroLineColor: 'transparent'
                        },
                        ticks    : $.extend({
                            beginAtZero: true,

                            // Include a dollar sign in the ticks
                            callback: function (value, index, values) {
                                if (value >= 1000) {
                                    value /= 1000
                                    value += 'mil'
                                }
                                return 'R$ ' + value
                            }
                        }, ticksStyle)
                    }],
                    xAxes: [{
                        display  : true,
                        gridLines: {
                            display: false
                        },
                        ticks    : ticksStyle
                    }]
                }
            }
        })
    });
})

$(function () {
    'use strict'

    var uri = document.URL;

    var server = uri.substring(0, uri.indexOf("8080")+4);

    var url = server+'/api/faturamento/dozemeses/supervisor';

    $.getJSON(url, function (result) {

        var labels = result.map(function (item) {
            return item.mes
        });

        var data = result.map(function (item) {
            return item.valor
        });

        var ticksStyle = {
            fontColor: '#495057',
            fontStyle: 'bold'
        }

        var mode      = 'index'
        var intersect = true

        var $salesChartSupervisor = $('#sales-chart-supervisor')
        var salesChartSupervisor  = new Chart($salesChartSupervisor, {
            type   : 'bar',
            data   : {
                labels  : labels,
                datasets: [
                    {
                        backgroundColor: '#007bff',
                        borderColor    : '#007bff',
                        data           : data
                    }
                ]
            },
            options: {
                maintainAspectRatio: false,
                tooltips           : {
                    mode     : mode,
                    intersect: intersect
                },
                hover              : {
                    mode     : mode,
                    intersect: intersect
                },
                legend             : {
                    display: false
                },
                scales             : {
                    yAxes: [{
                        // display: false,
                        gridLines: {
                            display      : true,
                            lineWidth    : '4px',
                            color        : 'rgba(0, 0, 0, .2)',
                            zeroLineColor: 'transparent'
                        },
                        ticks    : $.extend({
                            beginAtZero: true,

                            // Include a dollar sign in the ticks
                            callback: function (value, index, values) {
                                if (value >= 1000) {
                                    value /= 1000
                                    value += 'mil'
                                }
                                return 'R$ ' + value
                            }
                        }, ticksStyle)
                    }],
                    xAxes: [{
                        display  : true,
                        gridLines: {
                            display: false
                        },
                        ticks    : ticksStyle
                    }]
                }
            }
        })
    });
})