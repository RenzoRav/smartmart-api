package com.smartmart.ws.api.dto.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String criadoEm;
    private String endereco;
}
