package com.carDealership.car;

import java.util.Arrays;

public class Dealership {

	Car2[] cars;

//	 here,if we assign ,this.cars= cars
	// then it the reference to the array of car2 objects will be shared by both
	// this.cars & cars
	// & if we make changes in any object it would affect both.
	// so,we need to do deep copying here.
	// so, we used Arrays.copyof(cars,cars.length)
	// so,this will copy all the cars to this.cars. so,both this.cars & cars will
	// not share same ref.
	// even after that each index of cars[] is hoiding individual ref to car2 object
	// will be shared.
	// to solve this, we must copy each & every single element in each index. this
	// is called deep copying.

	public Dealership(Car2[] cars) {
		this.cars = new Car2[cars.length];
		for (int i = 0; i < this.cars.length; i++) {
			this.cars[i] = new Car2(cars[i]);
		}

		this.cars = Arrays.copyOf(cars, cars.length);
	}
	
	public String toString() {
		String temp = "";
		for (int i = 0; i < this.cars.length; i++) {
			temp += "Parking Spot: " + i + "\n";
			String carDescription = this.cars[i].toString();
			temp += carDescription + "\n";
		}
		return temp;
	}
	
	public Car2 getCar2(int index) {
		return this.cars[index];
	}
	
	public void setCar2(int index,Car2 newCar) {
		this.cars[index] = newCar;
	}
	
	public void sell(int index) {
		this.cars[index].drive();
	}


	
}
