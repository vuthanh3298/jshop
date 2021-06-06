package com.mobileshop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileshop.dto.OrderDto;
import com.mobileshop.mapper.CartMapper;
import com.mobileshop.model.CartModel;
import com.mobileshop.util.AccountUtil;

@Service
public class CartService {
	@Autowired
	CartMapper cartMapper;
	
	@Autowired
	AccountUtil accountUtil;

	public CartModel getByUserIdAndProductId(String userId, String productId) throws Exception {
		Map<String, Object> params = new HashMap<>();
		params.put("userId", userId);
		params.put("productId", productId);
		
		List<CartModel> cartModels = cartMapper.getByUserIdAndProductId(params);
		CartModel cartModel = null;
		if(cartModels != null && cartModels.size() > 0) {
			cartModel = cartModels.get(0);
		}
		
		return cartModel;
	}

	public void updateOne(CartModel cartModel) throws Exception {
		cartMapper.updateOne(cartModel);
	}

	public void saveOne(CartModel cartModel) throws Exception {
		cartMapper.saveOne(cartModel);
	}

	@Transactional(rollbackFor = Exception.class)
	public void saveCart(OrderDto orderDto) throws Exception {
		String userId = accountUtil.getUser().getUserId();
		String productId = orderDto.getProductId();
		
		CartModel cartModel = this.getByUserIdAndProductId(userId, productId);
		
		if(cartModel != null) {
			cartModel.setAmount(cartModel.getAmount() + orderDto.getAmount());
			this.updateOne(cartModel);
		} else {
			CartModel cartModelToSave = new CartModel();
			cartModelToSave.setProductId(productId);
			cartModelToSave.setUserId(userId);
			cartModelToSave.setAmount(orderDto.getAmount());
			this.saveOne(cartModelToSave);
		}
		
	}
	
	
}
