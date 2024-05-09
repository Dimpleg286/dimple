package BasicOfJava;

import java.util.Scanner;

public class importsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		
		
Scanner v = new Scanner(System.in);
System.out.println("enter a value 1: ");
int a=v.nextInt();
System.out.println("enter a value 2: ");
int b=v.nextInt();
 
importsexamples j = new importsexamples();
j.add(a, b);
j.mul(a, b);


	}
public void add(int a,int b) {
	System.out.println(a+b);
}
public void sub(int a,int b) {
	System.out.println(a-b);
}
public void mul(int a,int b) {
	System.out.println(a*b);
}
public void div(int a,int b) {
	System.out.println(a/b);
}
}
