package com.tnsif.daysix.usingfinal;



final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}}

//class FinalChildClass extends FinalClass {
	
//}
public class FinalClassDemo {
	public static void main(String[] args) {
		FinalClass obj = new FinalClass();
		System.out.println(obj);
	}

}
