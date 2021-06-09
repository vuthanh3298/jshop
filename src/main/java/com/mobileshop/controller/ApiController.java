package com.mobileshop.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileshop.model.BookModel;
import com.mobileshop.model.ProductModel;
import com.mobileshop.model.UserModel;
import com.mobileshop.service.BookService;
import com.mobileshop.service.ProductService;
import com.mobileshop.service.UserService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	@Autowired
	BookService bookService;

	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable String id) {
		try {
			UserModel user = userService.getUser(id);
			return ResponseEntity.ok(user);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}

	}
	@DeleteMapping("/user/{id:.+}")
	public Boolean deleteUser(@PathVariable String id) {
		try {
			userService.deleteOne(id);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}
	@DeleteMapping("/product/{id}")
	public Boolean deleteProduct(@PathVariable String id) {
		try {
			productService.deleteOne(id);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProduct(@PathVariable String id) {
		try {
			ProductModel product = productService.getProduct(id);
			return ResponseEntity.ok(product);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}

	}

	@DeleteMapping("/book/{id}")
	public Boolean deleteBook(@PathVariable String id) {
		try {
			String[] arrId = id.split("~");
			String productId = arrId[0];
			String userId = arrId[1];
			Timestamp time = Timestamp.valueOf(arrId[2]) ;
			bookService.deleteOne(productId,userId,time);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	@GetMapping("/book/{id}")
	public ResponseEntity<?> getBook(@PathVariable String id) {
		try {
			String[] arrId = id.split("~");
			String productId = arrId[0];
			String userId = arrId[1];
			Timestamp time = Timestamp.valueOf(arrId[2]) ;
			
			Map<String, Object> params = new HashMap<>();
			params.put("productId", productId);
			params.put("userId",userId);
			params.put("time", time);
			
			BookModel book = bookService.getBook(params);
			return ResponseEntity.ok(book);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body(null);
		}

	}
}
