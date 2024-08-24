package br.com.acopara.rotinasweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TIITEMESTRUTPROD")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ItemEstruturaProduto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODESTPRDO")
    private Long codigoEstruturaProduto;

    @Column(name = "CODPROD")
    private Long codigoProduto;

    @Column(name = "QTPROD")
    private Long quantidade;

    @Column(name = "ORDEM")
    private Long ordem;

    @Column(name = "TIPOPROD")
    private String tipoProduto;

    @Column(name = "DESCRICAOPROD")
    private String descricaoProduto;

}
