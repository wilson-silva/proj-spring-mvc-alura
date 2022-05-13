package br.com.alura.mvc.mundipratica.interceptador;


import lombok.Data;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class InterceptadorDeAcessos implements HandlerInterceptor {

    public static List<Acesso> acessos = new ArrayList<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Acesso acesso = new Acesso();
        acesso.path = request.getRequestURI();
        acesso.data = LocalDateTime.now();

        request.setAttribute("acesso", acesso);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        Acesso acesso = (Acesso) request.getAttribute("acesso");
        acesso.duracao = Duration.between(acesso.data, LocalDateTime.now());
        acessos.add(acesso);

    }

    @Data
    public class Acesso {
        private String path;
        private LocalDateTime data;
        private Duration duracao;

    }
}
