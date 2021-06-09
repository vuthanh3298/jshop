package com.mobileshop.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {
	private String productId;
	private String userId;
	private Timestamp time;
	private Integer amount;
	private long price;
	private long total;
	private String address;
	private String paymentMethods;
	private String note;
	private String phone;
}
