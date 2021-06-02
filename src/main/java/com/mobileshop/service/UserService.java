package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshop.mapper.UserMapper;
import com.mobileshop.model.UserModel;

@Service
public class UserService {
	@Autowired
	UserMapper usersMapper;
	
	public List<UserModel> getAll() throws Exception {
		return usersMapper.getAll();
	}

	public UserModel getUser(String id) throws Exception {
		return usersMapper.getUser(id);
	}
	
}
