package com.tnsif.dayone;

import java.util.Arrays;

public class dayoneprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 10, 20, 30, 40, 50 }; // initialization at the time of declaration
		dayoneprogram.printArray(b);
		System.out.println("sum of array elements is : " + dayoneprogram.getSum(10, 20));
		System.out.println("Odd numbers : " + dayoneprogram.getOddCount(b) + "\tEven numbers : "
				+ dayoneprogram.getEvenCount(b));
	}
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
	}
	public static int getSum(int... n) {
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;
	}
	public static int getOddCount(int b[])
	{
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 != 0)
				count++;		
		}
		return count;
	}
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
	}
	
}
