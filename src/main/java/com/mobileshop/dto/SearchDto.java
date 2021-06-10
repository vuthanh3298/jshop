package com.mobileshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDto {
	private int manufacturer;
	private long minPrice;
	private long maxPrice;
	private String condition;
}
