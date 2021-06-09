package com.mobileshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartModel {
	private int cartId;
	private String productId;
	private String userId;
	private int amount;
}
