package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class scannerex1 {
public static void main(String[] args) throws IOException {
	Scanner v = new Scanner(System.in);
	String a="dimpel";
	char a1 = v.next().charAt(4);
	System.out.println(a1);	
	//boolean a=v.hasNext();
	System.out.println(a);
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	 
	 System.out.println("Enter a String");	 
     String b = br.readLine();
     System.out.println(b);
}
}
