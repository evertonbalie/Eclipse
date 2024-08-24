package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PCEST")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODPROD")
    private Long id;

    @Column(name = "CODFILIAL")
    private String filial;

    @Column(name = "QTESTGER")
    private Long estoque;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public Long getEstoque() {
        return estoque;
    }

    public void setEstoque(Long estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "id=" + id +
                ", filial='" + filial + '\'' +
                ", estoque=" + estoque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque1 = (Estoque) o;
        return id.equals(estoque1.id) && filial.equals(estoque1.filial) && estoque.equals(estoque1.estoque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filial, estoque);
    }
}
