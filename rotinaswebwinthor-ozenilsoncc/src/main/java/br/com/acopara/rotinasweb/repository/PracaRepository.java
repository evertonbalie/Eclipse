package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Praca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface PracaRepository extends JpaRepository<Praca, Long> {

    List<Praca> findAllBySituacaoOrderById(String situacao);
}
