package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "PCCLIENT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODCLI")
    private Long id;

    @Column(name = "CLIENTE")
    @NotNull(message = "O Nome deve ser preenchido")
    @Size(min = 10, max = 60, message = "O nome deve ter entre 10 e 60 carateres")
    private String nome;

    @Column(name = "FANTASIA")
    private String fantasia;

    @Column(name = "TIPOFJ")
    private String tipoPessoa;

    @Column(name = "CGCENT")
    @NotNull(message = "O CPF deve ser preenchido")
    private String cpfCnpj;

    @Column(name = "IEENT")
    private String inscricaoEstadual;

    @Column(name = "CODATV1")
    private Long atividade;

    @Column(name = "CODCLIPRINC")
    private Long codigoClientePrincipal;

    @Column(name = "DTCADASTRO")
    private Date dataCadastro;

    @Column(name = "HORACADASTRO")
    private Date dataAlteracao;

    @Column(name = "INICIOATIV")
    private Date inicioAtividades;

    @Column(name = "CODFUNCCADASTRO")
    private Long funcionarioCadastro;

    @Column(name = "CODFUNCULTALTER")
    private Long funcionarioAlteracao;

    @Column(name = "NUMEROENT")
    @NotNull(message = "O Número deve ser preenchido")
    @Max(value = 6, message = "O número deve ter no máximo 6 caracteres")
    private String numeroEntrega;

    @Column(name = "TELCELENT")
    private String celularEntrega;

    @Column(name = "EMAIL")
    @NotNull(message = "O Email deve ser preenchido")
    @Max(value = 100, message = "O email deve ter no máximo 100 caracteres")
    private String email;

    @Column(name = "CODPRACA")
    private Long codigoPracaEntrega;

    @Column(name = "ENDERENT")
    @NotNull(message = "O Endereço deve ser preenchido")
    @Max(value = 40, message = "O endereço deve ter no máximo 40 caracteres")
    private String enderecoEntrega;

    @Column(name = "BAIRROENT")
    @NotNull(message = "O Bairro deve ser preenchido")
    @Max(value = 40, message = "O bairro deve ter no máximo 40 caracteres")
    private String bairroEntrega;

    @Column(name = "CODCIDADE")
    private Long codigoCidade;

    @Column(name = "CODMUNICIPIO")
    private Long cidadeIbge;

    @Column(name = "MUNICENT")
    @NotNull(message = "A cidade deve ser preenchido")
    @Max(value = 15, message = "O cidade deve ter no máximo 15 caracteres")
    private String municipioEntrega;

    @Column(name = "ESTENT")
    @NotNull(message = "A UF deve ser preenchido")
    @Max(value = 2, message = "O UF deve ter no máximo 2 caracteres")
    private String ufEntrega;

    @Column(name = "CEPENT")
    private String cepEntrega;

    @Column(name = "CODPAIS")
    private Long codigoPais;

    @Column(name = "TELENT")
    private String telefoneEntrega;

    @Column(name = "COMPLEMENTOENT")
    @NotNull(message = "O Complemento deve ser preenchido")
    @Max(value = 80, message = "O endereço deve ter no máximo 80 caracteres")
    private String complementoEntrega;

    @Column(name = "EMAILNFE")
    private String emailNfe;

    @Column(name = "NUMEROCOB")
    private String numeroCobranca;

    @Column(name = "COMPLEMENTOCOB")
    private String complementoCobranca;

    @Column(name = "ENDERCOB")
    private String enderecoCobranca;

    @Column(name = "BAIRROCOB")
    private String bairroCobranca;

    @Column(name = "MUNICCOB")
    private String municipioCobranca;

    @Column(name = "ESTCOB")
    private String estadoCobranca;

    @Column(name = "CEPCOB")
    private String cepCobranca;

    @Column(name = "TELCOB")
    private String telefoneCobranca;

    @Column(name = "CODPRACACOB")
    private Long codigoPracaCobranca;

    @Column(name = "EMAILCOB")
    private String emailCobranca;

    @Column(name = "COMPLEMENTOCOM")
    private String complementoComercial;

    @Column(name = "CODCIDADECOM")
    private Long codigoCidadeComercial;

    @Column(name = "NUMEROCOM")
    private String numeroComercial;

    @Column(name = "BAIRROCOM")
    private String bairroComercial;

    @Column(name = "MUNICCOM")
    private String municipioComercial;

    @Column(name = "ESTCOM")
    private String ufComercial;

    @Column(name = "CEPCOM")
    private String cepComercial;

    @Column(name = "ENDERCOM")
    private String enderecoComercial;

    @Column(name = "TELCOM")
    private String telefoneComercial;

    @Column(name = "CEPCXPOSTAL")
    private String cepCaixaPostal;

    @Column(name = "CGCENTREGA")
    private String cpfCnpjEntrega;

    @Column(name = "EMITEDUP")
    private String emiteDuplicataMercantil;

    @Column(name = "PERMITIRAGRUPARTITULO")
    private String permitirAgruparTitulo;

    @Column(name = "ACEITACHTERCEIROS")
    private String aceitaChequeTerceiros;

    @Column(name = "GERARCREDITODEVCLI")
    private String gerarCreditoDevolucao;

    @Column(name = "RECEBERBOLETOPOREMAIL")
    private String receberBoletoPorEmail;

    @Column(name = "PERMITEALTERCOBRANCACR")
    private String permitirAlterarCobrancaTitulos;

    @Column(name = "ENVIADADOSSERASA")
    private String enviaDadosSerasa;

    @Column(name = "VALIDARMULTIPLOVENDA")
    private String validarMultiploVenda;

    @Column(name = "BLOQUEIO")
    private String bloqueio;

    @Column(name = "CODCOB")
    private String codigoCobranca;

    @Column(name = "LIMCRED")
    private Double limite;

    @Column(name = "CODUSUR1")
    private Long codigoRcaUm;

    @Column(name = "CODUSUR2")
    private Long codigoRcaDois;

    @Column(name = "CODUSUR3")
    private Long codigoRcaTres;

    @Column(name = "CONSUMIDORFINAL")
    private String consumidorFinal;

    @Column(name = "ACEITAVENDAFRACAO")
    private String aceitaVendaFrancionada;

    @Column(name = "CLIENTPROTESTO")
    private String clientePassivelDeProtesto;

    @Column(name = "CONTRIBUINTE")
    private String contribuinte;

    @Column(name = "USACRECLIFAT")
    private String clienteUtilizaCreditoFaturamento;

    @Column(name = "CALCULAST")
    private String calculaSt;

    @Column(name = "PISCOFINSCUMULATIVO")
    private String pisCofinsCumulativo;

    @Column(name = "TELEMPR")
    private String telefoneEmpresa;

    @Column(name = "SITUACAOECOMMERCEUNILEVER")
    private String situacaoEcommerceUnilever;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia.toUpperCase();
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa.toUpperCase();
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj.toUpperCase();
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual.toUpperCase();
    }

    public Long getAtividade() {
        return atividade;
    }

    public void setAtividade(Long atividade) {
        this.atividade = atividade;
    }

    public Long getCodigoClientePrincipal() {
        return codigoClientePrincipal;
    }

    public void setCodigoClientePrincipal(Long codigoClientePrincipal) {
        this.codigoClientePrincipal = codigoClientePrincipal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Date getInicioAtividades() {
        return inicioAtividades;
    }

    public void setInicioAtividades(Date inicioAtividades) {
        this.inicioAtividades = inicioAtividades;
    }

    public Long getFuncionarioCadastro() {
        return funcionarioCadastro;
    }

    public void setFuncionarioCadastro(Long funcionarioCadastro) {
        this.funcionarioCadastro = funcionarioCadastro;
    }

    public Long getFuncionarioAlteracao() {
        return funcionarioAlteracao;
    }

    public void setFuncionarioAlteracao(Long funcionarioAlteracao) {
        this.funcionarioAlteracao = funcionarioAlteracao;
    }

    public String getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(String numeroEntrega) {
        this.numeroEntrega = numeroEntrega.toUpperCase();
    }

    public String getCelularEntrega() {
        return celularEntrega;
    }

    public void setCelularEntrega(String celularEntrega) {
        this.celularEntrega = celularEntrega;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCodigoPracaEntrega() {
        return codigoPracaEntrega;
    }

    public void setCodigoPracaEntrega(Long codigoPracaEntrega) {
        this.codigoPracaEntrega = codigoPracaEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega.toUpperCase();
    }

    public String getBairroEntrega() {
        return bairroEntrega;
    }

    public void setBairroEntrega(String bairroEntrega) {
        this.bairroEntrega = bairroEntrega.toUpperCase();
    }

    public Long getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(Long codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public Long getCidadeIbge() {
        return cidadeIbge;
    }

    public void setCidadeIbge(Long cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }

    public String getMunicipioEntrega() {
        return municipioEntrega;
    }

    public void setMunicipioEntrega(String municipioEntrega) {
        this.municipioEntrega = municipioEntrega.toUpperCase();
    }

    public String getUfEntrega() {
        return ufEntrega;
    }

    public void setUfEntrega(String ufEntrega) {
        this.ufEntrega = ufEntrega.toUpperCase();
    }

    public String getCepEntrega() {
        return cepEntrega;
    }

    public void setCepEntrega(String cepEntrega) {
        this.cepEntrega = cepEntrega;
    }

    public Long getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Long codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getTelefoneEntrega() {
        return telefoneEntrega;
    }

    public void setTelefoneEntrega(String telefoneEntrega) {
        this.telefoneEntrega = telefoneEntrega;
    }

    public String getComplementoEntrega() {
        return complementoEntrega;
    }

    public void setComplementoEntrega(String complementoEntrega) {
        this.complementoEntrega = complementoEntrega.toUpperCase();
    }

    public String getEmailNfe() {
        return emailNfe;
    }

    public void setEmailNfe(String emailNfe) {
        this.emailNfe = emailNfe;
    }

    public String getNumeroCobranca() {
        return numeroCobranca;
    }

    public void setNumeroCobranca(String numeroCobranca) {
        this.numeroCobranca = numeroCobranca.toUpperCase();
    }

    public String getComplementoCobranca() {
        return complementoCobranca;
    }

    public void setComplementoCobranca(String complementoCobranca) {
        this.complementoCobranca = complementoCobranca.toUpperCase();
    }

    public String getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(String enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca.toUpperCase();
    }

    public String getBairroCobranca() {
        return bairroCobranca;
    }

    public void setBairroCobranca(String bairroCobranca) {
        this.bairroCobranca = bairroCobranca.toUpperCase();
    }

    public String getMunicipioCobranca() {
        return municipioCobranca;
    }

    public void setMunicipioCobranca(String municipioCobranca) {
        this.municipioCobranca = municipioCobranca.toUpperCase();
    }

    public String getEstadoCobranca() {
        return estadoCobranca;
    }

    public void setEstadoCobranca(String estadoCobranca) {
        this.estadoCobranca = estadoCobranca.toUpperCase();
    }

    public String getCepCobranca() {
        return cepCobranca;
    }

    public void setCepCobranca(String cepCobranca) {
        this.cepCobranca = cepCobranca;
    }

    public String getTelefoneCobranca() {
        return telefoneCobranca;
    }

    public void setTelefoneCobranca(String telefoneCobranca) {
        this.telefoneCobranca = telefoneCobranca;
    }

    public Long getCodigoPracaCobranca() {
        return codigoPracaCobranca;
    }

    public void setCodigoPracaCobranca(Long codigoPracaCobranca) {
        this.codigoPracaCobranca = codigoPracaCobranca;
    }

    public String getEmailCobranca() {
        return emailCobranca;
    }

    public void setEmailCobranca(String emailCobranca) {
        this.emailCobranca = emailCobranca;
    }

    public String getComplementoComercial() {
        return complementoComercial;
    }

    public void setComplementoComercial(String complementoComercial) {
        this.complementoComercial = complementoComercial.toUpperCase();
    }

    public Long getCodigoCidadeComercial() {
        return codigoCidadeComercial;
    }

    public void setCodigoCidadeComercial(Long codigoCidadeComercial) {
        this.codigoCidadeComercial = codigoCidadeComercial;
    }

    public String getNumeroComercial() {
        return numeroComercial;
    }

    public void setNumeroComercial(String numeroComercial) {
        this.numeroComercial = numeroComercial.toUpperCase();
    }

    public String getBairroComercial() {
        return bairroComercial;
    }

    public void setBairroComercial(String bairroComercial) {
        this.bairroComercial = bairroComercial.toUpperCase();
    }

    public String getMunicipioComercial() {
        return municipioComercial;
    }

    public void setMunicipioComercial(String municipioComercial) {
        this.municipioComercial = municipioComercial.toUpperCase();
    }

    public String getUfComercial() {
        return ufComercial;
    }

    public void setUfComercial(String ufComercial) {
        this.ufComercial = ufComercial.toUpperCase();
    }

    public String getCepComercial() {
        return cepComercial;
    }

    public void setCepComercial(String cepComercial) {
        this.cepComercial = cepComercial;
    }

    public String getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(String enderecoComercial) {
        this.enderecoComercial = enderecoComercial.toUpperCase();
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getCepCaixaPostal() {
        return cepCaixaPostal;
    }

    public void setCepCaixaPostal(String cepCaixaPostal) {
        this.cepCaixaPostal = cepCaixaPostal;
    }

    public String getCpfCnpjEntrega() {
        return cpfCnpjEntrega;
    }

    public void setCpfCnpjEntrega(String cpfCnpjEntrega) {
        this.cpfCnpjEntrega = cpfCnpjEntrega;
    }

    public String getEmiteDuplicataMercantil() {
        return emiteDuplicataMercantil;
    }

    public void setEmiteDuplicataMercantil(String emiteDuplicataMercantil) {
        this.emiteDuplicataMercantil = emiteDuplicataMercantil.toUpperCase();
    }

    public String getPermitirAgruparTitulo() {
        return permitirAgruparTitulo;
    }

    public void setPermitirAgruparTitulo(String permitirAgruparTitulo) {
        this.permitirAgruparTitulo = permitirAgruparTitulo.toUpperCase();
    }

    public String getAceitaChequeTerceiros() {
        return aceitaChequeTerceiros;
    }

    public void setAceitaChequeTerceiros(String aceitaChequeTerceiros) {
        this.aceitaChequeTerceiros = aceitaChequeTerceiros.toUpperCase();
    }

    public String getGerarCreditoDevolucao() {
        return gerarCreditoDevolucao;
    }

    public void setGerarCreditoDevolucao(String gerarCreditoDevolucao) {
        this.gerarCreditoDevolucao = gerarCreditoDevolucao.toUpperCase();
    }

    public String getReceberBoletoPorEmail() {
        return receberBoletoPorEmail;
    }

    public void setReceberBoletoPorEmail(String receberBoletoPorEmail) {
        this.receberBoletoPorEmail = receberBoletoPorEmail.toUpperCase();
    }

    public String getPermitirAlterarCobrancaTitulos() {
        return permitirAlterarCobrancaTitulos;
    }

    public void setPermitirAlterarCobrancaTitulos(String permitirAlterarCobrancaTitulos) {
        this.permitirAlterarCobrancaTitulos = permitirAlterarCobrancaTitulos.toUpperCase();
    }

    public String getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(String bloqueio) {
        this.bloqueio = bloqueio.toUpperCase();
    }

    public String getCodigoCobranca() {
        return codigoCobranca;
    }

    public void setCodigoCobranca(String codigoCobranca) {
        this.codigoCobranca = codigoCobranca.toUpperCase();
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public String getEnviaDadosSerasa() {
        return enviaDadosSerasa;
    }

    public void setEnviaDadosSerasa(String enviaDadosSerasa) {
        this.enviaDadosSerasa = enviaDadosSerasa.toUpperCase();
    }

    public String getValidarMultiploVenda() {
        return validarMultiploVenda;
    }

    public void setValidarMultiploVenda(String validarMultiploVenda) {
        this.validarMultiploVenda = validarMultiploVenda.toUpperCase();
    }

    public Long getCodigoRcaUm() {
        return codigoRcaUm;
    }

    public void setCodigoRcaUm(Long codigoRcaUm) {
        this.codigoRcaUm = codigoRcaUm;
    }

    public Long getCodigoRcaDois() {
        return codigoRcaDois;
    }

    public void setCodigoRcaDois(Long codigoRcaDois) {
        this.codigoRcaDois = codigoRcaDois;
    }

    public Long getCodigoRcaTres() {
        return codigoRcaTres;
    }

    public void setCodigoRcaTres(Long codigoRcaTres) {
        this.codigoRcaTres = codigoRcaTres;
    }

    public String getConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(String consumidorFinal) {
        this.consumidorFinal = consumidorFinal.toUpperCase();
    }

    public String getAceitaVendaFrancionada() {
        return aceitaVendaFrancionada;
    }

    public void setAceitaVendaFrancionada(String aceitaVendaFrancionada) {
        this.aceitaVendaFrancionada = aceitaVendaFrancionada.toUpperCase();
    }

    public String getClientePassivelDeProtesto() {
        return clientePassivelDeProtesto;
    }

    public void setClientePassivelDeProtesto(String clientePassivelDeProtesto) {
        this.clientePassivelDeProtesto = clientePassivelDeProtesto.toUpperCase();
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte.toUpperCase();
    }

    public String getClienteUtilizaCreditoFaturamento() {
        return clienteUtilizaCreditoFaturamento;
    }

    public void setClienteUtilizaCreditoFaturamento(String clienteUtilizaCreditoFaturamento) {
        this.clienteUtilizaCreditoFaturamento = clienteUtilizaCreditoFaturamento.toUpperCase();
    }

    public String getCalculaSt() {
        return calculaSt;
    }

    public void setCalculaSt(String calculaSt) {
        this.calculaSt = calculaSt.toUpperCase();
    }

    public String getPisCofinsCumulativo() {
        return pisCofinsCumulativo;
    }

    public void setPisCofinsCumulativo(String pisCofinsCumulativo) {
        this.pisCofinsCumulativo = pisCofinsCumulativo.toUpperCase();
    }

    public String getTelefoneEmpresa() {
        return telefoneEmpresa;
    }

    public void setTelefoneEmpresa(String telefoneEmpresa) {
        this.telefoneEmpresa = telefoneEmpresa.toUpperCase();
    }

    public String getSituacaoEcommerceUnilever() {
        return situacaoEcommerceUnilever;
    }

    public void setSituacaoEcommerceUnilever(String situacaoEcommerceUnilever) {
        this.situacaoEcommerceUnilever = situacaoEcommerceUnilever.toUpperCase();
    }
}
