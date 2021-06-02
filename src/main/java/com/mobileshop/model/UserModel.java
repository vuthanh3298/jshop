package com.mobileshop.model;

import java.sql.Timestamp;

public class UserModel {
	
	private String userId;//mã nhân viên
	private String position;//chức vụ
	private String name;//họ và tên
	private Timestamp dob;// ngày tháng năm sinh
	private Boolean gender;//giới tính
	private String addres;//địa chỉ
	private String phoneNumber;//số điện thoại
	private String email;//email
	private String note;//ghi chú
	private String pass;//mật khẩu
	
	private String roleId;// quyền 0: admin 1: nhân viên 2: người dùng
	
	public UserModel() {
		super();
	}
	public UserModel(String userId, String position, String name, Timestamp dob, Boolean gender, String addres,
			String phoneNumber, String email, String note, String roleId, String pass) {
		super();
		this.userId = userId;
		this.position = position;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.addres = addres;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.note = note;
		this.roleId = roleId;
		this.pass = pass;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDob() {
		return dob;
	}
	public void setDob(Timestamp dob) {
		this.dob = dob;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.note = pass;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "UsersModel ["
				+ "userId=" + userId 
				+ ", position=" + position 
				+ ", name=" + name 
				+ ", dob=" + dob 
				+ ", gender=" + gender 
				+ ", addres=" + addres 
				+ ", phoneNumber=" + phoneNumber 
				+ ", email=" + email 
				+ ", note=" + note 
				+ ", pass=" + pass 
				+ ", roleId=" + roleId 
				+"]";
	}
}
