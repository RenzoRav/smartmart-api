package com.smartmart.ws.api.dto.movimento;

import java.time.OffsetDateTime;

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
public class MovimentoEstoqueDTO {
    private Long id;
    private Produto produto;
    private Integer quantidade;
    private com.smartmart.ws.api.enums.TipoMovimento tipo;
    private com.smartmart.ws.api.enums.TipoMotivo motivo;
    private Pedido pedidoRef;
    private OffsetDateTime criadoEm;
}
