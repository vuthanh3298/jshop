package com.mobileshop.mapper;


import java.util.List;

import com.mobileshop.model.BookModel;
import com.mobileshop.model.BookTableModel;


public interface BookMapper {
	public List<BookModel> getAll() throws Exception;
	public List<BookTableModel> getAllBookTable() throws Exception;

}
