package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Loja;
import br.com.acopara.rotinasweb.model.Rastreamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false)
public interface RastreamentoRepository extends JpaRepository<Rastreamento, Long> {

    @Query(value = "select \n" +
            "p.numped pedido,\n" +
            "p.codcli,\n" +
            "c.cliente,\n" +
            "p.numcar carga,\n" +
            "case when p.data is not null then to_date(p.data || ' ' || p.hora || ':' || lpad(p.minuto,2,0),'DD/MM/YY HH24:MI') else null end HORAPEDIDO,\n" +
            "case when p.dtemissaomapa is not null then to_date(p.dtemissaomapa || ' ' || p.horaemissaomapa || ':' || lpad(p.minutoemissaomapa,2,0),'DD/MM/YY HH24:MI') else null end HORAEMISSAOMAPA,\n" +
            "case when p.dtfat is not null then to_date(p.dtfat || ' ' || p.horafat || ':' || lpad(p.minutofat,2,0),'DD/MM/YY HH24:MI') else null end HORAFATURAMENTO,\n" +
            "case when p.numcar is not null then (select max(f.T12_DATA_PREVISTA_ENTREGA) from fusiontrak_int_carga_ent f where f.t32_pedido_original = p.numped) else null end PREVENTREGA,\n" +
            "case when p.numcar is not null then (select max(f.t12_ordementrega) from fusiontrak_int_carga_ent f where f.t32_pedido_original = p.numped) else null end ORDEMENTREGA,\n" +
            "case when p.numcar is not null then (SELECT max(E.DATAHORA) from FUSIONTRAK_INT_EVENTOS E WHERE E.TIPO = 7 AND E.SEQ_PEDIDO_ERP  = P.NUMPED) else null end HORAENTREGA\n" +
            "from \n" +
            "    pcpedc p, pcclient c\n" +
            "where \n" +
            "1 = 1\n" +
            "and p.codcli = c.codcli\n" +
            "and p.posicao not in ('B', 'P')\n" +
            "and p.origemped in ('T')\n" +
            "and p.data between (SYSDATE - 7) and SYSDATE \n" +
            "and p.condvenda in (1, 8)\n" +
            "and p.codusur = :P_RCA\n" +
            "and p.codcli not in (1, 2)\n" +
            "ORDER BY PEDIDO DESC\n", nativeQuery = true)
    List<Rastreamento> getPedidosRastreamento(@Param("P_RCA") Long rca);
}
