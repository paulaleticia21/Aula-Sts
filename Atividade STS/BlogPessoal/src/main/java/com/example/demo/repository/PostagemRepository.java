package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.postagem.PostagemTable;



public interface PostagemRepository extends JpaRepository<PostagemTable ,  Long >  {


	public List<PostagemTable> findAllBynomeContainingIgnoreCase (String Titulo);
}
