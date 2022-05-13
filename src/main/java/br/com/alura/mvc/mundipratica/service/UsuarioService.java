package br.com.alura.mvc.mundipratica.service;


import br.com.alura.mvc.mundipratica.model.Usuario;
import br.com.alura.mvc.mundipratica.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario obterUsuario(String username){
        return usuarioRepository.findByUsername(username);
    }


    public void excluirUsuario(Usuario username){
        usuarioRepository.deleteByUsername(username);
    }


}
