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

		Student s1=new Student();
		s1.setId(1);
		s1.setName("NewUser3");
		s1.setPassportnumber("A12343");
		em.getTransaction().begin();
		em.persist(s1);
		em.getTransaction().commit();
		
		s = em.find(Student.class, 1);
		System.out.println(s);
		
		em.close();
		emf.close();
	}
}
