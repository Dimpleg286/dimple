package com.tnsif.array;

import java.util.Arrays;

public class Demoarray {
public static void main(String[] args) {
	 int intarry[] = {101,210,3,49,50};
	 ArrayOperations.printArray(intarry);
	 int a[] = new int[7];
	 a[0]=200;
	 a[1]=60;
	 a[4]=900;
	 a[6]=700;
	 
	 //loop
	 for(int i=0;i<a.length;i++) {
		System.out.println(a[i]); 
	 }
	 
	 System.out.println(Arrays.toString(intarry));
	 
	 Arrays.sort(intarry);
	 System.out.println(Arrays.toString(intarry));
	 
	if(Arrays.equals(intarry, a)) {
		System.out.println("Both arrays are equal");
	}else
	{
		System.out.println("Both are not equal");
	}
	 
	int b[]= Arrays.copyOf(intarry, 10);
	System.out.println(Arrays.toString(b));
	
	
	int c[]=Arrays.copyOfRange(intarry, 1, 5);
	System.out.println(Arrays.toString(c));
	
	
	
	Arrays.fill(a, 44);
	System.out.println(Arrays.toString(a));
}
}
