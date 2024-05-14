package com.practice.list;
//class Person1 & class Main1
class Person1 {
	private String name;
	private String nationality;
	private String dateOfBirth;
	private String[] passport;
	private int seatNumber;

	// create a constructor
	public Person1(String name, String nationality, String dob, String[] passport, int seatNo) {
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dob;
		this.passport = passport;
		this.seatNumber = seatNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public String getDOB() {
		return dateOfBirth;
	}
	
	public String[] getPassport() {
		return passport;
	}
	
	public void printPassport(String[] p) {
		for(String i:p) {
			System.out.println(i);
		}
	}
	
	public int getSeatNo() {
		return seatNumber;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setDateOfBirth(String dob) {
		this.dateOfBirth=dob;
	}
	
	public void setPassport(String[] arrayOfPassport) {
		this.passport= arrayOfPassport;
	}
	
	public void setSeatNo(int seatNo) {
		this.seatNumber = seatNo;
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] availablePassports = { "India", "USA" };
		Person1 p1 = new Person1("Alis", "American", "12/03/1990", availablePassports, 3);
		System.out.println(p1.getName());
		System.out.println(p1.getNationality());
		System.out.println(p1.getDOB());
		p1.printPassport(availablePassports);
		System.out.println(p1.getSeatNo());
		
		p1.setSeatNo(10);
		System.out.println("After updating the seatNo..");
		System.out.println(p1.getName());
		System.out.println(p1.getNationality());
		System.out.println(p1.getDOB());
		p1.printPassport(availablePassports);
		System.out.println(p1.getSeatNo());
		
		
	}

}
