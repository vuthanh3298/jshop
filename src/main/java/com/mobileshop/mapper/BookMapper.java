package com.mobileshop.mapper;


import java.util.List;

import com.mobileshop.model.BookModel;


public interface BookMapper {
	public List<BookModel> getAll() throws Exception;

}
