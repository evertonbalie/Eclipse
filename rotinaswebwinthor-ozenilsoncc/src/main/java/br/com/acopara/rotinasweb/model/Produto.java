package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PCPRODUT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODPROD")
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "CODEPTO")
    private Long codigoDepartamento;

    @Column(name = "CODSEC")
    private Long codigoSecao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(Long codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public Long getCodigoSecao() {
        return codigoSecao;
    }

    public void setCodigoSecao(Long codigoSecao) {
        this.codigoSecao = codigoSecao;
    }
}
