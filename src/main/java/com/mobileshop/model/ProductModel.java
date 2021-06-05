package com.mobileshop.model;

public class ProductModel {
	
	private String productId;
	private String name;
	private String type;
	private String manufacturer;
	private int unit;
	private String warrantyPeriod;
	private int inventory;
	private String described;
	private double price;
	
	public ProductModel() {
		super();
	}

	public ProductModel(String productId, String name, String type, String manufacturer, int unit,
			String warrantyPeriod, int inventory, String described, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.type = type;
		this.manufacturer = manufacturer;
		this.unit = unit;
		this.warrantyPeriod = warrantyPeriod;
		this.inventory = inventory;
		this.described = described;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductModel ["
				+ "productId=" + productId 
				+ ", name=" + name 
				+ ", type=" + type 
				+ ", manufacturer=" + manufacturer 
				+ ", unit=" + unit 
				+ ", warrantyPeriod=" + warrantyPeriod 
				+ ", inventory=" + inventory 
				+ ", described=" + described 
				+ ", price=" + price 
				+"]";
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public String getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(String warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getDescribed() {
		return described;
	}

	public void setDescribed(String described) {
		this.described = described;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
