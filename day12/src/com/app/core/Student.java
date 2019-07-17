package com.app.core;

import java.time.LocalDate;

public class Student {
	private int id;
	private String email;
	private double gpa;
	private String subject;
	private LocalDate dob;
	
	static int count;
	static {
		count = 0;
	}
	public Student(String email, double gpa, String subject, LocalDate dob) {
		super();
		this.id = ++count;
		this.email = email;
		this.gpa = gpa;
		this.subject = subject;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", gpa=" + gpa + ", subject=" + subject + ", dob=" + dob
				+ "]";
	}
	
	
	

}
