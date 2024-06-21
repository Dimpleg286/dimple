package com.tnsif.staticvariable;

public class Mlarray {
public static void main(String[] args) {
	int c[][] = { { 12, 45 }, { 10, 40 }, { 5, 7 } };
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++)
			System.out.print(c[i][j] + " ");
		System.out.println();
	}
}
}
