package br.com.acopara.rotinasweb.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.Cidade;
import br.com.acopara.rotinasweb.repository.CidadeRepository;

@RestController
@RequestMapping(value = "/api/cidades")
public class CidadeEndpoint {

    @Autowired
    CidadeRepository cidadeRepository;

    @GetMapping
    public List<Cidade> listaCidades(){
        return cidadeRepository.findAll();
    }
}
