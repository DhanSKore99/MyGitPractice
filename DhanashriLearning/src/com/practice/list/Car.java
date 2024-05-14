package com.practice.list;

class Car1{
private int fuelLevel;
	
	public Car1(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public Car1(Car1 car) {
		this.fuelLevel = car.fuelLevel;
	}
	
	public int getFuelLevel() {
		return this.fuelLevel;
	}
	
	public void setFuelLevel(int level) {
		this.fuelLevel=level;
	}

}
public class Car {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 nisaan = new Car1(100);
		
		System.out.println("Fuel level of nisaan is:" + nisaan.getFuelLevel());
		
		nisaan.setFuelLevel(0); 
		System.out.println("Fuel level of nisaan is:" + nisaan.getFuelLevel());
		
	
		
		Car1 mercedes = new Car1(nisaan);
		System.out.println("Fuel level of mercedes is:" + mercedes.getFuelLevel());
		mercedes.setFuelLevel(100);
		System.out.println("Fuel level of mercedes is:" + mercedes.getFuelLevel());
		System.out.println("Fuel level of nisaan is:" + nisaan.getFuelLevel());
		
	
		

	}

}
