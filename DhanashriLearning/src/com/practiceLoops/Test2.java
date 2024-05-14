package com.practiceLoops;

public class Test2 {
	
	//pass by value & pass by reference examples:
	
	public static void changeValue(int value) {
		value = value*5;
		System.out.println(value);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 12;
		changeValue(x);
		System.out.println(x);
		
		
	}

}
