package com.prowings.inheritance.tablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle{
	@Column
	private String compny;
	@Column
	private int numberOfWheels;

	public Truck() {
		super();
	}
	public Truck(String manufacturer, String compny, int wheels) {
		super(manufacturer);
		this.compny = compny;
		this.numberOfWheels = wheels;
	}
	public String getCompny() {
		return compny;
	}
	public void setCompny(String compny) {
		this.compny = compny;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	

}
