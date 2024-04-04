package BasicOfJava;

import java.util.Scanner;

public class Datatypes {
/*identifiers:they are used to name in java program is know as identifiers
 which can be used for identification it can be class name, method name,
 variable name, lable name */
	
/*java comments:Comments improve the readability of the code and makes the 
code more clear and understandable. Comments are ignored by the Compiler. 
singleline //,multiline/*--*/   //  document/**---*/ 

/*keywords:they are also called reserved words they have special meaning in 
 programming language and they cannot be used as identifiers */

/*recognize Datatype
 * nonprementive datatype A reference variable is used to refer to any object 
of the declared type or the compatible type. 
Example: String s=new String("balloon"); */
	
//applyCasting and conversion
	public static void main(String[] args) {
		
	
	 String c = "Dimple";
	 char p = 67;// Integer data type is generally
	        // used for numeric values
	        int i = 89; // use byte and short
	        // if memory is a constraint
	        byte b = 127;// b++;
	       // b+=2;
	       b+=5;
	        System.out.println(b);
	        // this will give error as number is
	        // larger than byte range
	        // byte b1 = 7888888955;
	 
	        short s = 5000;
	        
	        s++;
	        
	        // this will give error as number is
	        // larger than short range
	        // short s1 = 87878787878;
	 
	        // by default fraction value
	        // is double in java
	        double d = 43433455566.35545353452;
	 
	        // for float use 'f' as suffix as standard
	        float f = 4.733343234f;
	       
	          //need to hold big range of numbers then we need this data type
	        long l = 12121;
	            
	        System.out.println("char: " + c);
	        System.out.println("char: " + p);
	        System.out.println("integer: " + i);
	        System.out.println("byte: " + b);
	        System.out.println("short: " + s);
	        System.out.println("float: " + f);
	        System.out.println("double: " + d);
	        System.out.println("long: " + l);
	        System.out.println("string: " + c);
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a value1: ");
	       int value1 =scanner.nextInt();
	      
	        System.out.print("Enter a value2: ");
	        int value2 = scanner.nextInt();
	        
int add=value1+value2;
System.out.println("add of two numbers:"+(add));

}}
