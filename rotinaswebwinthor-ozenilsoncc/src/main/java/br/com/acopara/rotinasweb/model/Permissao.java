package br.com.acopara.rotinasweb.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TIPERMISSAO")
public class Permissao implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NOMEPERMISSAO")
    private String nomePermissao;

    @ManyToMany(mappedBy = "permissoes")
    private List<Usuario> usuarios;

    @Override
    public String getAuthority() {
        return this.nomePermissao;
    }

    public String getNomePermissao() {
        return nomePermissao;
    }

    public void setNomePermissao(String nomePermissao) {
        this.nomePermissao = nomePermissao.toUpperCase();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
