package com.genZ_Shopping.gen_z_shopping.repository;

import com.genZ_Shopping.gen_z_shopping.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Save an order into the database
    public void saveOrder(Order order) {
        // Ensure the orderDate is not null; if it is, set it to the current timestamp
        if (order.getOrderDate() == null) {
            order.setOrderDate(LocalDateTime.now());
        }

        String sql = "INSERT INTO orders (order_id, total_amount, order_date) VALUES (?, ?, ?)";

        try {
            // Ensure the parameters match the expected types for the SQL query
            jdbcTemplate.update(sql,
                    order.getOrderId(),           // UUID as String
                    order.getTotalAmount(),       // Double (total amount)
                    Timestamp.valueOf(order.getOrderDate()) // LocalDateTime converted to Timestamp
            );
        } catch (Exception e) {
            System.err.println("Error inserting order: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to save order: " + e.getMessage());
        }
    }




    // Get all orders from the database
    public List<Order> getAllOrders() {
        String sql = "SELECT * FROM orders";

        return jdbcTemplate.query(sql, new RowMapper<Order>() {
            @Override
            public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
                Order order = new Order();

                // Correctly handle UUID for order_id
                String orderIdString = rs.getString("order_id"); // assuming your column name is order_id
                if (orderIdString != null) {
                    order.setOrderId(String.valueOf(UUID.fromString(orderIdString))); // Convert the string to UUID
                }

                // Safely map other fields
                order.setTotalAmount(rs.getDouble("total_amount"));

                // Safely map Timestamp to LocalDateTime
                Timestamp timestamp = rs.getTimestamp("order_date");
                order.setOrderDate(toLocalDateTimeOrNull(timestamp));

                return order;
            }
        });
    }

    // Helper method to safely convert Timestamp to LocalDateTime
    private LocalDateTime toLocalDateTimeOrNull(Timestamp timestamp) {
        return timestamp != null ? timestamp.toLocalDateTime() : null;
    }


//    public void save(Order order) {
//        String sql = "INSERT INTO orders (order_id, total_amount, order_date) VALUES (?, ?, ?)";
//        jdbcTemplate.update(sql, order.getOrderId(), order.getTotalAmount(), order.getOrderDate());
//    }

}
