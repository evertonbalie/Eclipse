package curso.api.rest.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pcempr")
public class Pcempr implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String matricula;
	private String nome;
	private String nome_guerra;
	private String codsetor;
	private String cpf;
	
	@Override
	public int hashCode() {
		return Objects.hash(codsetor);
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome_guerra() {
		return nome_guerra;
	}
	public void setNome_guerra(String nome_guerra) {
		this.nome_guerra = nome_guerra;
	}
	public String getCodsetor() {
		return codsetor;
	}
	public void setCodsetor(String codsetor) {
		this.codsetor = codsetor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pcempr other = (Pcempr) obj;
		return Objects.equals(codsetor, other.codsetor);
	}
	public String getMatricula() {
		return matricula;
	}
	
	

}
