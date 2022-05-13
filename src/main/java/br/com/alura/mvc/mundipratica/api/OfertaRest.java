package br.com.alura.mvc.mundipratica.api;

import br.com.alura.mvc.mundipratica.dto.RequisicaoNovaOferta;
import br.com.alura.mvc.mundipratica.model.Oferta;
import br.com.alura.mvc.mundipratica.model.Pedido;
import br.com.alura.mvc.mundipratica.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("api/ofertas")
public class OfertaRest {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Oferta criaOferta(@Valid @RequestBody RequisicaoNovaOferta requisicao) throws Exception {

        Optional<Pedido> pedidoBuscado = Optional.ofNullable(pedidoService.obterPedido(requisicao.getPedidoId()));
        if (!pedidoBuscado.isPresent()) {
            return null;
        }

        Pedido pedido = pedidoBuscado.get();
        Oferta nova = requisicao.toOferta();
        nova.setPedido(pedido);
        pedido.getOfertas().add(nova);
        pedidoService.salvarPedido(pedido);

        return nova;
    }
}
