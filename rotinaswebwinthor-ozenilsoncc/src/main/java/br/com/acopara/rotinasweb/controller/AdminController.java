package br.com.acopara.rotinasweb.controller;

import br.com.acopara.rotinasweb.model.Endereco;
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

import java.util.Date;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    LojaRepository lojaRepository;
    @Autowired
    UsuarioWinthorRepository usuarioWinthorRepository;
    @Autowired
    PermissaoRepository permissaoRepository;

    @GetMapping("/usuarios")
    public String usuarios(ModelMap usuarios) {

        usuarios.addAttribute("usuarios", usuarioRepository.findAll());
        
        return "pages/usuarios";
    }

    @GetMapping("/usuarios/cadastrar")
    public String usuariosCadastrar(ModelMap user, ModelMap permissao, ModelMap usuarioWinthor, ModelMap lojas) {

        user.addAttribute("usuarios", usuarioRepository.findAll());
        permissao.addAttribute("permissoes", permissaoRepository.findAll());
        usuarioWinthor.addAttribute("usuarioWinthor", usuarioWinthorRepository.findAll());
        lojas.addAttribute("lojas", lojaRepository.findByPosicao("A"));

        return "pages/cadastro-usuario";
    }

    @PostMapping("usuarios/salvar")
    public String usuarioSalvar(Usuario usuario, RedirectAttributes attr) {

        if (usuario.getCodigoSupervisor() == Long.valueOf(0))
            usuario.setCodigoSupervisor(null);

        usuarioRepository.save(usuario);

        attr.addFlashAttribute("success","Usuário cadastrado com sucesso!");
        return "redirect:/admin/usuarios";
    }

    @GetMapping("usuarios/edicao/{usuario}")
    public String getEdicaoUsuario(@PathVariable(value = "usuario") String usuario, ModelMap model, ModelMap user, ModelMap permissao, ModelMap usuarioWinthor, ModelMap lojas) {



        user.addAttribute("usuarios", usuarioRepository.findAll());
        permissao.addAttribute("permissoes", permissaoRepository.findAll());
        usuarioWinthor.addAttribute("usuarioWinthor", usuarioWinthorRepository.findAll());
        lojas.addAttribute("lojas", lojaRepository.findByPosicao("A"));
        model.addAttribute("usuario", usuarioRepository.findById(usuario));

        return "pages/editar-usuario";
    }

    @PostMapping("usuarios/editar")
    public String editarEndereco(Usuario usuario, RedirectAttributes attr) {

        if (usuario.getCodigoSupervisor() == Long.valueOf(0))
            usuario.setCodigoSupervisor(null);

        usuarioRepository.save(usuario);
        attr.addFlashAttribute("success","Usuário alterado com sucesso!");

        return "redirect:/admin/usuarios";
    }

    @PostMapping("usuarios/alterarsenha")
    public String alterarSenha(String senha, RedirectAttributes attr){

        String usuario = SecurityContextHolder.getContext().getAuthentication().getName();
        String pass = new BCryptPasswordEncoder().encode(senha);

        usuarioRepository.updatePasswordById(usuario,pass);

        attr.addFlashAttribute("success","Senha alterada com sucesso!");
        return "redirect:/dashboard";
    }

    @GetMapping("usuarios/resetarsenha/{usuario}")
    public String resetarSenha(@PathVariable(value = "usuario") String usuario, RedirectAttributes attr){

        String senha = new BCryptPasswordEncoder().encode("123");

        usuarioRepository.updatePasswordById(usuario,senha);

        attr.addFlashAttribute("success","Senha resetada com sucesso!");
        return "redirect:/admin/usuarios";
    }

    @GetMapping("usuarios/ativar/{usuario}")
    public String ativarUsuario(@PathVariable(value = "usuario") String usuario, RedirectAttributes attr){

        usuarioRepository.ativarInativarUsuario(usuario,true);

        attr.addFlashAttribute("success","Usuário ativado com sucesso!");
        return "redirect:/admin/usuarios";
    }

    @GetMapping("usuarios/inativar/{usuario}")
    public String inativarUsuario(@PathVariable(value = "usuario") String usuario, RedirectAttributes attr){

        usuarioRepository.ativarInativarUsuario(usuario,false);

        attr.addFlashAttribute("success","Usuário inativado com sucesso!");
        return "redirect:/admin/usuarios";
    }
}
