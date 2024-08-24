package br.com.acopara.rotinasweb.controller;

import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.LojaRepository;
import br.com.acopara.rotinasweb.repository.PermissaoRepository;
import br.com.acopara.rotinasweb.repository.UsuarioRepository;
import br.com.acopara.rotinasweb.repository.UsuarioWinthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/projeto")
public class ProdutoController {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    LojaRepository lojaRepository;
    @Autowired
    UsuarioWinthorRepository usuarioWinthorRepository;
    @Autowired
    PermissaoRepository permissaoRepository;

    @GetMapping("/estruturar-produto")
    public String usuarios(ModelMap usuarios) {

        usuarios.addAttribute("usuarios", usuarioRepository.findAll());
        
        return "pages/estrutura-produto";
    }

}
