package com.prowings.inheritance.joinedTableStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "WildAnimal_Id")
public class WildAnimals extends Animal {

	@Column
	private String name;

	public WildAnimals() {
		super();
	}

	public WildAnimals(String species, String name) {
		super(species);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "WildAnimals [name=" + name + "]";
	}

	
}
