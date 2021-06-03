package com.mobileshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshop.mapper.BookMapper;
import com.mobileshop.model.BookModel;

@Service
public class BookService {
	@Autowired
	BookMapper bookMapper;
	
	public List<BookModel> getAll() throws Exception {
		return bookMapper.getAll();
	}
	
}
