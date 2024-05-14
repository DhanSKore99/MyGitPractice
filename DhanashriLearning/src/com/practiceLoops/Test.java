package com.practiceLoops;

public class Test {
	
	public static void test(int rows) {
		for(int i =0;i<rows;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.test(5);

	}

}
