package br.com.alura.mvc.mundipratica.api;


import br.com.alura.mvc.mundipratica.model.Pedido;
import br.com.alura.mvc.mundipratica.model.StatusPedido;
import br.com.alura.mvc.mundipratica.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosRest {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("aguardando")
    public List<Pedido> getPedidosAguardandoOfertas(){

        Sort sort  = Sort.by("id").descending();
        PageRequest paginacao = PageRequest.of(0, 10, sort);

        return pedidoService.listarPedidoStatus(StatusPedido.AGUARDANDO, paginacao);

    }
}
