package com.mobileshop.model;

import java.sql.Timestamp;

public class BookModel {
	private String productId;// mã hàng
	private String userId;// mã người đặt
	private Timestamp time;// thời gian đặt hàng
	private Integer amount;// số lượng
	private String address;// địa chỉ giao hàng
	private String paymentMethods;// Phương thức thanh toán
	private String note;// ghi chú

	public BookModel() {
		super();
	}

	public BookModel(String productId, String userId, Timestamp time, Integer amount, String address,
			String paymentMethods, String note) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.time = time;
		this.amount = amount;
		this.address = address;
		this.paymentMethods = paymentMethods;
		this.note = note;
	}

	@Override
	public String toString() {
		return "ProductModel [" + "productId=" + productId + ", userId=" + userId + ", time=" + time + ", amount="
				+ amount + ", address=" + address + ", paymentMethods=" + paymentMethods + ", note=" + note + "]";
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(String paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
