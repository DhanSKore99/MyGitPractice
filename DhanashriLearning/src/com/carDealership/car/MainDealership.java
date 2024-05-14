package com.carDealership.car;

import java.util.Scanner;

public class MainDealership {
	// Car2[] cars is an array of Car2 objects.
	// so, in car ,the reference to the Car2[]objects will be stored.
	// like cars[0] will store a reference to 1st car2 object.etc..
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
	Car2[] cars = new Car2[] { new Car2("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
			new Car2("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
			new Car2("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
			new Car2("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
			new Car2("Mercedes", 12000, 2015, "jet black", new String[] { "tires", "filter", "transmission" }) };

	Dealership dealership = new Dealership(cars);
	
     System.out.println("\n ****** JAVA DEALERSHIP ******\n ");
     System.out.println("Feel free to brows through our Collection of Cars. \n");
     System.out.println(dealership);
     System.out.println("WHich cars you are intrested in? (0 – 4).\n ");
     int index = sc.nextInt();
     
     //Sell car here
     dealership.sell(index);
     
     sc.close();
}
}