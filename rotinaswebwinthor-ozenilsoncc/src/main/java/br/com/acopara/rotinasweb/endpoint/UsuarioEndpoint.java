package br.com.acopara.rotinasweb.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioEndpoint {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    public Usuario listaUsuarios(){
        return usuarioRepository.findByUsuario("PCADMIN");
    }
}
