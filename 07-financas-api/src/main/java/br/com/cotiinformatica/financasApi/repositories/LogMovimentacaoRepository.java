package br.com.cotiinformatica.financasApi.repositories;

import br.com.cotiinformatica.financasApi.documents.LogMovimentacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LogMovimentacaoRepository extends MongoRepository<LogMovimentacao, UUID> {
}
