package com.mobileshop.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobileshop.dto.SearchDto;
import com.mobileshop.model.ProductModel;
import com.mobileshop.service.ProductService;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	ProductService productService;

	@PostMapping
	public String search(@ModelAttribute SearchDto searchDto, ModelMap modelMap) {
		try {
			List<ProductModel> productModels = productService.searchAtHome(searchDto);
			modelMap.put("productModels", productModels);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home/SearchResult";
	}

}
