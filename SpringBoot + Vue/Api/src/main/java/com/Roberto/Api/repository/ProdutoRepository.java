package com.Roberto.Api.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Roberto.Api.models.Categoria;
import com.Roberto.Api.models.Produtos;
import com.Roberto.Api.models.Status;


public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
	
//	//Buscar um produto pelo id
//	Produtos findById(long id);
	
//Buscar um produto pelo nome
	
	Produtos findByNome(String nome);

    List<Categoria>ListarCateg = Arrays.asList(Categoria.values());
    
    List<Status>Listarstatus = Arrays.asList(Status.values());

	
	


}
