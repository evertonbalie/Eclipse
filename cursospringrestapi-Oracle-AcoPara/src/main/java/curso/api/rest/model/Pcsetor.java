package curso.api.rest.model;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="pcsetor")
public class Pcsetor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codsetor;
	private String descricao;
	private String usarmyfrota;
	private Date dtultalter;

	public Long getCodsetor() {
		return codsetor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUsarmyfrota() {
		return usarmyfrota;
	}

	public void setUsarmyfrota(String usarmyfrota) {
		this.usarmyfrota = usarmyfrota;
	}

	public Date getDtultalter() {
		return dtultalter;
	}

	public void setDtultalter(Date dtultalter) {
		this.dtultalter = dtultalter;
	}

	public void setCodsetor(Long codsetor) {
		this.codsetor = codsetor;
	}
}
	
