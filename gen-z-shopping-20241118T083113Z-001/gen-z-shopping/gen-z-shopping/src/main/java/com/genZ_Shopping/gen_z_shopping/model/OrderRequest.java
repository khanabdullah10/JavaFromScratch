package com.genZ_Shopping.gen_z_shopping.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data@AllArgsConstructor@NoArgsConstructor
public class OrderRequest {
    @NotEmpty(message = "Cart items cannot be empty.")
    private List<CartItemRequest> cartItems;

    @NotNull(message = "Shipping method cannot be null.")
    private String shippingMethod;
}
