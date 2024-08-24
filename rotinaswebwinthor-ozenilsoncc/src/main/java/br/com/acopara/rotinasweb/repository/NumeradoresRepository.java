package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Numeradores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
public interface NumeradoresRepository extends JpaRepository<Numeradores, Long> {

    @Query(value = "SELECT C.PROXNUMCLI FROM PCCONSUM C", nativeQuery = true)
    Long getCodigoCliente();

    @Modifying
    @Query(value = "UPDATE PCCONSUM C SET C.PROXNUMCLI = :P_CODCLI", nativeQuery = true)
    int updateProximoNumeroCliente(@Param("P_CODCLI") Long cliente);
}
