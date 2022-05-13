package br.com.alura.mvc.mundipratica.service;

import br.com.alura.mvc.mundipratica.model.Pedido;
import br.com.alura.mvc.mundipratica.model.StatusPedido;
import br.com.alura.mvc.mundipratica.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedido(){
        return pedidoRepository.findAll();
    }

    public Pedido obterPedido(Long id) throws Exception{
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        if(pedido.isEmpty()){
            throw new Exception("Pedido não encontrado!");
        }
        return pedido.get();
    }

    public List<Pedido> listarPedidoStatus(StatusPedido status, PageRequest sort){
        return pedidoRepository.findByStatus(status, sort);
    }

    public void excluirPedido(Long id){
        pedidoRepository.deleteById(id);
    }


    public List<Pedido> listarPedidoUsuario(String usuario) {
        return pedidoRepository.findByUsuario(usuario);
    }

    public List<Pedido> listarPedidoStatusEUsuario(StatusPedido status, String usuario) {
        return pedidoRepository.findByStatusUsuario(status, usuario);
    }
}
