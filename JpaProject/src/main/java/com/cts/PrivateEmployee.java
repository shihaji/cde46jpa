package com.cts;

import javax.persistence.Entity;

//@Entity
public class PrivateEmployee extends Employee{
	
	private int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	

}
