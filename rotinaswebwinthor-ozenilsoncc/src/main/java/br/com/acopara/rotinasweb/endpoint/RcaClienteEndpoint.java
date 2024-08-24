package br.com.acopara.rotinasweb.endpoint;

import br.com.acopara.rotinasweb.model.RcaCliente;
import br.com.acopara.rotinasweb.repository.RcaClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/rca-cliente")
public class RcaClienteEndpoint {

    @Autowired
    RcaClienteRepository rcaClienteRepository;

    @GetMapping("rca/{rca}")
    public List<RcaCliente> listaClienteRca(@PathVariable (value = "rca") Long rca){
        return rcaClienteRepository.findAllByRca(rca);
    }

    @GetMapping("cliente/{cliente}")
    public List<RcaCliente> listaClienteRca2(@PathVariable (value = "cliente") Long cliente){
        return rcaClienteRepository.findAllByCliente(cliente);
    }
}
