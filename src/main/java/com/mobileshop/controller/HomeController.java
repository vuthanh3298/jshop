package com.mobileshop.controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobileshop.model.ProductModel;
import com.mobileshop.model.UserModel;
import com.mobileshop.service.CartService;
import com.mobileshop.service.ProductService;
import com.mobileshop.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	
	@Autowired
	CartService cartService;

	@RequestMapping(value = "/")
	public String home(ModelMap modelMap) throws IOException {
		try {
			Object productsHot = productService.selectTopList();
	    	modelMap.addAttribute("productsHot", productsHot);
			List<ProductModel> productsNew = productService.getAll();
			
			modelMap.put("productsNew", productsNew);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home/home";
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
	
	@GetMapping("/product-detail/{id}")
	public String detail(@PathVariable String id, ModelMap modelMap) throws IOException{
		try {
			ProductModel productModel = productService.getProduct(id);
			modelMap.put("product", productModel);
			
			long oldPrice = productModel.getPrice() + ((new Random()).nextInt(500 - 1) + 500) * 1000;
			modelMap.put("oldPrice", oldPrice);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home/DetailProduct";
	}
	@RequestMapping(value="/product-hot")
	public String productHot(HttpServletResponse response) throws IOException{
		return "home/ListProduct";
	}
	@RequestMapping(value="/product-new")
	public String productNew(HttpServletResponse response) throws IOException{
		return "home/ListProduct";
	}
	@RequestMapping(value="/manufacturer")
	public String productManufacturer(HttpServletResponse response) throws IOException{
		return "home/ListProduct";
	}
	
	@RequestMapping(value="/purchase-order")
	public String purchaseOrder(HttpServletResponse response) throws IOException{
		return "home/purchaseOrder";
	}
	
	@GetMapping("/midleware-purchase/{id}")
	public String midlewarePurchase(@PathVariable String id) {
		
		return "redirect:/product-detail/" + id;
	}
}

