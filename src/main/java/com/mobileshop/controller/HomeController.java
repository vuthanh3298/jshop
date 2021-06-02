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

import com.mobileshop.model.UserModel;
import com.mobileshop.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "home";
	}
	
	@GetMapping("/users")
	@ResponseBody
	public ResponseEntity<?> getAll() {
		try {
			System.out.println(userService.getAll());
			return ResponseEntity.ok(userService.getAll());
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}
		
	}
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public ResponseEntity<?> getUser(@PathVariable String id) {
		try {
			UserModel user = userService.getUser(id);
			System.out.println(user);
			return ResponseEntity.ok("abc");
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}
		
	}
}

