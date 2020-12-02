package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("/pagina")

	public class Controller {

			@GetMapping
			public String Aprendizado () {
				return " Fiz a Ultilização de Persitencia e Mentalidade de Crescimento ";
			}
		}


