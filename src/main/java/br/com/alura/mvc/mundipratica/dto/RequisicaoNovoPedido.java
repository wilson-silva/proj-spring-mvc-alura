package br.com.alura.mvc.mundipratica.dto;

import br.com.alura.mvc.mundipratica.model.Pedido;
import br.com.alura.mvc.mundipratica.model.StatusPedido;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class RequisicaoNovoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;

    private String descricao;


    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setUrlProduto(urlProduto);
        pedido.setStatus(StatusPedido.AGUARDANDO);
        return pedido;
    }


}
