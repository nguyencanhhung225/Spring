package com.hungnc.dao;

import java.util.List;

import org.hibernate.Session;

import com.hungnc.model.Category;
import com.hungnc.model.Product;
import com.hungnc.utils.HibernateUtil;

public class CategoryDAO extends AbstractCRUD<Category> {
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Product> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Product> result = session.createQuery("from Category").list();
		session.getTransaction().commit();
		return result;
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
