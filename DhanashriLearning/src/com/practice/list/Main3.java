package com.practice.list;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arrayOfPassport = new String[3];
		Person3 p3 = new Person3("Ryan slim","canadian","01/01/1111",5);
		System.out.println("Name: "+ p3.getName() + "\n" +
						   "Nationality: " + p3.getNationality() + "\n" +
						   "DateOfBirth " + p3.getDateOfBirth() + "\n"
						   		+ "SeatNo " + p3.getSeatNo() + "\n" + p3.getPassport().toString());
		
		p3.setPassport();
		System.out.println("after setting passport..");
		System.out.println(p3);
		
		Person3 p4 = new Person3("Ryan slim","canadian","01/01/1111",5);
		System.out.println(p4);

	}
	
	

}
