package br.com.acopara.rotinasweb.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.Endereco;
import br.com.acopara.rotinasweb.repository.EnderecoRepository;

@RestController
@RequestMapping(value = "/api/enderecos")
public class EnderecoEndpoint {

    @Autowired
    EnderecoRepository enderecoRepository;

    @GetMapping("/cliente/{cliente}")
    public List<Endereco> getEnderecosCliente(@PathVariable(value = "cliente") Long cliente){
        return enderecoRepository.findAllByCodigoCliente(cliente);
    }
}
