package com.mobileshop.mapper;

import java.util.List;

import com.mobileshop.dto.SearchDto;
import com.mobileshop.model.ProductModel;

public interface ProductMapper {
	public List<ProductModel> getAll() throws Exception;

	public List<ProductModel> selectNewList() throws Exception;

	public List<ProductModel> selectTopList() throws Exception;

	public List<ProductModel> selectManufacturerList(int id)throws Exception;

	public ProductModel getProduct(String id) throws Exception;

	public void updateOne(ProductModel productModel) throws Exception;

	public void saveOne(ProductModel productModel) throws Exception;

	public void deleteOne(String id) throws Exception;

	public List<ProductModel> search(String condition) throws Exception;

	public List<ProductModel> searchAtHome(SearchDto searchDto) throws Exception;

}
