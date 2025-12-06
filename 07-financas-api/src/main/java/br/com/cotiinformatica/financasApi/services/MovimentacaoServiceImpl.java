package br.com.cotiinformatica.financasApi.services;

import br.com.cotiinformatica.financasApi.interfaces.MovimentacaoService;
import br.com.cotiinformatica.financasApi.repositories.CategoriaRepository;
import br.com.cotiinformatica.financasApi.repositories.LogMovimentacaoRepository;
import br.com.cotiinformatica.financasApi.repositories.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoServiceImpl implements MovimentacaoService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private LogMovimentacaoRepository logMovimentacaoRepository;
}
