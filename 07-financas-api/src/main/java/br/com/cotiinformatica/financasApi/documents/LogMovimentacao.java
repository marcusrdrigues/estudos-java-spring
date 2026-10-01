package br.com.cotiinformatica.financasApi.documents;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "log_movimentacoes")
@Data
public class LogMovimentacao {

    @Id
    private UUID id;
    private LocalDateTime dateHora;
    private String tipoOperacao;
    private UUID movimentacaoId;
    private UUID usuarioId;
    private String detalhes;
}
