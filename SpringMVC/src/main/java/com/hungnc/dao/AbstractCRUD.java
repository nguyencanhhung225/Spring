package com.hungnc.dao;

import java.util.List;

import com.hungnc.model.Product;

/**
 * 
 * @author CanhHung
 *
 * @param <T> Object
 */
public abstract class AbstractCRUD<T> {
	public abstract List<Product> getAll();
	public abstract T getById(Integer Id);
	public abstract boolean insert(T t);
	public abstract boolean update(T t);
	public abstract boolean delete(T t);
}
