package com.tnsif.daysix;

public class staticexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// diff way of call methode
		// static and non static met
		ptest1();
		ptest12();
		ptest14(12, 89);
	}
	
	// no input and no output
	public static void ptest1() {
		System.out.println("Test1");		
}
	
	// with no input and with output
	public static void ptest12() {
		int a =20;
		int b=90;
		System.out.println(a*b);
		
	}
		// with input and with output
	public static void ptest14(int x ,int y) {
		
		System.out.println(x%y);}
}
