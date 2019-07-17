package TreeSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmpTreeSet2 {

	public static void main(String[] args) {
		TreeSet<Employee> ts2 = new TreeSet<>(new Comparator<Employee>()
				{
					@Override
					public int compare(Employee e1, Employee e2)
					{
						return e1.getName().compareTo(e2.getName());
					}
				});
		List<Employee> l1 = Arrays.asList(new Employee(10,"harshita",1200.00),new Employee(2,"harshit",1200.00),new Employee(1,"hemant",1200.00),new Employee(4,"shaila",12300.00));
		ts2.addAll(l1);
		for(Employee e3:ts2)
		{
			System.out.println(e3);
		}
	}

}
