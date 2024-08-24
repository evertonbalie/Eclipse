package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Rastreamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long pedido;
    private Long codcli;
    private String cliente;
    private Date horapedido;
    private Date horaemissaomapa;
    private Date horafaturamento;
    private Date preventrega;
    private Long ordementrega;
    private Date horaentrega;
    private Long carga;

    @Override
    public String toString() {
        return "Rastreamento{" +
                "pedido=" + pedido +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rastreamento that = (Rastreamento) o;
        return Objects.equals(pedido, that.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido);
    }

    public Long getPedido() {
        return pedido;
    }

    public void setPedido(Long pedido) {
        this.pedido = pedido;
    }

    public Long getCodcli() {
        return codcli;
    }

    public void setCodcli(Long codcli) {
        this.codcli = codcli;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getHorapedido() {
        return horapedido;
    }

    public void setHorapedido(Date horapedido) {
        this.horapedido = horapedido;
    }

    public Date getHoraemissaomapa() {
        return horaemissaomapa;
    }

    public void setHoraemissaomapa(Date horaemissaomapa) {
        this.horaemissaomapa = horaemissaomapa;
    }

    public Date getHorafaturamento() {
        return horafaturamento;
    }

    public void setHorafaturamento(Date horafaturamento) {
        this.horafaturamento = horafaturamento;
    }

    public Date getPreventrega() {
        return preventrega;
    }

    public void setPreventrega(Date preventrega) {
        this.preventrega = preventrega;
    }

    public Long getOrdementrega() {
        return ordementrega;
    }

    public void setOrdementrega(Long ordementrega) {
        this.ordementrega = ordementrega;
    }

    public Date getHoraentrega() {
        return horaentrega;
    }

    public void setHoraentrega(Date horaentrega) {
        this.horaentrega = horaentrega;
    }

    public Long getCarga() {
        return carga;
    }

    public void setCarga(Long carga) {
        this.carga = carga;
    }
}
