package javabasic;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		
		
		//string can be create in two way with new and with out new.
			// if we create string with out new keyword it store in String pool or it store in heap memory
	String firstname = new String("India");
	String Lastname = " Bharath";
	String FullStr = "Bharat@India";
	//length,concat(),charAt,equals
	int lengthN =firstname.length();
	System.out.println(lengthN);
	//charAT
	char s = firstname.charAt(2);
	System.out.println(s);
	//concat
	System.out.println("Welcome to "+firstname.concat(Lastname));
	//uppercasr
	firstname.toUpperCase();
	String t = firstname.toUpperCase();
	String g = Lastname.toLowerCase();
	System.out.println(firstname);
	//subString 
	String u = Lastname.substring(0,6);
	System.out.println(t+" "+g+" "+u);
	//StringBuffer
	StringBuffer i = new StringBuffer("Jalaj");
	i.reverse();
	System.out.println(i);
	i.insert(5, 'a');
	i.insert(6, 6);
	System.out.println(i);
	//contains 
	if(u.contains("&")) 
		System.out.println("Y");
	else
		System.out.println("N");

		if(FullStr.endsWith(firstname)) 
		if(FullStr.startsWith(firstname))
			System.out.println("Y");
		else
			System.out.println("N");
		
		Scanner o = new Scanner(System.in);
		System.out.println("enter the data");
		String line =o.nextLine();
		String arr[]= line.split(",");
				for(String r:arr) {
					System.out.println(r);
				}
}
}
