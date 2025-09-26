package com.smartmart.ws.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmart.ws.api.entity.MovimentoEstoque;


public interface MovimentoRepository extends JpaRepository<MovimentoEstoque, Long> {

}
