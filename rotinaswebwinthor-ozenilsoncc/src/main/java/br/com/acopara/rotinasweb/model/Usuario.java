package br.com.acopara.rotinasweb.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "TIUSUARIO")
public class Usuario implements UserDetails, Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "ATIVO")
    private boolean ativo;

    @Column(name = "USUARIOWINTHOR")
    private Long usuarioWinthor;

    @Column(name = "CODIGORCA")
    private Long codigoRca;

    @Column(name = "CODIGOSUPERVISOR")
    private Long codigoSupervisor;

    @ManyToMany
    @JoinTable(name = "TIUSUARIOPERMISSAO",
            joinColumns = {@JoinColumn(name = "USUARIO", referencedColumnName = "USUARIO")},
            inverseJoinColumns = {@JoinColumn(name = "NOMEPERMISSAO", referencedColumnName = "NOMEPERMISSAO")})
    private List<Permissao> permissoes;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return (Collection<? extends GrantedAuthority>) this.permissoes;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.usuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.ativo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Long getUsuarioWinthor() {
        return usuarioWinthor;
    }

    public void setUsuarioWinthor(Long usuarioWinthor) {
        this.usuarioWinthor = usuarioWinthor;
    }

    public Long getCodigoRca() {
        return codigoRca;
    }

    public void setCodigoRca(Long codigoRca) {
        this.codigoRca = codigoRca;
    }

    public Long getCodigoSupervisor() {
        return codigoSupervisor;
    }

    public void setCodigoSupervisor(Long codigoSupervisor) {
        this.codigoSupervisor = codigoSupervisor;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissao> permissoes) {
        this.permissoes = permissoes;
    }
}
