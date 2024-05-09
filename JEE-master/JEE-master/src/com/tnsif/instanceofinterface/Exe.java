package com.tnsif.instanceofinterface;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("mi"); 
		p1.call();
		p1.sms();
	}

}
