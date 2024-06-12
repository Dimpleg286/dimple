package com.tnsif.array;

public class ArrayOperations {
	
	
	// variable argument function
		public static int getSum(int... n) {
			int sum = 0;
			for (int no : n)
				sum += no;
			return sum;
		}
	public static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}}
	
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
