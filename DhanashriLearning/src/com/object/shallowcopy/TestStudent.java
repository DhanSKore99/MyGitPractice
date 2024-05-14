package com.object.shallowcopy;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12);
		System.out.println("s1:"+ s1.getRollNo());
		Student s2 = new Student(33);
		System.out.println("s2:"+ s2.getRollNo());
		Student s3 = s1;
		System.out.println("After chenging the value..");
		s1.setRollNo(22);
		System.out.println("s1:"+ s1.getRollNo());
		System.out.println("s2:"+ s2.getRollNo());
		System.out.println("s3:" + s3.getRollNo());

	}

}
