package com.prowings.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.entity.Employee;

public class EmployeeDao {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Ram", "IT", 121212);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Employee emp1 = session.get(Employee.class, 1);
		System.out.println(emp1);
		transaction.commit();
		session.close();

		Session session2 = sessionFactory.openSession();
		
		Transaction transaction2 = session2.beginTransaction();
		
		Employee emp2 = session2.get(Employee.class, 1);
		System.out.println(emp2);
		
		transaction2.commit();
		session2.close();
		
		
	}

}
