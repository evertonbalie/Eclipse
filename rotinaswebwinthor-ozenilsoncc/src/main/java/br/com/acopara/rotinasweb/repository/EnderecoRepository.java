package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query(value = "SELECT NVL((MAX(TO_NUMBER(CODENDENTCLI)) + 1), 1) VALOR FROM PCCLIENTENDENT", nativeQuery = true)
    Long proximoCodigoEndereco();

    @Query(value = "SELECT NVL((MAX(TO_NUMBER(CODSEQEND)) + 1), 1) VALOR FROM PCCLIENTENDENT WHERE CODCLI = ?1", nativeQuery = true)
    Long proximaSequenciaEndereco(Long cliente);

    List<Endereco> findAllByCodigoCliente(Long codigo);

}
