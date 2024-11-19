package com.genZ_Shopping.gen_z_shopping.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemRequest {
    @NotNull(message = "Product ID cannot be null.")
    private Integer productId;
    @Min(value = 1, message = "Quantity must be at least 1.")
    private int quantity;

}
