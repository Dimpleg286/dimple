package com.tnsif.isa;

public class Employee {
	private String name;
	private int employeeId;
	private String department;
	
	public Employee(){	
		super();
		
	}
	
	public Employee(String name,int employeeId,String department) {
	super();
	this.name=name;
	this.department=department;
	this.employeeId=employeeId;
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
	 public void display() {
		 System.out.println(name+employeeId+department);
	 }
	

}
