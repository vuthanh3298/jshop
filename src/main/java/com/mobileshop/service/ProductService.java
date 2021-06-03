package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshop.mapper.ProductMapper;
import com.mobileshop.model.ProductModel;

@Service
public class ProductService {
	@Autowired
	ProductMapper productMapper;
	
	public List<ProductModel> getAll() throws Exception {
		return productMapper.getAll();
	}
	
}
