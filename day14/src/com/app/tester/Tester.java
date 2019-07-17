package com.app.tester;

import static IOUtils.IOUtils.*;
import static com.core.utils.EmployeeUtils.populateData;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Employee;
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//HashMap<Integer,Employee> empList = populateData();
			HashMap<Integer,Employee> readEmpMap = null;
			//writeData(empList,"EmpList.ser");
			boolean exit=false;
			try {
				while(!exit)
				{
					System.out.println("1:Restore Data 2:Hire emp 3:Link Emp Address 4:Display Emp Details 5:save and exit");
					System.out.println("Enter your choice");
					switch(sc.nextInt())
					{
					case 1:
						readEmpMap = ((HashMap<Integer,Employee>)readData("EmpList.ser"));
						break;
					case 2:
						System.out.println("Enter Employee Id, Employee name, Salary of Employee");
						Employee emp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
						readEmpMap.put(emp.getId(), emp);
						break;
					case 3:
						System.out.println("Enter Employee id to link address");
						emp = readEmpMap.get(101);
						System.out.println(emp);
						System.out.println("Enter Address Details, cityName, StateName, CountryName");
						emp.setAddress("Pune", "Maharashtra", "India");
						break;
					case 4:
						System.out.println(readEmpMap);
						break;
					case 5:
						writeData(readEmpMap,"EmpList.ser");
						exit=true;
						break;
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
					
		}
		finally
		{
			if(sc!=null)
			{
				sc.close();
			}
			System.out.println("bye bye");
		}

	}

}
