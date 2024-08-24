package br.com.acopara.rotinasweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "PCCLIENTENDENT")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODENDENTCLI")
    private Long codigoEndereco;

    @Column(name = "CODCLI")
    private Long codigoCliente;

    @Column(name = "CODBAIRROENT")
    private Long codigoBairro;

    @Column(name = "BAIRROENT")
    private String bairro;

    @Column(name = "MUNICENT")
    private String municipio;

    @Column(name = "ESTENT")
    private String uf;

    @Column(name = "CEPENT")
    private String cep;

    @Column(name = "ENDERENT")
    private String logradouro;

    @Column(name = "COMPLEMENTOENT")
    private String complemento;

    @Column(name = "CODPRACAENT")
    private Long codigoPraca;

    @Column(name = "NUMREGIAO")
    private Long codigoRegiao;

    @Column(name = "NUMEROENT")
    private String numero;

    @Column(name = "CODMUNICIPIO")
    private Long codigoMunicipio;

    @Column(name = "CODCIDADE")
    private Long codigoCidade;

    @Column(name = "PONTOREFER")
    private String pontoReferencia;

    @Column(name = "DTCAD")
    private Date dataCadastro;

    @Column(name = "DTULTALTER")
    private Date dataAlteracao;

    @Column(name = "CODFUNCCAD")
    private Long codigoFuncionarioCadastro;

    @Column(name = "CODFUNCULTALTER")
    private Long codigoFuncionarioAlteracao;

    @Column(name = "CODSEQEND")
    private Long codigoSequenciaEndereco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return codigoEndereco.equals(endereco.codigoEndereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoEndereco);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "codigoEndereco=" + codigoEndereco +
                '}';
    }

    public Long getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(Long codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public Long getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Long getCodigoBairro() {
        return codigoBairro;
    }

    public void setCodigoBairro(Long codigoBairro) {
        this.codigoBairro = codigoBairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro.toUpperCase();
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio.toUpperCase();
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf.toUpperCase();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro.toUpperCase();
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento.toUpperCase();
    }

    public Long getCodigoPraca() {
        return codigoPraca;
    }

    public void setCodigoPraca(Long codigoPraca) {
        this.codigoPraca = codigoPraca;
    }

    public Long getCodigoRegiao() {
        return codigoRegiao;
    }

    public void setCodigoRegiao(Long codigoRegiao) {
        this.codigoRegiao = codigoRegiao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero.toUpperCase();
    }

    public Long getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(Long codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public Long getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(Long codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia.toUpperCase();
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

    public Long getCodigoFuncionarioCadastro() {
        return codigoFuncionarioCadastro;
    }

    public void setCodigoFuncionarioCadastro(Long codigoFuncionarioCadastro) {
        this.codigoFuncionarioCadastro = codigoFuncionarioCadastro;
    }

    public Long getCodigoFuncionarioAlteracao() {
        return codigoFuncionarioAlteracao;
    }

    public void setCodigoFuncionarioAlteracao(Long codigoFuncionarioAlteracao) {
        this.codigoFuncionarioAlteracao = codigoFuncionarioAlteracao;
    }

    public Long getCodigoSequenciaEndereco() {
        return codigoSequenciaEndereco;
    }

    public void setCodigoSequenciaEndereco(Long codigoSequenciaEndereco) {
        this.codigoSequenciaEndereco = codigoSequenciaEndereco;
    }
}
