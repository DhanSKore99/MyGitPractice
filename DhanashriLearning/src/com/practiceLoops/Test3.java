package com.practiceLoops;

public class Test3 {
	
	static int x=100 , y=20;
	
	
	
	public static void changeVal(Test3 obj) {
		obj.x = x*6;
		obj.y = y*10;
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 test = new Test3();
		changeVal(test);
		
		System.out.println(test.x);
		System.out.println(test.y);
		
		

	}

}
