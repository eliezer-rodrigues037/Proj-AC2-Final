package com.projects.praticandoAPI.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projects.praticandoAPI.controller.dto.LivroDto;
import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.repository.LivroRepository;

@RestController

@RequestMapping("/livros")
public class LivroController {
	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping
	public List<LivroDto> listarLivros() {
		List<Livro> livros = livroRepository.findAll();
		
		livros.add(new Livro("Livro Teste", "Autor Teste"));
		
		return LivroDto.converter(livros);
	}
}
