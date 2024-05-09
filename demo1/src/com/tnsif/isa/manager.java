package com.tnsif.isa;

public class manager extends Employee {
	private int teamSize;
	
		public manager() {
			super();
		}
		public manager(String name, int employeeId, String department, int teamSize) {
			super(name, employeeId, department);
			this.teamSize = teamSize;
		}
		public int getTeamSize() {
			return teamSize;
		}
		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}
		@Override
		public void display() {
			System.out.println("Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
			+ ", Department=" + getDepartment() + "]");
		}
}
