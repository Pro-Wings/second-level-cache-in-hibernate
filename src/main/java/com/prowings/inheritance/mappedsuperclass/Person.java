package com.prowings.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

	@Column
	private int weight;
	@Column
	private int height;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
