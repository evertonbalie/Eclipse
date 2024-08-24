package br.com.acopara.rotinasweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "PCEMPR")
public class UsuarioWinthor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MATRICULA")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "USUARIOBD")
    private String usuario;

    @Column(name = "CODUSUR")
    private Long codigoRca;

    @Column(name = "SITUACAO")
    private String situacao;

    @Override
    public String toString() {
        return "UsuarioWinthor{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioWinthor that = (UsuarioWinthor) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getCodigoRca() {
        return codigoRca;
    }

    public void setCodigoRca(Long codigoRca) {
        this.codigoRca = codigoRca;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
