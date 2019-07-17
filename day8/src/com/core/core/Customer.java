package com.core.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private String email;
	private String password;
	private double reg_amount;
	private LocalDate reg_date;
	public Customer(String email, String password, double reg_amount,
			LocalDate reg_date) {
		super();
		this.email = email;
		this.password = password;
		this.reg_amount = reg_amount;
		this.reg_date = reg_date;
	}
	public Customer(String email) {
		super();
		this.email = email;
	}
	public String toString() {
		return "Customer [email=" + email + ", password=" + password
				+ ", reg_amount=" + reg_amount + ", reg_date=" + reg_date + "]";
	}
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
		{
			return email.equals(((Customer)o).email);
		}
		return false;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getReg_amount() {
		return reg_amount;
	}
	public void setReg_amount(double reg_amount) {
		this.reg_amount = reg_amount;
	}
	public LocalDate getReg_date() {
		return reg_date;
	}
	public void setReg_date(LocalDate reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public int compareTo(Customer o)
	{
		return (email.compareTo(o.getEmail()));
		
	}
	
}
	