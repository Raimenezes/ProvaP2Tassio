package br.com.uvass.backend.repository;

import br.com.uvass.backend.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProdutoRepository {
    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Produto> listarTodos(){
        return jdbcTemplate.query("select * from produto", new ProdutoMapper());
    }

}
