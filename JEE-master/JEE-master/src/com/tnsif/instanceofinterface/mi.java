package com.tnsif.instanceofinterface;

public class mi implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling using mi");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("sms using mi");
	}

}
