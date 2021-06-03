package com.mobileshop.model;

public class RoleModel {
	private int roleId;//id
	private String roleName;//tên chức vụ
	
	public RoleModel() {
		super();
	}

	public RoleModel(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
}
