package com.mobileshop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mobileshop.model.FileModel;

@Mapper
public interface FileMapper {
	public void insert(FileModel fileModel);
	public FileModel selectOne(Integer id);
	public Integer delete(Integer id);
}
