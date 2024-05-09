package com.tnsif.instanceofinterface;

public class Samsung implements Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Samsung");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("sms using Samsung");
	}

}
