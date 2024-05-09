package com.tnsif.interfacese;

public class ExtendingInterfaceDemo implements ChildInterface,InterfaceOne{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		ExtendingInterfaceDemo obj = new ExtendingInterfaceDemo();
		obj.print();
		obj.show();
	}
}