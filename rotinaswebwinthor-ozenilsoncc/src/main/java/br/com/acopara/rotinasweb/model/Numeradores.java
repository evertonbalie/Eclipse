package br.com.acopara.rotinasweb.model;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PCCONSUM")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Numeradores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODCLIPC")
    private Long id;

    @Column(name = "PROXNUMPED")
    private Long proximoNumeroPedido;

    @Column(name = "PROXNUMORC")
    private Long proximoNumeroOrcamento;

    @Column(name = "PROXNUMCAR")
    private Long proximoNumeroCarregamento;

    @Column(name = "PROXNUMCLI")
    private Long proximoNumeroCliente;

    @Column(name = "PROXNUMBONUS")
    private Long proximoNumeroBonus;

    @Column(name = "PROXNUMTRANS")
    private Long proximoNumeroTransacao;

    @Column(name = "PROXNUMLANC")
    private Long proximoNumeroLancamento;

    @Column(name = "PROXNUMTRANSVENDA")
    private Long proximoNumeroTransacaoVenda;

    @Column(name = "PROXNUMFORNEC")
    private Long proximoNumeroFornecedor;

    @Column(name = "PROXNUMPRODUT")
    private Long proximoNumeroProduto;

    @Column(name = "PROXNUMRCA")
    private Long proximoNumeroRca;

    @Column(name = "PROXNUMOP")
    private Long proximoNumeroOrdemProducao;

    @Column(name = "PROXNUMPCP")
    private Long proximoNumeroPcp;

    @Column(name = "PROXNUMOPI")
    private Long proximoNumeroItemOrdemProducao;

    @Column(name = "PROXNUMLOTE")
    private Long proximoNumeroLote;

    @Column(name = "PROXCODPRACA")
    private Long proximoNumeroPraca;

    @Column(name = "PROXCODUSUR")
    private Long proximoNumeroUsuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numeradores that = (Numeradores) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Numeradores{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProximoNumeroPedido() {
        return proximoNumeroPedido;
    }

    public void setProximoNumeroPedido(Long proximoNumeroPedido) {
        this.proximoNumeroPedido = proximoNumeroPedido;
    }

    public Long getProximoNumeroOrcamento() {
        return proximoNumeroOrcamento;
    }

    public void setProximoNumeroOrcamento(Long proximoNumeroOrcamento) {
        this.proximoNumeroOrcamento = proximoNumeroOrcamento;
    }

    public Long getProximoNumeroCarregamento() {
        return proximoNumeroCarregamento;
    }

    public void setProximoNumeroCarregamento(Long proximoNumeroCarregamento) {
        this.proximoNumeroCarregamento = proximoNumeroCarregamento;
    }

    public Long getProximoNumeroCliente() {
        return proximoNumeroCliente;
    }

    public void setProximoNumeroCliente(Long proximoNumeroCliente) {
        this.proximoNumeroCliente = proximoNumeroCliente;
    }

    public Long getProximoNumeroBonus() {
        return proximoNumeroBonus;
    }

    public void setProximoNumeroBonus(Long proximoNumeroBonus) {
        this.proximoNumeroBonus = proximoNumeroBonus;
    }

    public Long getProximoNumeroTransacao() {
        return proximoNumeroTransacao;
    }

    public void setProximoNumeroTransacao(Long proximoNumeroTransacao) {
        this.proximoNumeroTransacao = proximoNumeroTransacao;
    }

    public Long getProximoNumeroLancamento() {
        return proximoNumeroLancamento;
    }

    public void setProximoNumeroLancamento(Long proximoNumeroLancamento) {
        this.proximoNumeroLancamento = proximoNumeroLancamento;
    }

    public Long getProximoNumeroTransacaoVenda() {
        return proximoNumeroTransacaoVenda;
    }

    public void setProximoNumeroTransacaoVenda(Long proximoNumeroTransacaoVenda) {
        this.proximoNumeroTransacaoVenda = proximoNumeroTransacaoVenda;
    }

    public Long getProximoNumeroFornecedor() {
        return proximoNumeroFornecedor;
    }

    public void setProximoNumeroFornecedor(Long proximoNumeroFornecedor) {
        this.proximoNumeroFornecedor = proximoNumeroFornecedor;
    }

    public Long getProximoNumeroProduto() {
        return proximoNumeroProduto;
    }

    public void setProximoNumeroProduto(Long proximoNumeroProduto) {
        this.proximoNumeroProduto = proximoNumeroProduto;
    }

    public Long getProximoNumeroRca() {
        return proximoNumeroRca;
    }

    public void setProximoNumeroRca(Long proximoNumeroRca) {
        this.proximoNumeroRca = proximoNumeroRca;
    }

    public Long getProximoNumeroOrdemProducao() {
        return proximoNumeroOrdemProducao;
    }

    public void setProximoNumeroOrdemProducao(Long proximoNumeroOrdemProducao) {
        this.proximoNumeroOrdemProducao = proximoNumeroOrdemProducao;
    }

    public Long getProximoNumeroPcp() {
        return proximoNumeroPcp;
    }

    public void setProximoNumeroPcp(Long proximoNumeroPcp) {
        this.proximoNumeroPcp = proximoNumeroPcp;
    }

    public Long getProximoNumeroItemOrdemProducao() {
        return proximoNumeroItemOrdemProducao;
    }

    public void setProximoNumeroItemOrdemProducao(Long proximoNumeroItemOrdemProducao) {
        this.proximoNumeroItemOrdemProducao = proximoNumeroItemOrdemProducao;
    }

    public Long getProximoNumeroLote() {
        return proximoNumeroLote;
    }

    public void setProximoNumeroLote(Long proximoNumeroLote) {
        this.proximoNumeroLote = proximoNumeroLote;
    }

    public Long getProximoNumeroPraca() {
        return proximoNumeroPraca;
    }

    public void setProximoNumeroPraca(Long proximoNumeroPraca) {
        this.proximoNumeroPraca = proximoNumeroPraca;
    }

    public Long getProximoNumeroUsuario() {
        return proximoNumeroUsuario;
    }

    public void setProximoNumeroUsuario(Long proximoNumeroUsuario) {
        this.proximoNumeroUsuario = proximoNumeroUsuario;
    }
}
