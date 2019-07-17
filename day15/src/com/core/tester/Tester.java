package com.core.tester;
import static com.core.utils.DepartmentUtils.populateData;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Department;
import com.core.runnable.SortByDateThread;
import com.core.runnable.SortBySalaryThread;
public class Tester {

	public static void main(String[] args) {
		 HashMap<String,Department> deptMap = populateData();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Department id to sort employees by salary");
		 Department d1 = deptMap.get(sc.next());
		 System.out.println("Enter Department id to sort employees by date");
		 Department d2 = deptMap.get(sc.next());
		 Thread t1 = new Thread(new SortBySalaryThread(d1));
		 Thread t2 = new Thread(new SortByDateThread(d2));
		 t1.start();
		 t2.start();
	}

}
