package TreeSet;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class EmpTreeSet {

	public static void main(String[] args) {
		List<Employee> l1 = Arrays.asList(new Employee(10,"harshita",1200.00),new Employee(2,"harshit",1200.00),new Employee(1,"hemant",1200.00),new Employee(4,"shaila",12300.00));
		System.out.println(l1);
		TreeSet<Employee> ts1 = new TreeSet<>(l1);
		System.out.println(ts1);
		for(Employee e:ts1)
		{
			System.out.println(e);
		}
		
		

	}

}
