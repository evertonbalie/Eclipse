package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PCPRACA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Praca implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODPRACA")
    private Long id;

    @Column(name = "PRACA")
    private String praca;

    @Column(name = "NUMREGIAO")
    private String regiao;

    @Column(name = "ROTA")
    private String rota;

    @Column(name = "CODPRACAORIG")
    private String pracaOriginal;

    @Column(name = "SITUACAO")
    private String situacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Praca praca = (Praca) o;
        return id.equals(praca.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Praca{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getPracaOriginal() {
        return pracaOriginal;
    }

    public void setPracaOriginal(String pracaOriginal) {
        this.pracaOriginal = pracaOriginal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
