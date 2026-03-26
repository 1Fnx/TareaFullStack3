package com.serviciousuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.serviciousuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}