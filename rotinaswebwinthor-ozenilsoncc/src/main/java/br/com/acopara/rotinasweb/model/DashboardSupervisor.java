package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DashboardSupervisor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long supervisor;
    private Long qtpedidos;
    private Long qtorcamentos;
    private Long qtorcamentoconvertido;
    private Long produtividade;
    private Long qtitens;
    private Double mediaqtitens;
    private Long qtclipos;
    private Double totpeso;
    private Double vlvendames;
    private Double metames;
    private Double percentmetames;
    private Double ticketmedio;
    private Double projvendas;
    private Double vlvendadia;
    private Double metadia;
    private Double percentmetadia;

    public Long getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Long supervisor) {
        this.supervisor = supervisor;
    }

    public Long getQtpedidos() {
        return qtpedidos;
    }

    public void setQtpedidos(Long qtpedidos) {
        this.qtpedidos = qtpedidos;
    }

    public Long getQtorcamentos() {
        return qtorcamentos;
    }

    public void setQtorcamentos(Long qtorcamentos) {
        this.qtorcamentos = qtorcamentos;
    }

    public Long getQtorcamentoconvertido() {
        return qtorcamentoconvertido;
    }

    public void setQtorcamentoconvertido(Long qtorcamentoconvertido) {
        this.qtorcamentoconvertido = qtorcamentoconvertido;
    }

    public Long getProdutividade() {
        return produtividade;
    }

    public void setProdutividade(Long produtividade) {
        this.produtividade = produtividade;
    }

    public Long getQtitens() {
        return qtitens;
    }

    public void setQtitens(Long qtitens) {
        this.qtitens = qtitens;
    }

    public Double getMediaqtitens() {
        return mediaqtitens;
    }

    public void setMediaqtitens(Double mediaqtitens) {
        this.mediaqtitens = mediaqtitens;
    }

    public Long getQtclipos() {
        return qtclipos;
    }

    public void setQtclipos(Long qtclipos) {
        this.qtclipos = qtclipos;
    }

    public Double getTotpeso() {
        return totpeso;
    }

    public void setTotpeso(Double totpeso) {
        this.totpeso = totpeso;
    }

    public Double getVlvendames() {
        return vlvendames;
    }

    public void setVlvendames(Double vlvendames) {
        this.vlvendames = vlvendames;
    }

    public Double getMetames() {
        return metames;
    }

    public void setMetames(Double metames) {
        this.metames = metames;
    }

    public Double getPercentmetames() {
        return percentmetames;
    }

    public void setPercentmetames(Double percentmetames) {
        this.percentmetames = percentmetames;
    }

    public Double getTicketmedio() {
        return ticketmedio;
    }

    public void setTicketmedio(Double ticketmedio) {
        this.ticketmedio = ticketmedio;
    }

    public Double getProjvendas() {
        return projvendas;
    }

    public void setProjvendas(Double projvendas) {
        this.projvendas = projvendas;
    }

    public Double getVlvendadia() {
        return vlvendadia;
    }

    public void setVlvendadia(Double vlvendadia) {
        this.vlvendadia = vlvendadia;
    }

    public Double getMetadia() {
        return metadia;
    }

    public void setMetadia(Double metadia) {
        this.metadia = metadia;
    }

    public Double getPercentmetadia() {
        return percentmetadia;
    }

    public void setPercentmetadia(Double percentmetadia) {
        this.percentmetadia = percentmetadia;
    }
}
