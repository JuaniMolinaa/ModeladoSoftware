package com.Modelado.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Modelado.models.Usuario;
import com.Modelado.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	/*@RequestMapping(value="mensaje")
	public String mensaje() {

		return "hola mundo";
	}

	/*@RequestMapping(value="persona")
	public List<String> listarPersonas(){

		return List.of("Diego","Juan","Jose");
	}*/
	/*
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {

		Usuario usuario = new Usuario();
		usuario.setNombre("Juan");
		usuario.setApellido("Molina");
		usuario.setEmail("nijua145@gmail.com");
		usuario.setTelefono("2616608388");

		return usuario;

	}

	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id){

		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Juan");
		usuario.setApellido("Molina");
		usuario.setEmail("nijua145@gmail.com");
		usuario.setTelefono("2616608388");

		return usuario;
	}
	 */
	@RequestMapping(value="usuario/lista_user")
	public List<Usuario> listar_variosUsuarios(){

		List<Usuario> usuarios=new ArrayList<>();

		Usuario usuario1 = new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Juan");
		usuario1.setApellido("Molina");
		usuario1.setEmail("nijua145@gmail.com");
		usuario1.setTelefono("2616608388");

		Usuario usuario2 = new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Pedro");
		usuario2.setApellido("Martinez");
		usuario2.setEmail("pedmart@gmail.com");
		usuario2.setTelefono("2616673011");

		usuarios.add(usuario1);
		usuarios.add(usuario2);

		//metodo coleccion devuelve coleccion
		return usuarios;
	}

	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> user=usuarioRepository.obtenerUsuarios();

		return user;
	}


}
