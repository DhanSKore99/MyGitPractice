package com.practice.list;

import java.util.Arrays;

//class Person3 & class Main3

public class Person3 {
	private String name;
	private String nationality;
	private String dateOfBirth;
	private int seatNo;
	private String[] passport;
	
	public Person3(String name,String nationality,String dob,int seatNo) {
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dob;
		this.seatNo = seatNo;
		this.passport = new String[3];
		}
	//write getter method over passport .it should return a copy of array.
	
	public String[] getPassport() {
		return Arrays.copyOf(passport, passport.length);
	}
	
	public String getName() {
		return name;
	}
	public String getNationality() {
		return nationality;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public int getSeatNo() {
		return seatNo;
	}
	
	public void setPassport() {
		this.passport = new String[] {this.getName(),this.getNationality(),this.getDateOfBirth()};
	}
	
	//overload the toString method
	
	public String toString() {
		return "Name: " +this.name + "\n" + "Nationality: " + 
				this.nationality + "\n" + "Date of Birth: " + 
				this.dateOfBirth + "\n" + "Seat Number: " +
				this.seatNo + "\n" + "Passport: " + 
				Arrays.toString(this.passport) + "\n" ;
	}

}
