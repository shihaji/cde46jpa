package com.cts;

import java.util.Arrays;
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
		
	  //  Student st=em.find(Student.class, 1);
	    
	    //System.out.println(st.getName());
		
		Subject sub1=new Subject();
		sub1.setName("java");
		
		Subject sub2=new Subject();
		sub2.setName("mysql");
		
		
		Student st1=new Student();
		st1.setName("abc");
		
		st1.setSubjectList(Arrays.asList(sub1,sub2));
		
		
		Student st2=new Student();
		
		st2.setName("def");
		
		st2.setSubjectList(Arrays.asList(sub1));
		
		sub1.setStudentList(Arrays.asList(st1,st2));
		
		sub2.setStudentList(Arrays.asList(st1));
		
		em.persist(st1);
		
		em.persist(st2);
		
			
		
		transaction.commit();
		em.close();
		
		 //System.out.println(st.getSubjectList().get(0).getName());
			//System.out.println(st.getSubjectList().get(1).getName());
		
		emf.close();
		
		

	}

}
