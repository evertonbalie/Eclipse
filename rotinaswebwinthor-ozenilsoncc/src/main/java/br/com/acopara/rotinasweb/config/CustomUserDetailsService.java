package br.com.acopara.rotinasweb.config;

import br.com.acopara.rotinasweb.model.Usuario;
import br.com.acopara.rotinasweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario u = usuarioRepository.findByUsuario(username);

        if (u == null){
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }
        return new User(u.getUsername(), u.getPassword(),u.isEnabled(),true,true,true,u.getAuthorities());
    }
}
