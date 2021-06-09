package com.mobileshop.model;

public class BookTableModel extends BookModel {
	private String name;
	private String unit;

	public BookTableModel() {
		super();
	}

	@Override
	public String toString() {
		return "ProductModel [" + "productName=" + name + ", unit=" + unit + "]";
	}

	

	public BookTableModel(String name, String unit) {
		super();
		this.name = name;
		this.unit = unit;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
