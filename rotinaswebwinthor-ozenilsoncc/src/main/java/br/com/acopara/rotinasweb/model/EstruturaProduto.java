package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TIESTRUTPROD")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EstruturaProduto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODIGO")
    private Long id;

    @Column(name = "CODPROD")
    private Long codigoProduto;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "QTPROD")
    private Long quantidade;

    @Column(name = "ORDEM")
    private Long ordem;

    @Column(name = "TIPOPROD")
    private String tipoProduto;

    @Override
    public String toString() {
        return "EstruturaProduto{" +
                "id=" + id +
                ", codigoProduto=" + codigoProduto +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", ordem=" + ordem +
                ", tipoProduto='" + tipoProduto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstruturaProduto that = (EstruturaProduto) o;
        return Objects.equals(id, that.id) && Objects.equals(codigoProduto, that.codigoProduto) && Objects.equals(descricao, that.descricao) && Objects.equals(quantidade, that.quantidade) && Objects.equals(ordem, that.ordem) && Objects.equals(tipoProduto, that.tipoProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoProduto, descricao, quantidade, ordem, tipoProduto);
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Long getOrdem() {
        return ordem;
    }

    public void setOrdem(Long ordem) {
        this.ordem = ordem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
