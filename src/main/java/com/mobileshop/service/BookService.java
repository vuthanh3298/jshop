package com.mobileshop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobileshop.mapper.BookMapper;
import com.mobileshop.model.BookModel;
import com.mobileshop.model.BookTableModel;

@Service
public class BookService {
	@Autowired
	BookMapper bookMapper;
	
	public List<BookModel> getAll() throws Exception {
		return bookMapper.getAll();
	}
	public List<BookTableModel> getAllBookTable() throws Exception {
		return bookMapper.getAllBookTable();
	}
	

	public BookModel getBook(Map<String, Object> params) throws Exception {
		return bookMapper.getBook(params);
	}
	@Transactional(rollbackFor = Exception.class)
	public void saveOrUpdateBook(BookModel bookModel) throws Exception {
		if(bookModel.getProductId() == null) {
			System.out.println("ERROR: Miss Product PK");
			throw new Exception();
		}
		Map<String, Object> params = new HashMap<>();
		params.put("productId", bookModel.getProductId());
		params.put("userId", bookModel.getUserId());
		params.put("time", bookModel.getTime());
		BookModel product = this.getBook(params);
		
		
		// get roleName => set for position in user table
		
		
		if(product != null) {
			bookMapper.updateOne(bookModel);
		} else {
			bookMapper.saveOne(bookModel);
		}
	}
	

}
