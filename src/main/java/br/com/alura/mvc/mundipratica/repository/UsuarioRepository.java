package br.com.alura.mvc.mundipratica.repository;

import br.com.alura.mvc.mundipratica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, String>{

   Usuario findByUsername(String username);

    void deleteByUsername(Usuario username);
}
