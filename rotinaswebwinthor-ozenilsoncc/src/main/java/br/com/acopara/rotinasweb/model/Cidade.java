package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PCCIDADE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODCIDADE")
    private Long id;

    @Column(name = "NOMECIDADE")
    private String nomeCidade;

    @Column(name = "CODIBGE")
    private Long codigoIbge;

    @Column(name = "UF")
    private String uf;

    @Column(name = "CODMUNESTADUAL")
    private Long codigoMunicipioEstadual;

    @Column(name = "UTILIZAFRETETRANSP")
    private String utilizaFreteTransportadora;

    @Column(name = "CODMUNSIAFI")
    private Long codigoMunicipioSiafi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return id.equals(cidade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Long getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getCodigoMunicipioEstadual() {
        return codigoMunicipioEstadual;
    }

    public void setCodigoMunicipioEstadual(Long codigoMunicipioEstadual) {
        this.codigoMunicipioEstadual = codigoMunicipioEstadual;
    }

    public String getUtilizaFreteTransportadora() {
        return utilizaFreteTransportadora;
    }

    public void setUtilizaFreteTransportadora(String utilizaFreteTransportadora) {
        this.utilizaFreteTransportadora = utilizaFreteTransportadora;
    }

    public Long getCodigoMunicipioSiafi() {
        return codigoMunicipioSiafi;
    }

    public void setCodigoMunicipioSiafi(Long codigoMunicipioSiafi) {
        this.codigoMunicipioSiafi = codigoMunicipioSiafi;
    }
}
