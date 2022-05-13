package br.com.alura.mvc.mundipratica.controller;


import br.com.alura.mvc.mundipratica.dto.RequisicaoNovoPedido;
import br.com.alura.mvc.mundipratica.model.Pedido;
import br.com.alura.mvc.mundipratica.model.Usuario;
import br.com.alura.mvc.mundipratica.service.PedidoService;
import br.com.alura.mvc.mundipratica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovoPedido requisicao){
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
        if (result.hasErrors()){
            return "pedido/formulario";
        }

        String username = SecurityContextHolder.getContext().getAuthentication().getName();

        Pedido pedido = requisicao.toPedido();
        Usuario usuario = usuarioService.obterUsuario(username);
        pedido.setUsuario(usuario);
        pedidoService.salvarPedido(pedido);
        return "redirect:/home";

    }

}
