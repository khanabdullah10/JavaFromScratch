package com.genZ_Shopping.gen_z_shopping.repository;


import com.genZ_Shopping.gen_z_shopping.model.Shipping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShippingRepository {
    private final JdbcTemplate jdbcTemplate;

    public ShippingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveShipping(Shipping shipping) {
        String sql = "INSERT INTO shipping (order_id, shipping_method) VALUES (?, ?)";
        jdbcTemplate.update(sql, shipping.getOrderId(), shipping.getShippingMethod());
    }

    public Shipping findByOrderId(String orderId) {
        String sql = "SELECT * FROM shipping WHERE order_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{orderId}, (rs, rowNum) -> {
            Shipping shipping = new Shipping();
            shipping.setId(rs.getInt("id"));
            shipping.setOrderId(rs.getString("order_id"));
            shipping.setShippingMethod(rs.getString("shipping_method"));
            return shipping;
        });
    }
}

