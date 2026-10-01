package br.com.cotiinformatica.financasApi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Categorias")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "usuario_id", nullable = false)
    private UUID usuarioId;

    @OneToMany(mappedBy = "categoria")
    private List<Movimentacao> movimentacoes;
}
