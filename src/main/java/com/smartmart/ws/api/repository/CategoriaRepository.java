package com.smartmart.ws.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmart.ws.api.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
