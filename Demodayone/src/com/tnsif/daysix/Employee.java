package com.tnsif.daysix;

public class Employee {
	private String name;
	private int employeeId;
	private String department;
	
	public Employee(String name, int employeeId, String department) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
	}
	
	public Employee() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", department=" + department + "]";
	}

	
}
