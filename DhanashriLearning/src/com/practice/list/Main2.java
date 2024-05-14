package com.practice.list;
//class Vehicle & class Main2 
public class Main2 {

	public static void main(String[] args) {
		// Vehicle class ref.here.
         String[] spareParts = new String[]{"keys","tires"};
		Vehicle car1 = new Vehicle("Nisaan",11000,2020,"Blue", new String[]{"keys","tires"});
		Vehicle car2 = new Vehicle("Mercedes",50000,2024,"white", new String[]{"keys","tires"});
		Vehicle car3 = new Vehicle(car2);
		
	}

}
