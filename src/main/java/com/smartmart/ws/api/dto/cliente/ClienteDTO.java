package com.smartmart.ws.api.dto.cliente;

import com.smartmart.ws.api.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String criadoEm;
    private String endereco;

    public static ClienteDTO fromEntity(Cliente entity) {
        if (entity == null) return null;
        return new ClienteDTO(
                entity.getId(),
                entity.getNome(),
                entity.getEmail(),
                entity.getTelefone(),
                entity.getCriadoEm(),
                entity.getEndereco()
        );
    }

    public static List<ClienteDTO> fromEntity(List<Cliente> entities) {
        return entities.stream()
                .map(ClienteDTO::fromEntity)
                .collect(Collectors.toList());
    }

    public Cliente toEntity() {
        Cliente entity = new Cliente();
        entity.setId(this.id);
        entity.setNome(this.nome);
        entity.setEmail(this.email);
        entity.setTelefone(this.telefone);
        entity.setEndereco(this.endereco);
        return entity;
    }

    public void apply(Cliente entity) {
        if (this.nome != null) entity.setNome(this.nome);
        if (this.email != null) entity.setEmail(this.email);
        if (this.telefone != null) entity.setTelefone(this.telefone);
        if (this.endereco != null) entity.setEndereco(this.endereco);
    }
}
