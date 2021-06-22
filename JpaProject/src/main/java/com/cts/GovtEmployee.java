package com.cts;

import javax.persistence.Entity;

//@Entity
public class GovtEmployee extends Employee{
	
	private int pension;

	public int getPension() {
		return pension;
	}

	public void setPension(int pension) {
		this.pension = pension;
	}
	
	

}
