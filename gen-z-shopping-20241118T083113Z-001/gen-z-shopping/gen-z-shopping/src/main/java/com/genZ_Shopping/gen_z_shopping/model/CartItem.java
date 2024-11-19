package com.genZ_Shopping.gen_z_shopping.model;

import lombok.Data;

@Data
public class CartItem {
    private int id;
    private int productId;
    private int quantity;
}

