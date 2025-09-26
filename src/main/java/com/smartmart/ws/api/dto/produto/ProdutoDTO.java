package com.smartmart.ws.api.dto.produto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.smartmart.ws.api.entity.Categoria;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdutoDTO {
    private Long id;
    private Categoria categoria;
    private String sku; 
    private String nome;
    private BigDecimal preco;
    private BigDecimal custo;
    private Boolean ativo;
    private OffsetDateTime criadoEm;
}
