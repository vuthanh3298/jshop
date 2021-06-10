package com.mobileshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshop.mapper.FileMapper;
import com.mobileshop.model.FileModel;

@Service
public class FileService {
	@Autowired
	FileMapper fileMapper;

	public FileService(FileMapper fileMapper) {
		super();
		this.fileMapper = fileMapper;
	}
	
	public Integer insert(FileModel fileModel) {
		fileMapper.insert(fileModel);
		return fileModel.getId();
	}
	
	public FileModel selectOne(Integer id) {
		return fileMapper.selectOne(id);
	}

	public Integer delete(Integer id) {
		return fileMapper.delete(id);
	}
}
