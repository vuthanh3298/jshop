package com.mobileshop.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BookTableModel extends BookModel {
	private String name;
	private String unit;
	private String username;
}
