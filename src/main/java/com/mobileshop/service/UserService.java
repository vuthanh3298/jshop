package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileshop.mapper.UserMapper;
import com.mobileshop.model.RoleModel;
import com.mobileshop.model.UserModel;
import com.mobileshop.util.EncodedPasswordUtil;

@Service
public class UserService {
	@Autowired
	UserMapper usersMapper;
	
	@Autowired
	RoleService roleService;
	
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
		
		// get roleName => set for position in user table
		RoleModel roleModel = roleService.getRole(userModel.getRoleId());
		userModel.setPosition(roleModel.getRoleName());
		
		if(user != null) {
			usersMapper.updateOne(userModel);
		} else {
			// default password
			String password = EncodedPasswordUtil.encode("123");
			userModel.setPassword(password);
			
			usersMapper.saveOne(userModel);
		}
	}

	@Transactional
	public void deleteOne(String id) throws Exception {
		usersMapper.deleteOne(id);
	}

	public UserModel getUserByEmail(String email) throws Exception {
		return usersMapper.getUserByEmail(email);
	}

	public List<UserModel> search(String condition) throws Exception {
		return usersMapper.search(condition);
	}

	public void saveOne(UserModel userModel) throws Exception {
		if(userModel.getUserId() == null) {
			userModel.setUserId(userModel.getEmail());
		}
		
		if(userModel.getRoleId() == 0) {
			userModel.setRoleId(3);
			userModel.setPosition("USER");
		}
		
		String passwordEncode = EncodedPasswordUtil.encode(userModel.getPassword());
		userModel.setPassword(passwordEncode);
		
		usersMapper.saveOne(userModel);
	}
	
}
