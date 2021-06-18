package com.cts;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Main {

	public static void main(String[] args) {
		
		
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("my-persistence");
	
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction transaction =em.getTransaction();
		
		transaction.begin();
		
	   Query q=em.createQuery("select e from Employee e where e.name=:name");
	   
	   q.setParameter("name", "def");
	   
	   Employee emp=(Employee)q.getSingleResult();
		
	   System.out.println(emp.getId());
	   System.out.println(emp.getName());
	   System.out.println(emp.getSalary());
	  
		
		transaction.commit();
		em.close();
		
		emf.close();
		
		

	}

}
