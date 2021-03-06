package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




@RestController
@RequestMapping("/pagina")
public class Controller implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}

		@Autowired //injeção
		private ManutencaoRepository repository;
		
		@PostMapping("/manutencoes")
		public ManutencaoTable criar(@RequestBody ManutencaoTable objetinho) {
			repository.save(objetinho);
			return objetinho;
			
		}
			
			@GetMapping("manutencoes/{id}")
			public Optional <ManutencaoTable>encontraUm(@PathVariable Long id){
				return repository.findById(id);
				
			}
			@GetMapping("/manutencoes")
			public List<ManutencaoTable>PesquisarTodos(){
			
				return repository.findAll();
		}

		
}
