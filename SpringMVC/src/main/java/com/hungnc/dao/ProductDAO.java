package com.hungnc.dao;

import java.util.List;

import org.hibernate.Session;

import com.hungnc.model.Product;
import com.hungnc.utils.HibernateUtil;

public class ProductDAO extends AbstractCRUD<Product> {

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> products() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Product> result = session.createQuery("from Product").list();
		session.getTransaction().commit();
		return result;
	}

	@Override
	public Product getById(Integer id) {
		return null;
	}

	@Override
	public boolean insert(Product t) {
		return false;
	}

	@Override
	public boolean update(Product t) {
		return false;
	}

	@Override
	public boolean delete(Product t) {
		return false;
	}

}
