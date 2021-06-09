package com.mobileshop.dto;

import lombok.Data;

@Data
public class OrderCartDto {
	private String name;
	private String address;
	private String paymentMethod;
	private String phone;
	private String note;
	
	private String cartIds;
}
