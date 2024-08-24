package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    List<Cidade> findAllByUf(String uf);
 }
