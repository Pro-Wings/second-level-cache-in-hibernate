package com.prowings.inheritance.tablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicle{
	
	@Column
	private String company;
	@Column
	private int numberOfWheels;

	public Car() {
		super();
	}
	public Car(String manufacturer, String company, int wheels) {
		super(manufacturer);
		this.company = company;
		this.numberOfWheels = wheels;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	

	
}
