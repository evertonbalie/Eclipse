package AppRh.AppRh.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Vaga {
	
	private static long serialVersionUID=1L;
		
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long codigo;
    @NotEmpty
    private String nome;
    
    @NotEmpty
    private String descricao;
    
    @NotEmpty
    private String data;
    
    @NotEmpty
    private String salario;
	
   @OneToMany(mappedBy = "vaga", cascade=CascadeType.REMOVE)
    private List<Candidatos> candidatos;

public long getCodigo() {
	return codigo;
}

public void setCodigo(long codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public String getSalario() {
	return salario;
}

public void setSalario(String salario) {
	this.salario = salario;
}

public List<Candidatos> getCandidatos() {
	return candidatos;
}

public void setCandidatos(List<Candidatos> candidatos) {
	this.candidatos = candidatos;
}
	
}
