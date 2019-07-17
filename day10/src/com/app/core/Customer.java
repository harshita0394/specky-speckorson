package com.app.core;

import java.time.LocalDate;

public class Customer{
	String email;
	String password;
	double reg_amount;
	LocalDate reg_date;
	public Customer(String email, String password, double reg_amount,
			LocalDate reg_date) {
		super();
		this.email = email;
		this.password = password;
		this.reg_amount = reg_amount;
		this.reg_date = reg_date;
	}

	public String toString() {
		return "Customer [email=" + email + ", password=" + password
				+ ", reg_amount=" + reg_amount + ", reg_date=" + reg_date + "]";
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
	
}
	