package com.practiceLoops;

public class Car {
	
	private String model;
	private String color;
	private int speed;
	
	
	public Car(String model,String color, int speed){
			this.model = model;
			this.color = color;
			this.speed = speed;}
	
	public Car() {
		this("Nissan rogue", "metallic gray" , 100);
	}
	
	public int calculateSpeed(int s, int time) {
		return(s*time/2);
	}
	
	public int getSpeed() {
		return(this.calculateSpeed(speed, 60));
	}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		int myCarSpeed = myCar.getSpeed();
		System.out.println(myCarSpeed);

	}

}
