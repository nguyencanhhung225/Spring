package com.hungnc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hungnc.dao.AbstractCRUD;
import com.hungnc.dao.ProductDAO;
import com.hungnc.model.Product;

public class ProductService extends AbstractCRUD<Product> {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public List<Product> getAll() {
		return productDAO.getAll();
	}

	@Override
	public Product getById(Integer id) {
		return productDAO.getById(id);
	}

	@Override
	public boolean insert(Product t) {
		return productDAO.insert(t);
	}

	@Override
	public boolean update(Product t) {
		return productDAO.update(t);
	}

	@Override
	public boolean delete(Product t) {
		return productDAO.delete(t);
	}
	
}
