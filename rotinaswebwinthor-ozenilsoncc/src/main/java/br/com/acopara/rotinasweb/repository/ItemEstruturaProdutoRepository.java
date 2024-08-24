package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.EstruturaProduto;
import br.com.acopara.rotinasweb.model.ItemEstruturaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface ItemEstruturaProdutoRepository extends JpaRepository<ItemEstruturaProduto, Long> {

    List<ItemEstruturaProduto> findAllByCodigoEstruturaProduto(Long codigo);
}
