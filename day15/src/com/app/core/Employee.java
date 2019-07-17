package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable{
	private int id;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	private String name;
	private double salary;
	private LocalDate hireDate;
	public Employee(int id, String name, double salary,LocalDate hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hireDate=hireDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
