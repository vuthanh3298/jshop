package com.mobileshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobileshop.model.UserModel;
import com.mobileshop.service.UserService;

@Controller(value = "HomeControllerAdmin")
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/")
	public String home(HttpServletResponse response) throws IOException{
		return "admin/home";
	}
	@RequestMapping(value="/users")
	public String users(ModelMap modelMap) throws IOException{
		try {
			List<UserModel> users = userService.getAll();
			modelMap.put("users", users);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "admin/users";
	}
}



