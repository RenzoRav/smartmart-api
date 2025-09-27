package com.smartmart.ws.api.service;

import com.smartmart.ws.api.dto.cliente.ClienteDTO;
import com.smartmart.ws.api.entity.Cliente;
import com.smartmart.ws.api.repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository repo;

    @Transactional(readOnly = true)
    public List<ClienteDTO> listarTodos() {
        return ClienteDTO.fromEntity(repo.findAll());
    }

    @Transactional(readOnly = true)
    public ClienteDTO buscarPorId(Long id) {
        Cliente c = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado: " + id));
        return ClienteDTO.fromEntity(c);
    }

    @Transactional
    public ClienteDTO criar(ClienteDTO dto) {
        if (dto.getEmail() != null && repo.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado.");
        }
        Cliente novo = dto.toEntity();
        Cliente salvo = repo.save(novo);
        return ClienteDTO.fromEntity(salvo);
    }

    @Transactional
    public ClienteDTO atualizar(Long id, ClienteDTO dto) {
        Cliente existente = repo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado: " + id));

        if (dto.getEmail() != null && !dto.getEmail().equals(existente.getEmail())
                && repo.existsByEmail(dto.getEmail())) {
            throw new IllegalArgumentException("Email já cadastrado.");
        }

        dto.apply(existente);
        Cliente salvo = repo.save(existente);
        return ClienteDTO.fromEntity(salvo);
    }

    @Transactional
    public void excluir(Long id) {
        if (!repo.existsById(id)) {
            throw new EntityNotFoundException("Cliente não encontrado: " + id);
        }
        repo.deleteById(id);
    }
}
