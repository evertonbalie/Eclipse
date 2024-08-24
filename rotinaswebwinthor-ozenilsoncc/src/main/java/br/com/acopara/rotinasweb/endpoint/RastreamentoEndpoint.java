package br.com.acopara.rotinasweb.endpoint;

import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.DashboardRcaRepository;
import br.com.acopara.rotinasweb.repository.FaturamentoRepository;
import br.com.acopara.rotinasweb.repository.RastreamentoRepository;
import br.com.acopara.rotinasweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/rastreamento")
public class RastreamentoEndpoint {

    @Autowired
    RastreamentoRepository rastreamentoRepository;

    @Autowired
    DashboardRcaRepository dashboardRcaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/rca")
    public ResponseEntity<?> getRastreamentoPedidosRca() {
        Usuario usuario  = usuarioRepository.findByUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
        return new ResponseEntity<>(rastreamentoRepository.getPedidosRastreamento(usuario.getCodigoRca()), HttpStatus.OK);
    }
}
