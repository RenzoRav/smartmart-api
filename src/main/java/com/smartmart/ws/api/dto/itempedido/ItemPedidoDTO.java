package com.smartmart.ws.api.dto.itempedido;

import java.math.BigDecimal;

import com.smartmart.ws.api.entity.Pedido;
import com.smartmart.ws.api.entity.Produto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemPedidoDTO {
    private Long id;
    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
}
