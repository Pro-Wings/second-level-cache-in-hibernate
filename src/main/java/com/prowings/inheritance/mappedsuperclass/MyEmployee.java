package com.prowings.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyEmployee extends Person{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String department;

	public MyEmployee() {
		super();
	}

	public MyEmployee(String name, String department, int height, int weight) {
		super(height, weight);
		this.name = name;
		this.department = department;
		
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "MyEmployee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}


	
}
