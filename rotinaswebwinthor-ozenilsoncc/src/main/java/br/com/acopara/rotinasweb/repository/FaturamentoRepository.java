package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.endpoint.FaturamentoEndpoint;
import br.com.acopara.rotinasweb.model.FaturamentoDozeMeses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface FaturamentoRepository extends JpaRepository<FaturamentoDozeMeses, Long> {

    @Query(value = "SELECT MES || '/' || ANO MES, ROUND(SUM(VALOR),2) VALOR FROM (\n" +
            "    SELECT\n" +
            "    TO_CHAR(PCPEDC.DATA, 'YY') ANO, \n" +
            "    SUBSTR(TO_CHAR(PCPEDC.DATA, 'fmMonth','NLS_DATE_LANGUAGE=PORTUGUESE'), 1,3) MES,\n" +
            "    TO_CHAR(PCPEDC.DATA, 'MM') SEQMES,\n" +
            "    DECODE(PCPEDC.CONDVENDA,5, 0 ,6, 0, 11, 0, 12, 0 ,PCPEDC.VLATEND  ) VALOR\n" +
            "    FROM  PCSUPERV, PCUSUARI, PCPLPAG, PCPEDC, PCFILIAL \n" +
            "    WHERE PCPEDC.CODPLPAG = PCPLPAG.CODPLPAG \n" +
            "    AND PCPEDC.CODUSUR = PCUSUARI.CODUSUR \n" +
            "    AND PCPEDC.CODSUPERVISOR = PCSUPERV.CODSUPERVISOR(+) \n" +
            "    AND PCPEDC.CONDVENDA IN (1, 2, 3, 7, 9, 14, 15, 17, 18, 19, 98) \n" +
            "    AND PCPEDC.DTCANCEL IS NULL \n" +
            "    AND PCPEDC.DATA BETWEEN  trunc(ADD_MONTHS(TO_char(sysdate,'DD/MM/YYYY'), -11),'MON') AND ADD_MONTHS(LAST_DAY(TO_char(sysdate,'DD/MM/YYYY')),0) \n" +
            "    AND PCPEDC.CODUSUR = :P_RCA\n" +
            "    AND PCFILIAL.CODIGO = PCPEDC.CODFILIAL)\n" +
            "GROUP BY ANO, SEQMES, MES\n" +
            "ORDER BY ANO, SEQMES", nativeQuery = true)
    List<FaturamentoDozeMeses> getFaturamentoDozeMeses(@Param("P_RCA") Long rca);

    @Query(value = "SELECT MES || '/' || ANO MES, ROUND(SUM(VALOR),2) VALOR FROM (\n" +
            "    SELECT\n" +
            "    TO_CHAR(PCPEDC.DATA, 'YY') ANO, \n" +
            "    SUBSTR(TO_CHAR(PCPEDC.DATA, 'fmMonth','NLS_DATE_LANGUAGE=PORTUGUESE'), 1,3) MES,\n" +
            "    TO_CHAR(PCPEDC.DATA, 'MM') SEQMES,\n" +
            "    DECODE(PCPEDC.CONDVENDA,5, 0 ,6, 0, 11, 0, 12, 0 ,PCPEDC.VLATEND  ) VALOR\n" +
            "    FROM  PCSUPERV, PCUSUARI, PCPLPAG, PCPEDC, PCFILIAL \n" +
            "    WHERE PCPEDC.CODPLPAG = PCPLPAG.CODPLPAG \n" +
            "    AND PCPEDC.CODUSUR = PCUSUARI.CODUSUR \n" +
            "    AND PCPEDC.CODSUPERVISOR = PCSUPERV.CODSUPERVISOR(+) \n" +
            "    AND PCPEDC.CONDVENDA IN (1, 2, 3, 7, 9, 14, 15, 17, 18, 19, 98) \n" +
            "    AND PCPEDC.DTCANCEL IS NULL \n" +
            "    AND PCPEDC.DATA BETWEEN  trunc(ADD_MONTHS(TO_char(sysdate,'DD/MM/YYYY'), -11),'MON') AND ADD_MONTHS(LAST_DAY(TO_char(sysdate,'DD/MM/YYYY')),0) \n" +
            "    AND PCPEDC.CODSUPERVISOR = :P_SUPERV\n" +
            "    AND PCFILIAL.CODIGO = PCPEDC.CODFILIAL)\n" +
            "GROUP BY ANO, SEQMES, MES\n" +
            "ORDER BY ANO, SEQMES", nativeQuery = true)
    List<FaturamentoDozeMeses> getFaturamentoDozeMesesSupervisor(@Param("P_SUPERV") Long loja);
}
