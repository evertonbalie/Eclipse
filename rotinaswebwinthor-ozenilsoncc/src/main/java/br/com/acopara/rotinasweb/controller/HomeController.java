package br.com.acopara.rotinasweb.controller;

import br.com.acopara.rotinasweb.model.DashboardRca;
import br.com.acopara.rotinasweb.model.DashboardSupervisor;
import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.DashboardRcaRepository;
import br.com.acopara.rotinasweb.repository.DashboardSupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.acopara.rotinasweb.repository.PermissaoRepository;
import br.com.acopara.rotinasweb.repository.UsuarioRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PermissaoRepository permissaoRepository;

    @Autowired
    DashboardRcaRepository dashboardRcaRepository;

    @Autowired
    DashboardSupervisorRepository dashboardSupervisorRepository;

    @GetMapping("/login")
    public String entrar() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard(ModelMap dashboard, ModelMap rcas) {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());

//        if (usuario.getCodigoRca() == null || usuario.getCodigoRca() == 1 ) {
//            return "pages/home";
//        }else
        if (usuario.getCodigoSupervisor() != null) {
            DashboardSupervisor dashboardLoja = dashboardSupervisorRepository.getDadosDashboardSupervisor(usuario.getCodigoSupervisor());
            System.out.println(dashboardLoja);
            if (dashboardLoja != null) {
                dashboard.addAttribute("dash", dashboardLoja);
                rcas.addAttribute("vend", dashboardRcaRepository.getDadosDashboardSupervisor(usuario.getCodigoSupervisor()));
                return "pages/dashboard-supervisor";
            } else {
                return "pages/dashboard-semvenda";
            }
        } else
        if (usuario.getCodigoRca() != null) {
            DashboardRca dashboardRca = dashboardRcaRepository.getDadosDashboard(usuario.getCodigoRca());
            System.out.println(dashboardRca);
            if (dashboardRca != null) {
                dashboard.addAttribute("dash", dashboardRca);
                return "pages/dashboard";
            } else {
                return "pages/dashboard-semvenda";
            }
        } else {
            return "pages/home";
        }
    }

    @GetMapping("/dashboard2")
    public String dashboard2(ModelMap dashboard) {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());

        dashboard.addAttribute("dash", dashboardRcaRepository.getDadosDashboardSupervisor(usuario.getCodigoSupervisor()));
        return "pages/dashboard-supervisor";
    }
}
