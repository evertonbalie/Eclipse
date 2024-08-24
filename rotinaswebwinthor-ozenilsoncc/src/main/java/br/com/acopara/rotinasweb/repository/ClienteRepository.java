package br.com.acopara.rotinasweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.acopara.rotinasweb.model.Cliente;

@Transactional(readOnly = false)
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByCpfCnpj(String cpf);
}
