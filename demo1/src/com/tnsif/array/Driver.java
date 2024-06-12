package com.tnsif.array;

public class Driver {
public static void main(String[] args) {
	int b[] = { 10, 21, 34, 44, 59 }; // initialization at the time of declaration
	ArrayOperations.printArray(b);
	System.out.println(ArrayOperations.getEvenCount(b));
	System.out.println(ArrayOperations.getOddCount(b));
	System.out.println(ArrayOperations.getSum(b));

}
}
