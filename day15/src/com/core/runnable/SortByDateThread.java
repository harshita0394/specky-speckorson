package com.core.runnable;

import static com.core.utils.DepartmentUtils.sortEmpByHireDate;

import java.util.ArrayList;

import com.app.core.Department;
import com.app.core.Employee;

public class SortByDateThread implements Runnable {

		private Department dpt;
		
		public SortByDateThread(Department dpt) {
			super();
			this.dpt = dpt;
		}
		@Override
		public void run() {
			ArrayList<Employee> emp = dpt.getEm();
			sortEmpByHireDate(emp);

		}


	}


