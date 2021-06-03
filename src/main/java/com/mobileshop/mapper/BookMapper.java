package com.mobileshop.mapper;


import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.mobileshop.model.BookModel;
import com.mobileshop.model.BookTableModel;
import com.mobileshop.model.ProductModel;


public interface BookMapper {
	public List<BookModel> getAll() throws Exception;
	public List<BookTableModel> getAllBookTable() throws Exception;
	public BookModel getBook(Map<String, Object> params);
	public void updateOne(BookModel bookModel)throws Exception;;

	public void saveOne(BookModel bookModel)throws Exception;;
	

}
