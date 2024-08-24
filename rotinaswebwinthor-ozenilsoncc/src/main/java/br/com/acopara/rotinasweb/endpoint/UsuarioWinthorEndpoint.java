package br.com.acopara.rotinasweb.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.UsuarioWinthor;
import br.com.acopara.rotinasweb.repository.UsuarioWinthorRepository;

@RestController
@RequestMapping(value = "/api/usuariowinthor")
public class UsuarioWinthorEndpoint {

    @Autowired
    UsuarioWinthorRepository usuarioWinthorRepository;

    @GetMapping
    public List<UsuarioWinthor> listaUsuarioWinthor(){
        return usuarioWinthorRepository.findAll();
    }

    @GetMapping("/{usuario}")
    public UsuarioWinthor getUsuarioWinthor(@PathVariable(value = "usuario") String usuario){
        return usuarioWinthorRepository.getByUsuario(usuario);
    }
}
