package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
public interface PermissaoRepository extends JpaRepository<Permissao, String> {
    Permissao findByNomePermissao(String permissao);
}

