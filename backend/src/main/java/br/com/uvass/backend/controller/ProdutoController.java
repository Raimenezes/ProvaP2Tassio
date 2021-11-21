package br.com.uvass.backend.controller;

import br.com.uvass.backend.model.entity.Produto;
import br.com.uvass.backend.repository.ProdutoRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/%22")
@RestController
@RequestMapping ("/produto")

public class ProdutoController {

        private br.com.uvass.backend.repository.ProdutoRepository ProdutoRepository;

        public ProdutoController(JdbcTemplate jdbcTemplate){
        ProdutoRepository = new ProdutoRepository(jdbcTemplate);
        }

@GetMapping
public List<Produto> listarTodos(){
        return ProdutoRepository.listarTodos();
        }


}