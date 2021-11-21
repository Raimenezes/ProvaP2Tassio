package br.com.uvass.backend.repository;

import br.com.uvass.backend.model.entity.Produto;


import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {
        Produto product = new Produto();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getNString("name"));
        product.setImage(resultSet.getNString("image"));
        product.setOldPrice(resultSet.getFloat("old_price"));
        product.setPrice(resultSet.getFloat("price"));
        product.setDescription(resultSet.getNString("description"));
        return product;
    }
}
