package com.Modelado.repository;

import java.util.List;

import com.Modelado.models.Usuario;

import jakarta.transaction.Transactional;
@Transactional
public interface UsuarioRepository {
	
	List<Usuario> obtenerUsuarios();

}
