package exceptionsInJava;
import java.io.BufferedReader;
import java.io.Reader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class tryCatch {
	// 
	public static void main(String[] args) {
		
		//Reader fr;
		
		
	int x =10;
	int y=0;
	int c=0;
	try {
	c=x/y;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	System.out.println(c);
	System.out.println("Hi dimple ");
	}
}
