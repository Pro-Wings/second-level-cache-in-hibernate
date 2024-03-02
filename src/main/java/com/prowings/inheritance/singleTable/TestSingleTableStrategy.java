package com.prowings.inheritance.singleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

public class TestSingleTableStrategy {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Pen pen = new Pen("Reynolds", "Blue", 10);
		
		Book book = new Book("Effective Java", "Joshua Bloch", 1234);
		
		session.save(pen);
		session.save(book);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
