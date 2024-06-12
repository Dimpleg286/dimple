package com.tnsif.dayfour.firstpackage;

public class Executor {
	public static void main(String[] args) {
		
		Base v = new Base();
		v.varDefault=11;
		v.methodDefault();
		v.methodPublic();
		v.varProtected=31;
		v.methodProtected();
		//v.varPrivate=21; 
		//v.methodPrivate();
		v.varProtected=31;
		v.methodProtected();
		
		v.varPublic=41;
		v.methodPublic();
		
	}
}
	
