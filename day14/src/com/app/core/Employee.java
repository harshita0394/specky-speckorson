package com.app.core;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;
	private Address adrs;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setAddress(String cityName,String stateName,String countryName)
	{
		adrs = new Address(cityName,stateName,countryName);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adrs=" + adrs + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
