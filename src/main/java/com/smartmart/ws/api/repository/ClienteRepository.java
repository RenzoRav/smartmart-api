package com.smartmart.ws.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmart.ws.api.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
