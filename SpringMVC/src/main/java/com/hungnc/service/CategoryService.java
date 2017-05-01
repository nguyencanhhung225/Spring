package com.hungnc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hungnc.dao.AbstractCRUD;
import com.hungnc.dao.CategoryDAO;
import com.hungnc.model.Category;
import com.hungnc.model.Product;

public class CategoryService extends AbstractCRUD<Category> {
	
	@Autowired
	private CategoryDAO categoryDAO; 
	
	@Override
	public List<Product> getAll() {
		return null;
	}

	@Override
	public Category getById(Integer Id) {
		return null;
	}

	@Override
	public boolean insert(Category t) {
		return false;
	}

	@Override
	public boolean update(Category t) {
		return false;
	}

	@Override
	public boolean delete(Category t) {
		return false;
	}

}
