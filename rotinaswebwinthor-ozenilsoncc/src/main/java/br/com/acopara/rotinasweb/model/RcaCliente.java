package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PCUSURCLI")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RcaCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "CODUSUR")
    private Long rca;

    @Id
    @Column(name = "CODCLI")
    private Long cliente;

    @Override
    public String toString() {
        return "RcaCliente{" +
                "rca=" + rca +
                ", cliente='" + cliente + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RcaCliente that = (RcaCliente) o;
        return rca.equals(that.rca) &&
                cliente.equals(that.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rca, cliente);
    }

    public Long getRca() {
        return rca;
    }

    public void setRca(Long rca) {
        this.rca = rca;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }
}
