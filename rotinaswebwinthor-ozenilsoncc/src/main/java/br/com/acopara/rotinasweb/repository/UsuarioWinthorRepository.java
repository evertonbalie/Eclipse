package br.com.acopara.rotinasweb.repository;

import br.com.acopara.rotinasweb.model.UsuarioWinthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = false)
public interface UsuarioWinthorRepository extends JpaRepository<UsuarioWinthor, Long> {
    UsuarioWinthor getByUsuario(String usuario);
}
