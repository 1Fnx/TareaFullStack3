package com.serviciousuarios.service;

import com.serviciousuarios.model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Usuario obtenerUsuarioPorId(Long id);
    Usuario crearUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}