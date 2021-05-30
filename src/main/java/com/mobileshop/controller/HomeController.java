package com.mobileshop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobileshop.model.UsersModel;
import com.mobileshop.service.UsersService;

@Controller
public class HomeController {
	
	@Autowired
	UsersService usersService;

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "home";
	}
	
	@GetMapping("/users")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.ok(usersService.getAll());
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}
		
	}
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public ResponseEntity<?> getUser(@PathVariable String id) {
		try {
			int intId = Integer.parseInt(id);
			UsersModel user = usersService.getUser(intId);
			System.out.println(user);
			return ResponseEntity.ok(new UsersModel(5,"abc", "13"));
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}
		
	}
}

