package com.prowings.inheritance.tablePerClassStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;
import com.prowings.inheritance.singleTable.Book;
import com.prowings.inheritance.singleTable.Pen;

public class TestTablePerClassStrategy {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Car car = new Car("AAA", "Suzuki", 4);
		Truck truck = new Truck("BBB", "Volvo", 16);
		
		session.save(car);
		session.save(truck);
		transaction.commit();
		session.close();
		sessionFactory.close();

		
	}

}
