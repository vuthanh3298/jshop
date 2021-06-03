package com.mobileshop.mapper;


import java.util.List;

import com.mobileshop.model.ProductModel;

public interface ProductMapper {
	public List<ProductModel> getAll() throws Exception;
}
