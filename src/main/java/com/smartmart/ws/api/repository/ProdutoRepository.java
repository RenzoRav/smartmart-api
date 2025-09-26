package com.smartmart.ws.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmart.ws.api.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
