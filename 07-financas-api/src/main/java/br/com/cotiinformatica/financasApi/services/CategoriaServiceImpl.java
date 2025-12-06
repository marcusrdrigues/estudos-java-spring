package br.com.cotiinformatica.financasApi.services;

import br.com.cotiinformatica.financasApi.interfaces.CategoriaService;
import br.com.cotiinformatica.financasApi.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
}
