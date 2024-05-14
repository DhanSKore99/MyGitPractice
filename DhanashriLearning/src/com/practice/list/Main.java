package com.practice.list;
// class Person & class Main
class Person{
	    private String name;
	    private String nationality;
	    private String dateOfBirth;
	    private String[] passport;
	    private int seatNumber;
	    private String[] allowedCountries = {"India","USA"};
	    
		
		public Person(String n, String nt, String dob, String[] p, int s) {
			this.name = n;
			this.nationality = nt;
			this.dateOfBirth = dob;
			this.passport = p;
			this.seatNumber = s;
		}
		
		public Person(Person p) {
			this.name = p.name;
			this.nationality = p.nationality;
			this.dateOfBirth = p.dateOfBirth;
			this.passport = p.passport;
			this.seatNumber = p.seatNumber;
		}
		 
	    
	    public String getName() {
	    	return this.name;
	    }
	    
	    public String getNationality() {
	    	return this.nationality;
	    }
	    
	    public String getDOB() {
	    	return this.dateOfBirth;
	    }
	    
	    public int getSeatNo() {
	    	return this.seatNumber;
	    }
	    
	    public String[] getPassport() {
	    	return this.passport;
	    }
	    
	    public void printPassport() {
	    	for(String s:passport) {
	    		System.out.println(s);
	    	}
	    }
	    
	    
	    public void setName(String name) {
	    	this.name= name;
	    }
	    
	    public boolean setNationality(String nationality) {
	    	for(String s: allowedCountries) {
	    		if(s.equals(nationality)) {
	    			this.nationality= nationality;
	    			return true;
	    		}
	    	}
	    	return false;
	    	
	    	
	    }
	    
	    public void setDOB(String dob) {
	    	this.dateOfBirth = dob;
	    }
	    
	    public void setSeatNo(int seatNo) {
	    	this.seatNumber = seatNo;
	    }
	    
	    //write a method travel()
	    public void travel() {
	    	System.out.println("Have a safe trip " + this.name + " to " + this.nationality);
	    }
	   
	    
	    public boolean applyPassport() {
	    	int number = (int) (Math.random() * 2);	   
	    	System.out.println(number);
	    	System.out.println( 1== number);
	    	return 1 == number;	    	
	    }
	    
	    public void chooseSeat() {
	    	int seatNumber = (int) (Math.random() * 11 + 1); 
	    	this.seatNumber = seatNumber;
	    }

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] passports = {"p1","p2"};
		Person p = new Person("ana","Indian","1/12/2022",passports,10);
		System.out.println(p.getName());
		System.out.println(p.getNationality());
		System.out.println(p.getDOB());
		p.printPassport();
		System.out.println(p.getSeatNo());
		
		System.out.println(p.setNationality("Pakistan"));
		System.out.println("Printing info of p2 by copy constructor");
		
		
		Person p2 = new Person(p);
		System.out.println(p.getName());
		System.out.println(p.getNationality());
		System.out.println(p.getDOB());
		p.printPassport();
		System.out.println(p.getSeatNo());
		
		System.out.println("After modifying p2 by setter method");
		p2.setName("Ram");
		p2.setSeatNo(22);
		System.out.println("Name:" +p2.getName()  + " Nationality:" +p2.getNationality()
		+ " DOB:" + p2.getDOB() + " SeatNo:" + p2.getSeatNo());
		
		System.out.println("Name:" + p.getName()  + " Nationality:" + p.getNationality()
		+ " DOB:" + p.getDOB() + " SeatNo:" + p.getSeatNo());
		
		p.travel();
		p2.travel();
		
		System.out.println(p.applyPassport());
		
		Person p3 = new Person("Rayan Slim", "Canadian", "01/01/1111",passports, 5);
		p3.chooseSeat();
		System.out.println("updated seat is :" + p3.getSeatNo());
		
		if(p3.applyPassport()) {
			System.out.println("Congratulations " + p3.getName() + "your passport is issued");
		}else {
			System.out.println("sorry " + p3.getName() + " we cant proceed your passport.");
		}
	}

}
