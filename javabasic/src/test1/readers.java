package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class readers {
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("enter value 1&2:");
		int a,b;
		a=v.nextInt();
		b=v.nextInt();
		System.out.println(a+b);
		
		if(v.hasNextDouble()) {
			System.out.println("hi dimple");
		}
        char c = v.next().charAt(1);
                                // here this is the indexing of the element to take //
        System.out.println("c = "+c);
}

	private static  Object hasNextDouble() {
		// TODO Auto-generated method stub
		return null;
	}
}