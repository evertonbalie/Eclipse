package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Loja;
import br.com.acopara.rotinasweb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface LojaRepository extends JpaRepository<Loja, Long> {

    List<Loja> findByPosicao(String posicao);
}
