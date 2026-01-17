package com.github.henriqueaguiar_dev.produtosapi.repository;

import com.github.henriqueaguiar_dev.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
