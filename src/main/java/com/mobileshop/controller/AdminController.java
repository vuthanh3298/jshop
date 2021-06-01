package com.mobileshop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "HomeControllerAdmin")
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "admin/home";
	}
}
