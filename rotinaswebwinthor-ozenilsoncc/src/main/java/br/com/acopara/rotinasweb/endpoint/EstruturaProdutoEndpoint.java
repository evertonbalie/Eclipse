package br.com.acopara.rotinasweb.endpoint;

import br.com.acopara.rotinasweb.model.Endereco;
import br.com.acopara.rotinasweb.model.EstruturaProduto;
import br.com.acopara.rotinasweb.repository.EnderecoRepository;
import br.com.acopara.rotinasweb.repository.EstruturaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/estrutura-produto")
public class EstruturaProdutoEndpoint {

    @Autowired
    EstruturaProdutoRepository estruturaProdutoRepository;

    @GetMapping("/{produto}")
    public EstruturaProduto getProdutoEstruturado(@PathVariable(value = "produto") Long produto){
        return estruturaProdutoRepository.getOne(produto);
    }
}
