package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileshop.mapper.ProductMapper;
import com.mobileshop.model.ProductModel;

@Service
public class ProductService {
	@Autowired
	ProductMapper productMapper;
	
	public List<ProductModel> getAll() throws Exception {
		return productMapper.getAll();
	}
	public ProductModel getProduct(String id) throws Exception {
		return productMapper.getProduct(id);
	}

	@Transactional(rollbackFor = Exception.class)
	public void saveOrUpdateProduct(ProductModel productModel) throws Exception {
		if(productModel.getProductId() == null) {
			System.out.println("ERROR: Miss Product PK");
			throw new Exception();
		}
		ProductModel product = this.getProduct(productModel.getProductId());
		
		
		// get roleName => set for position in user table
		
		
		if(product != null) {
			productMapper.updateOne(productModel);
		} else {
			productMapper.saveOne(productModel);
		}
	}


	
}
