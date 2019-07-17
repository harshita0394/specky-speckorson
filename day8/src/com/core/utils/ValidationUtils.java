package com.core.utils;
import java.time.LocalDate;
import java.util.ArrayList;

import com.core.core.Customer;

import cust_excs.CustomerHandlingException;

public class ValidationUtils {
	public static final int MIN_LEN;
	public static final int MAX_LEN;
	static
	{
		MIN_LEN=5;
		MAX_LEN=20;
	}
	public static Customer validateCustomer(String email,String Pass,double amt,String regDate,ArrayList<Customer> l1) throws CustomerHandlingException
	{
		validateEmail(email,l1);
		validatePassword(Pass);
		validateRegAmt(amt);
		LocalDate regdate=validateDate(regDate);
		return new Customer(email,Pass,amt,regdate);
	}
	public static void validateEmail(String email,ArrayList<Customer> l1) throws CustomerHandlingException
	{
		if(email.length()<MIN_LEN)
		{
			throw new CustomerHandlingException("Email should be less than 5 char");
		}
		if(l1.contains(new Customer(email)))
		{
			throw new CustomerHandlingException("Email can not be duplicated");
		}
	}
	public static void validatePassword(String pass) throws CustomerHandlingException
	{
		if(!(pass.matches("[a-z]+[@,%,#,&,*][0-9]+")))
		{
			throw new CustomerHandlingException("Password not in correct format");
		}
	}
	public static void validateRegAmt(double amt) throws CustomerHandlingException 
	{
		if(amt%500!=0)
		{
			throw new CustomerHandlingException("Amount should be multiple of 500");
		}
	}
	public static LocalDate validateDate(String regDate) throws CustomerHandlingException
	{
		LocalDate regdate = LocalDate.parse(regDate);
		if(regdate.getMonthValue() <= 3)
		{
			if(regdate.getYear()!=LocalDate.now().getYear()-1)
				throw new CustomerHandlingException("Date should be within the current financial year");
		}
		else
		{
			if(regdate.getYear()!=LocalDate.now().getYear())
				throw new CustomerHandlingException("Date should be withtin the current financial year");
		}
		return regdate;
	}
	public static void validateLogin(String email,String Password,ArrayList<Customer> l1) throws CustomerHandlingException
	{
		Customer c1=new Customer(email);
		int index=l1.indexOf(c1);
		if(index!=-1)
		{
			Customer c=l1.get(index);
			if(c.getPassword().equals(Password)==false)
			{
				throw new CustomerHandlingException("Password is invalid.Please re-enter Password");
			}
		
		}
		else
		{
			throw new CustomerHandlingException("ID not valid");
		}
		
		
	}
}
