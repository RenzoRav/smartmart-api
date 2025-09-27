package com.smartmart.ws.api.dto.movimento;

import java.time.OffsetDateTime;

import com.smartmart.ws.api.entity.Pedido;
import com.smartmart.ws.api.entity.Produto;
import com.smartmart.ws.api.entity.enums.TipoMotivo;
import com.smartmart.ws.api.entity.enums.TipoMovimento;

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
    private TipoMovimento tipo;
    private TipoMotivo motivo;
    private Pedido pedidoRef;
    private OffsetDateTime criadoEm;
}
