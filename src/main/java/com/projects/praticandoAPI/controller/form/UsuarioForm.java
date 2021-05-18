package com.projects.praticandoAPI.controller.form;

import java.util.List;

import com.projects.praticandoAPI.modelo.Curso;
import com.projects.praticandoAPI.modelo.Role;
import com.projects.praticandoAPI.modelo.Topico;
import com.projects.praticandoAPI.modelo.Usuario;
import com.projects.praticandoAPI.repository.CursoRepository;
import com.projects.praticandoAPI.repository.UsuarioRepository;
//import com.projects.praticandoAPI.util.PasswordEncoder;

public class UsuarioForm {
	
	private String nome;
	private String email;
	private String senha;
	private List<Role> roles;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Usuario converter(UsuarioRepository usuarioRepository) {
//		PasswordEncoder passwordEncoder = new PasswordEncoder();
//		return new Usuario(nome, email, passwordEncoder.encodePassword(senha), roles);
		return new Usuario(nome, email, senha, roles);
	}
}
