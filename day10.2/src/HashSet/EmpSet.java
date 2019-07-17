package HashSet;

import java.util.HashSet;

public class EmpSet {
	public static void main(String[] args)
	{
		HashSet<Employee> emps = new HashSet<>();
		Employee e1 = new Employee(1,"harshita",123.00);
		Employee e2 = new Employee(2,"harshita",123.00);
		Employee e3 = new Employee(3,"harshita",123.00);
		Employee e4 = new Employee(4,"harshita",123.00);
		Employee e5 = new Employee(5,"harshita",123.00);
		System.out.println("e1 added : "+emps.add(e1));
		System.out.println("e2 added : "+emps.add(e2));
		System.out.println("e3 added : "+emps.add(e3));
		System.out.println("e4 added : "+emps.add(e4));
		System.out.println("e5 added : "+emps.add(e5));
		System.out.println(emps);
		
	}
}
