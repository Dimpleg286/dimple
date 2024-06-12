package com.tnsif.daysix;

public class Manager extends Employee{
	private int teamSize;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int employeeId, String department) {
		super(name, employeeId, department);
		this.teamSize = teamSize;
		// TODO Auto-generated constructor stub
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getTeamSize()=" + getTeamSize() + ", getName()=" + getName()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getDepartment()=" + getDepartment() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
