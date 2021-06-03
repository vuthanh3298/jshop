package com.mobileshop.model;

public class BookTableModel extends BookModel {
	private String name;// tên SP
	private String unit;// đơn vị tính
	private double price;// giá

	public BookTableModel() {
		super();
	}

	
	@Override
	public String toString() {
		return "ProductModel [" + "productName=" + name + ", unit=" + unit + ", price=" + price + "]";
	}

	

	public BookTableModel(String name, String unit, double price) {
		super();
		this.name = name;
		this.unit = unit;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
