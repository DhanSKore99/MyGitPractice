package com.carDealership.car;

import java.util.Arrays;

//class Car2 & class Dealership are together
public class Car2 {
	private String make;
	private double price;
	private int year;
	private String color;
	private String[] parts;

	public Car2(String make, double price, int year, String color, String[] parts) {
		super();
		this.make = make;
		this.price = price;
		this.year = year;
		this.color = color;
		this.parts = parts;
	}
	
	public Car2(Car2 c) {
		this.make = c.make;
		this.price = c.price;
		this.year= c.year;
		this.color= c.color;
		this.parts = Arrays.copyOf(c.parts,c.parts.length);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getParts() {
		return parts;
	}

	public void setParts(String[] parts) {
		this.parts = Arrays.copyOf(parts, parts.length);
	}
	
	
	public String toString() {
		return "Make: " + this.make + ".\n" 
	            +  "Price: " + this.price + ".\n"
	            +  "Year: " + this.year + ".\n"
	            +  "Color: " + this.color + ".\n"
	            +  "Parts: " + Arrays.toString(parts) + ".\n";

	}
	
	public void drive() {
		System.err.println("You have bought a beautiful " + this.year + " "+  this.make + " car. ");
		System.out.println("please drive it to the nearest exit.");
	 }
	

}