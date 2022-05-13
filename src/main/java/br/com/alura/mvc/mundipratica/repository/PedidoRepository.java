package br.com.alura.mvc.mundipratica.repository;

import br.com.alura.mvc.mundipratica.model.Pedido;
import br.com.alura.mvc.mundipratica.model.StatusPedido;
import br.com.alura.mvc.mundipratica.model.Usuario;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Cacheable("books")
    List<Pedido> findByStatus(StatusPedido status, Pageable sort);

    @Query("select p from Pedido p join p.usuario u where u.username = :username")
    List<Pedido> findByUsuario(@Param("username") String username);

    @Query("select p from Pedido p join p.usuario u where u.username = :username and p.status = :status")
    List<Pedido> findByStatusUsuario(@Param("status")StatusPedido status, @Param("username")String username);
}

