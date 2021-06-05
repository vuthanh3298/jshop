package com.mobileshop.service;

import java.util.ArrayList;
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
	public List<Object> selectTopList() throws Exception{
	 	List<Object> productModelHot = new ArrayList<Object>();// = baiDangService.selectTop4DuAn();
		List<ProductModel>productModelDANB = productMapper.getAll();;
		List<ProductModel> productModelSmall = new ArrayList<ProductModel>();
		int i=0;
    	for (ProductModel baidang : productModelDANB) {
    		if(i<4) {
    			
    			productModelSmall.add(baidang);
    			i++;
    		}else {
    			productModelHot.add(new ArrayList<ProductModel>(productModelSmall));
    			i=0;
    			
    			productModelSmall.clear();
    		}
    		
		}
    	productModelHot.add(productModelSmall);
		return productModelHot;
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
