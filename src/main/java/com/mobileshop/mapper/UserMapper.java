package com.mobileshop.mapper;


import java.util.List;

import com.mobileshop.model.UserModel;

public interface UserMapper {
	public List<UserModel> getAll() throws Exception;

	public UserModel getUser(String id) throws Exception;
}
