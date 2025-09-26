package com.smartmart.ws.api.dto.pedido;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.smartmart.ws.api.entity.Cliente;
import com.smartmart.ws.api.entity.enums.TipoStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PedidoDTO {
    private Long id;
    private Cliente cliente;
    private TipoStatus status;
    private BigDecimal valorTotal;
    private OffsetDateTime criadoEm;
}
