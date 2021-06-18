package com.cts;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="seq_gen")
	//@SequenceGenerator(name="seq_gen",initialValue = 100)
	private int id;
	
	//@Column(name="emp_name")
	private String name;
	//@Transient
	private int salary;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//private Date doj;
	
	
	
	
	/*
	 * public Date getDoj() { return doj; } public void setDoj(Date doj) { this.doj
	 * = doj; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
