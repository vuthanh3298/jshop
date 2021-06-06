package com.mobileshop.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobileshop.dto.OrderDto;
import com.mobileshop.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/")
	public String saveCart(@ModelAttribute OrderDto orderDto) {
		try {
			cartService.saveCart(orderDto);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return "redirect:/cart";
	}
}
