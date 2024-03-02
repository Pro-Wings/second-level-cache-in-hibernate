package com.prowings.inheritance.joinedTableStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.dao.HibernateUtil;

public class TestJoinedTableStrategy {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Pet pet = new Pet("abc", "AAA", 21);
		WildAnimals wild_animal = new WildAnimals("pqr", "Elephant");
		
		session.save(pet);
		session.save(wild_animal);
		
//		Pet p = session.get(Pet.class, 1);
//		
//		System.out.println(p.getId());
//		System.out.println(p.getName());
//		System.out.println(p.getSpecies());
//		System.out.println(p.getWeight());
		
		transaction.commit();
		session.close();

		sessionFactory.close();

		
	}

}
