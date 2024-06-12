package com.Modelado.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Modelado.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class UsuarioRepositoryImp implements UsuarioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Usuario> obtenerUsuarios() {

		String query="from Usuario";
		return entityManager.createQuery(query).getResultList();
		
	}

}
