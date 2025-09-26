package com.smartmart.ws.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmart.ws.api.entity.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
