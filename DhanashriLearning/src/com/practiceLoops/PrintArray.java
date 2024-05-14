package com.practiceLoops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	public String name;
	public int age;
	
	public Student() {
		System.out.println("Superclass contructor called..");
		this.name= "Dhanashri Kore";
		this.age=33;
	}
}
public class PrintArray extends Student{
	
	String major;
	public PrintArray() {
		super();
		System.out.println("Childclass constructor called..");
		this.major = "computer";
		this.name = "John Doe";
		this.age =50;
		
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(90);
		list.add(10);
		list.add(50);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
		
		System.out.println("Iterating using foreach remaining method");

		Iterator<Integer> newItr = list.iterator();
		newItr.forEachRemaining(element -> System.out.println(element));
		
		/*
		 * Student s1 = new Student(); System.out.println(s1.name);
		 * System.out.println(s1.age);
		 * 
		 * Student s2 = new PrintArray(); System.out.println(s2.name);
		 * System.out.println(s2.age);
		 * 
		 * PrintArray s3 = new PrintArray(); System.out.println(s3.name);
		 * System.out.println(s3.major); System.out.println(s3.age);
		 */
	}

}
