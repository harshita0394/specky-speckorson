package com.core.runnable;

import java.util.ArrayList;

import com.app.core.Department;
import com.app.core.Employee;
import static com.core.utils.DepartmentUtils.*;
public class SortBySalaryThread implements Runnable {
	private Department dpt;
	
	public SortBySalaryThread(Department dpt) {
		super();
		this.dpt = dpt;
	}
	@Override
	public void run() {
		ArrayList<Employee> emp = dpt.getEm();
		sortEmpBySalary(emp);

	}

}
