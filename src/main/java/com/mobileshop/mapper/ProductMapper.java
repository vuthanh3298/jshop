package com.mobileshop.mapper;


import java.util.List;

import com.mobileshop.model.ProductModel;

public interface ProductMapper {
	public List<ProductModel> getAll() throws Exception;

	public ProductModel getProduct(String id) throws Exception;

	public void updateOne(ProductModel productModel)throws Exception;

	public void saveOne(ProductModel productModel)throws Exception;
	
}
