package com.practiceLoops;

public class ChildClass extends ParentClass{
	
	public ChildClass() {
		
		System.out.println("ChildClass constructor");
	}
	
	public ChildClass(String s) {
		super(s);
		System.out.println("ChildClass constructor" + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass class1 = new ChildClass();
		ChildClass class2 = new ChildClass("Test");
		
		

	}

}
