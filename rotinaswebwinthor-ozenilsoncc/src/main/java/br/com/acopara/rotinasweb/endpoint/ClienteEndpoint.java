package br.com.acopara.rotinasweb.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.Cliente;
import br.com.acopara.rotinasweb.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteEndpoint {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listaClientes(){
        return clienteRepository.findAll();
    }

    @GetMapping("/cpf/{cpf}")
    public Cliente clienteByCpf(@PathVariable (value = "cpf") String cpf){
        return clienteRepository.findClienteByCpfCnpj(cpf);
    }

    @GetMapping("/codigo/{id}")
    public Cliente clienteById(@PathVariable (value = "id") Long id){
        return clienteRepository.getOne(id);
    }
}
