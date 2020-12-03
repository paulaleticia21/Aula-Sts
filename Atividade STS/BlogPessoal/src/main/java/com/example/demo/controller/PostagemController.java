package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.postagem.PostagemTable;
import com.example.demo.repository.PostagemRepository;

@RestController
@RequestMapping("/postagem")

public class PostagemController {

	@Autowired
	public PostagemRepository repository;

	@GetMapping("/getAll")
	public List<PostagemTable> pesquisarTodos() {
		return repository.findAll();

	}

	@GetMapping("/getById/{id}")
	public Optional<PostagemTable> GetById(@PathVariable Long id) {
		return repository.findById(id);

	}

	@PostMapping
	public ResponseEntity<PostagemTable> post(@RequestBody PostagemTable postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}

	@PutMapping
	public ResponseEntity<PostagemTable> put(@RequestBody PostagemTable postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
		@GetMapping("/titulo/{titulo}")  
		
		public ResponseEntity<List<PostagemTable>> GetByTitulo(@PathVariable String Titulo){            
			return ResponseEntity.ok(repository.findAllBynomeContainingIgnoreCase(Titulo)
					
					);  
			
}	
		
		
	
		
		
	}


