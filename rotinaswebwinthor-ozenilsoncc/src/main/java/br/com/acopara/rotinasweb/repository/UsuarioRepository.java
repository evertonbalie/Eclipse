package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Usuario findByUsuario (String usuario);

    @Modifying
    @Query(value = "UPDATE TIUSUARIO SET SENHA = :P_PASS WHERE USUARIO = :P_USER" , nativeQuery = true)
    int updatePasswordById(@Param("P_USER") String user, @Param("P_PASS") String pass);

    @Modifying
    @Query(value = "UPDATE TIUSUARIO SET ATIVO = :P_ATIVO WHERE USUARIO = :P_USER" , nativeQuery = true)
    int ativarInativarUsuario(@Param("P_USER") String user, @Param("P_ATIVO") Boolean param);
}
