package com.app.core;

import java.util.ArrayList;

public class Department {
	private String deptId;
	private String managerName;
	ArrayList<Employee> em;
	public Department(String deptId, String managerName, ArrayList<Employee> em) {
		super();
		this.deptId = deptId;
		this.managerName = managerName;
		this.em = em;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public ArrayList<Employee> getEm() {
		return em;
	}
	public void setEm(ArrayList<Employee> em) {
		this.em = em;
	}
	
	
}
