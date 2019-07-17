package com.core.utils;

import java.time.LocalDate;

import java.util.ArrayList;

import com.app.core.Employee;

public class EmployeeUtils {
	public static ArrayList<Employee> populateData()
	{
		ArrayList<Employee> hm = new ArrayList<>();
		hm.add(new Employee(101,"Harshita",5000.00,LocalDate.parse("2015-11-12")));
		hm.add(new Employee(102,"Harshit",5000.00,LocalDate.parse("2019-02-03")));
		hm.add(new Employee(103,"Hemant",5000.00,LocalDate.parse("2018-05-05")));
		hm.add(new Employee(104,"Gyan",5000.00,LocalDate.parse("2018-02-04")));

		return hm;
	}
	
	public static ArrayList<Employee> populateData2()
	{
		ArrayList<Employee> hm = new ArrayList<>();
		hm.add(new Employee(101,"Ajeet",5000.00,LocalDate.parse("2015-11-12")));
		hm.add(new Employee(102,"Navin",5300.00,LocalDate.parse("2019-02-03")));
		hm.add(new Employee(103,"Swapnil",15000.00,LocalDate.parse("2018-05-05")));
		hm.add(new Employee(104,"Avichal",45000.00,LocalDate.parse("2018-02-04")));

		return hm;
	}

	public static ArrayList<Employee> populateData3()
	{
		ArrayList<Employee> hm = new ArrayList<>();
		hm.add(new Employee(101,"Vishruti",5000.00,LocalDate.parse("2015-11-12")));
		hm.add(new Employee(102,"Harshada",5300.00,LocalDate.parse("2019-02-03")));
		hm.add(new Employee(103,"Damayanti",15000.00,LocalDate.parse("2018-05-05")));
		hm.add(new Employee(104,"Trishala",45000.00,LocalDate.parse("2018-02-04")));

		return hm;
	}
}
