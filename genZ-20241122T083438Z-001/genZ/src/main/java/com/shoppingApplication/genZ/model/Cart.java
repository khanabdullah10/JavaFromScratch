package com.shoppingApplication.genZ.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Cart {
    private int id;
    @NotNull
    private String  email;
    @NotNull
    private int productId;
    @NotNull
    @Min(1)
    private Integer quantity;
}
