package com.adee.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("andy");
		EntityManager em = emf.createEntityManager();
		Anmol a1 = em.find(Anmol.class, 1);
		Anmol a2 = em.find(Anmol.class, 2);
		
		System.out.println(a1);
		System.out.println(a2);
		
		Anmol a3 = new Anmol(3, "Test", "Name");
		em.getTransaction().begin();
		em.persist(a3);
		em.getTransaction().commit();

		Anmol a4 = em.find(Anmol.class, 3);
		System.out.println(a4);
	}
}
