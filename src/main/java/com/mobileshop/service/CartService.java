package com.mobileshop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileshop.dto.OrderDto;
import com.mobileshop.dto.ProductInCartDto;
import com.mobileshop.mapper.CartMapper;
import com.mobileshop.model.CartModel;
import com.mobileshop.model.ProductModel;
import com.mobileshop.util.AccountUtil;

@Service
public class CartService {
	@Autowired
	CartMapper cartMapper;
	
	@Autowired
	AccountUtil accountUtil;
	
	@Autowired
	ProductService productService;

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

	public List<ProductInCartDto> getProductInCart() throws Exception  {
		String userId = accountUtil.getUser().getUserId();
		List<CartModel> dataCart = cartMapper.getByUserId(userId);
		
		List<ProductInCartDto> productModels = dataCart.stream()
				.map(el -> {
					try {
						ProductModel productModel = productService.getProduct(el.getProductId());
						ProductInCartDto productInCartDto = new ProductInCartDto();
						
						BeanUtils.copyProperties(productModel, productInCartDto);
						
						productInCartDto.setAmount(el.getAmount());
						productInCartDto.setPrices(productModel.getPrice() * el.getAmount());
						
						productInCartDto.setCartId(el.getCartId());
						
						return productInCartDto;
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
				}).collect(Collectors.toList());
		
		return productModels;
	}

	@Transactional(rollbackFor = Exception.class)
	public void deleteCart(String productId) throws Exception {
		String userId = accountUtil.getUser().getUserId();
		
		Map<String, Object> params = new HashMap<>();
		params.put("userId", userId);
		params.put("productId", productId);
		
		cartMapper.deleteCart(params);
	}

	public CartModel getOne(String cartId) throws Exception {
		
		return cartMapper.getOne(cartId);
	}

	public void deleteCartById(String cartId) throws Exception {
		cartMapper.deleteCartById(cartId);
	}
	
	
}
