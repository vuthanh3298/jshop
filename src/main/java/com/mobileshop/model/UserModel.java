package com.mobileshop.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	
	private String userId;
	private String position;
	private String name;
	private Date dob;
	private Boolean gender;
	private String address;
	private String phoneNumber;
	private String email;
	private String password;
	private String note;
	
	private int roleId;
	

	
	
}
