package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Loja;
import br.com.acopara.rotinasweb.model.RcaCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface RcaClienteRepository extends JpaRepository<RcaCliente, Long> {
    List<RcaCliente> findAllByRca(Long rca);
    List<RcaCliente> findAllByCliente(Long cliente);
}
