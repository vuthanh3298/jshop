package com.mobileshop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mobileshop.model.UserModel;
import com.mobileshop.service.UserService;

@Controller
public class SignInSignUpController {
	
	@Autowired
	UserService userService;

	@GetMapping(value="/signin")
	public String signin(HttpServletResponse response) throws IOException{
		return "signinsignup/SignIn";
	}
	@GetMapping(value="/signup")
	public String signup(HttpServletResponse response) throws IOException{
		return "signinsignup/SignUp";
	}
	@GetMapping("/change-password")
	public String changePassword(@RequestParam(value = "message", required = false) String message, ModelMap modelMap) {
		if (message != null && message.equals("token_khong_dung")) {
			modelMap.addAttribute("message", "Token không hợp lệ");
		}
		return "signinsignup/ChangePassword";
	}
	@GetMapping("/error")
	public String err() {
		return "home/errpage404";
	}
	
	@PostMapping("/signup")
	public String signup(@ModelAttribute UserModel userModel) throws Exception {
		userService.saveOne(userModel);
		return "redirect:/signin";
	}
}

