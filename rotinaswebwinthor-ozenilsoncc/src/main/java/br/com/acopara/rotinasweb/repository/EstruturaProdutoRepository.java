package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Endereco;
import br.com.acopara.rotinasweb.model.EstruturaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface EstruturaProdutoRepository extends JpaRepository<EstruturaProduto, Long> {

}
