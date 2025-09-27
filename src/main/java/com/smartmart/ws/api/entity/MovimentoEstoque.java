package com.smartmart.ws.api.entity;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.smartmart.ws.api.entity.enums.TipoMotivo;
import com.smartmart.ws.api.entity.enums.TipoMovimento;
import com.smartmart.ws.api.entity.enums.types.TipoMotivoType;
import com.smartmart.ws.api.entity.enums.types.TipoMovimentoType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movimento_estoque")
public class MovimentoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    private Integer quantidade;

    @Type(value = TipoMovimentoType.class)
    private TipoMovimento tipo;

    @Type(value = TipoMotivoType.class)
    private TipoMotivo motivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_ref")
    private Pedido pedidoRef;

    @Column(name = "criado_em", updatable = false, insertable = false)
    private OffsetDateTime criadoEm;
}