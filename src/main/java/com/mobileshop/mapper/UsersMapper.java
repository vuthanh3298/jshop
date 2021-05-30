package com.mobileshop.mapper;


import java.util.List;

import com.mobileshop.model.UsersModel;

public interface UsersMapper {
	public List<UsersModel> getAll() throws Exception;

	public UsersModel getUser(int id) throws Exception;
}
