package com.mobileshop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInSignUpController {

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
}

