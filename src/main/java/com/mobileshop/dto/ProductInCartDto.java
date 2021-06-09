package com.mobileshop.dto;

import com.mobileshop.model.ProductModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductInCartDto extends ProductModel {
	private int amount;
	private long prices;
	private int cartId;
}
