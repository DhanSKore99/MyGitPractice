package com.practiceLoops;


public class StudentClass {
	
	static int studentId = 12;
	
	private int newStudentId;
	
	public StudentClass() {
		System.out.println("inside student class constructor:");
		this.newStudentId = studentId;
		studentId++;
	}
	
	public int getNewStudentId() {
		return newStudentId;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass student1 = new StudentClass();
		int id1 =student1.getNewStudentId();
		System.out.println(id1);
		
		StudentClass student2 = new StudentClass();
		int id2 =student2.getNewStudentId();
		System.out.println(id2);
		
		StudentClass student3 = new StudentClass();
		int id3 =student3.getNewStudentId();
		System.out.println(id3);
		

	}

}
