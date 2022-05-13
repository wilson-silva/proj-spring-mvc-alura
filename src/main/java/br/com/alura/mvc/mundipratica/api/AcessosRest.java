package br.com.alura.mvc.mundipratica.api;

import br.com.alura.mvc.mundipratica.interceptador.InterceptadorDeAcessos;
import br.com.alura.mvc.mundipratica.interceptador.InterceptadorDeAcessos.Acesso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("acessos")
public class AcessosRest {

    @GetMapping
    public List<Acesso> getAcessos(){
        return InterceptadorDeAcessos.acessos;
    }
}
