package com.core.utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.Department;
import com.app.core.Employee;



public class DepartmentUtils {
	public static HashMap<String,Department> populateData() {
		HashMap<String,Department> deptMap = new HashMap<>();
		deptMap.put("rnd",new Department("rnd","Harshita",EmployeeUtils.populateData()));
		deptMap.put("prod",new Department("rnd","Harshita",EmployeeUtils.populateData2()));
		deptMap.put("sales",new Department("rnd","Harshita",EmployeeUtils.populateData3()));
		return deptMap;
	}
	
	public static synchronized void sortEmpBySalary(ArrayList<Employee> empList)
	{
		System.out.println("In Sort By Salary Thread.....");
		empList.sort((e1,e2)->((Double)e1.getSalary()).compareTo(e2.getSalary()));
		empList.forEach(System.out::println);
		System.out.println("Sort By Salary Thread over...");
	}
	
	public static synchronized void sortEmpByHireDate(ArrayList<Employee> empList)
	{
		System.out.println("In Sort By Date Thread.....");
		empList.sort((e1,e2)->(e1.getHireDate().compareTo(e2.getHireDate())));
		empList.forEach(System.out::println);
		System.out.println("Sort By Date Thread over...");
	}
	
	

}
