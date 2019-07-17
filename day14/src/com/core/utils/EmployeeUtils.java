package com.core.utils;

import java.util.HashMap;

import com.app.core.Employee;

public class EmployeeUtils {
	public static HashMap<Integer,Employee> populateData()
	{
		HashMap<Integer,Employee> hm = new HashMap<>();
		hm.put(101,new Employee(101,"Harshita",5000.00));
		hm.put(102,new Employee(102,"Harshit",5000.00));
		hm.put(103,new Employee(103,"Hemant",5000.00));
		hm.put(104,new Employee(104,"Gyan",5000.00));

		return hm;
	}

}
