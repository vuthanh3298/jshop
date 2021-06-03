package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Transactional(rollbackFor = Exception.class)
	public void saveOrUpdate(UserModel userModel) throws Exception {
		if(userModel.getUserId() == null) {
			System.out.println("ERROR: Miss USER PK");
			throw new Exception();
		}
		
		UserModel user = this.getUser(userModel.getUserId());
		
		if(user != null) {
			usersMapper.updateOne(userModel);
		} else {
			usersMapper.saveOne(userModel);
		}
	}
	
}
