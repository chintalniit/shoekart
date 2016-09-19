package com.shoe.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoe.model.Product;
import com.shoe.dao.ProductDao;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addproduct(Product product){
		
		Session session=sessionFactory.getCurrentSession();
		Transaction tx1=session.beginTransaction();
		session.save(product);
		tx1.commit();
		System.out.println("done");
		
	}

}
