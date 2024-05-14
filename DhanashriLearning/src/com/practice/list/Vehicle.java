package com.practice.list;

import java.util.Arrays;

public class Vehicle {
	private String make;
	private double price;
	private int year;
	private String color;
	private String[] parts;
	
	public Vehicle(String make,double price,int year,String color,String[]parts) {
		this.make = make;
		this.price = price;
		this.year = year;
		this.color = color;
		this.parts = Arrays.copyOf(parts, parts.length);
	}
	
	public Vehicle(Vehicle v) {
		this.make= v.make;
		this.price = v.price;
		this.year = v.year;
		this.color = v.color;
	//	this.parts= v.parts; //this is an object ref variable means,both will share same reference
		//to the array.& if we make any change in array using any ref.the other will also get impacted.
		//to overcome this problem, we use copyarray() to fix this problem.
		
		this.parts = Arrays.copyOf(v.parts, parts.length);
	}
	
	public String getMake() {
		return make;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public String[] getParts() {
		return parts;
	}
	
	public void setMake(String make) {
		this.make= make;
	}
	
	public void setPrice(double price) {
		this.price= price;
	}
	public void setYear(int year) {
		this.year= year;
	}
	
	public void setColor(String color) {
		this.color= color;
	}
	
	public void setParts(String[]parts) {
		this.parts=parts;
	}

}
