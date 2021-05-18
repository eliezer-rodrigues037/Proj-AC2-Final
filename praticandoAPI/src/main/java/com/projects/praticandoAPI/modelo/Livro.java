package com.projects.praticandoAPI.modelo;

import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String autor;
	
	@ElementCollection(targetClass = Pagina.class, fetch = FetchType.EAGER)
	@Column
	@Enumerated(EnumType.STRING)
	private List<Pagina> paginas;


	public Livro() {
	}

	public Livro(String titulo, String autor) {
		this(titulo, autor, Collections.<Pagina>emptyList());
	}
	
	public Livro(String titulo, String autor, List<Pagina> paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutorl(String autor) {
		this.autor = autor;
	}

	public List<Pagina> getPaginas() {
		return paginas;
	}

	public void setRoles(List<Pagina> paginas) {
		this.paginas = paginas;
	}
}
