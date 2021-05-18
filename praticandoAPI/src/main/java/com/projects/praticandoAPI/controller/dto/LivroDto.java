package com.projects.praticandoAPI.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.modelo.Pagina;

public class LivroDto {
	private Long id;
	private String titulo;
	private String autor;
	List<Pagina> paginas;
	
	
	public LivroDto(Livro livro) {
		super();
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.autor = livro.getAutor();
		this.paginas = livro.getPaginas();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public List<Pagina> getPaginas() {
		return paginas;
	}

	public static List<LivroDto> converter(List<Livro> usuarios) {
		return usuarios.stream().map(LivroDto::new).collect(Collectors.toList());
	}
}
