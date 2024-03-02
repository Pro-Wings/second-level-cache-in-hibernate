package com.prowings.inheritance.joinedTableStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "Pet_Id")
public class Pet extends Animal{
	@Column
	private String name;
	@Column
	private int weight;

	public Pet() {
		super();
	}
	public Pet(String species, String name, int weight) {
		super(species);
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", weight=" + weight + "]";
	}

}
