package com.tnsif.finallyblock;

public class FinallyBlockExOne {

	
	public static void divide(int a ,int b) {
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("i am in a final method");
			
			int i =100;
			int j =50;
			System.out.println(i/j);
			
		}
	}
}
