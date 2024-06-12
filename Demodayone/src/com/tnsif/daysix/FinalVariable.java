package com.tnsif.daysix;

public class FinalVariable {
	final int x = 100;
	final static int Y;
	void change() {
		x = 30; // final variables can't be reassigned
		Y = 200; // final static variables can't be reassigned
	}
}
