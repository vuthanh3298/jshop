package com.mobileshop.mapper;

import java.util.List;
import java.util.Map;

import com.mobileshop.model.CartModel;

public interface CartMapper {

	public List<CartModel> getByUserIdAndProductId(Map<String, Object> params) throws Exception;

	public void updateOne(CartModel cartModel) throws Exception;

	public void saveOne(CartModel cartModel) throws Exception;

	public List<CartModel> getByUserId(String userId) throws Exception;

	public void deleteCart(Map<String, Object> params) throws Exception;

	public CartModel getOne(String cartId) throws Exception;

	public void deleteCartById(String cartId) throws Exception;

}
