package br.com.acopara.rotinasweb.endpoint;

import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.DashboardRcaRepository;
import br.com.acopara.rotinasweb.repository.FaturamentoRepository;
import br.com.acopara.rotinasweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/faturamento")
public class FaturamentoEndpoint {

    @Autowired
    FaturamentoRepository faturamentoRepository;

    @Autowired
    DashboardRcaRepository dashboardRcaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/dozemeses")
    public ResponseEntity<?> getFaturamentoDozeMeses() {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
        return new ResponseEntity<>(faturamentoRepository.getFaturamentoDozeMeses(usuario.getCodigoRca()), HttpStatus.OK);
    }

    @GetMapping("/dozemeses/supervisor")
    public ResponseEntity<?> getFaturamentoDozeMesesSupervisor() {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
        return new ResponseEntity<>(faturamentoRepository.getFaturamentoDozeMesesSupervisor(usuario.getCodigoSupervisor()), HttpStatus.OK);
    }

    @GetMapping("/dashboard")
    public ResponseEntity<?> getDashboard() {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
        return new ResponseEntity<>(dashboardRcaRepository.getDadosDashboard(usuario.getCodigoRca()), HttpStatus.OK);
    }
}
