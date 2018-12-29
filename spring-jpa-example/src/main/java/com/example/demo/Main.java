package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class Main {

	public void execute() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em= emf.createEntityManager();
		Student s = em.find(Student.class, 10002);
		System.out.println(s);

		Student aj=new Student();
		aj.setId(1);
		aj.setName("NewUser3");
		aj.setPassportnumber("A12343");
		em.getTransaction().begin();
		em.persist(aj);
		em.getTransaction().commit();
		
		s = em.find(Student.class, 1);
		System.out.println(s);
		
		em.close();
		emf.close();
	}
}
