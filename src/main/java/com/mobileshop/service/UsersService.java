package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshop.mapper.UsersMapper;
import com.mobileshop.model.UsersModel;

@Service
public class UsersService {
	@Autowired
	UsersMapper usersMapper;
	
	public List<UsersModel> getAll() throws Exception {
		return usersMapper.getAll();
	}

	public UsersModel getUser(int id) throws Exception {
		return usersMapper.getUser(id);
	}
	
}
