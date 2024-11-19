package com.genZ_Shopping.gen_z_shopping.repository;
import com.genZ_Shopping.gen_z_shopping.model.CartItem;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartRepository {
    private final JdbcTemplate jdbcTemplate;

    public CartRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addItemToCart(CartItem cartItem) {
        String sql = "INSERT INTO cart (product_id, quantity) VALUES (?, ?)";
        jdbcTemplate.update(sql, cartItem.getProductId(), cartItem.getQuantity());
    }

    public List<CartItem> getAllCartItems() {
        String sql = "SELECT * FROM cart";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            CartItem cartItem = new CartItem();
            cartItem.setId(rs.getInt("id"));
            cartItem.setProductId(rs.getInt("product_id"));
            cartItem.setQuantity(rs.getInt("quantity"));
            return cartItem;
        });
    }

    public void clearCart() {
        String sql = "DELETE FROM cart";
        jdbcTemplate.update(sql);
    }
}

