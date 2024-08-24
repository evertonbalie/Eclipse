package br.com.acopara.rotinasweb.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.Praca;
import br.com.acopara.rotinasweb.repository.PracaRepository;

@RestController
@RequestMapping(value = "/api/pracas")
public class PracaEndpoint {

    @Autowired
    PracaRepository pracaRepository;

    @GetMapping
    public List<Praca> listaPracas(){
        return pracaRepository.findAll();
    }

    @GetMapping("/ativas")
    public List<Praca> listaPracasAtivas(){
        return pracaRepository.findAllBySituacaoOrderById("A");
    }

    @GetMapping("/{id}")
    public Praca getPracaById(@PathVariable(value = "id") Long id) {
        return pracaRepository.getOne(id);
    }
}
