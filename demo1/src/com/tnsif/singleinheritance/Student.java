package com.tnsif.singleinheritance;

public class Student extends Citizen{
	
	private int rollNo;
	
	public Student(String string) {
		
	}
	
	public Student(int rollNo,String name,String aadharNo,String address,long phno) {
		super(name,aadharNo,address,phno);
		this.rollNo=rollNo;
		
	}	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", getName()=" + getName() + ", getAadharNo()=" + getAadharNo()
				+ ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
