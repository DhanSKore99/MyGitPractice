package com.practiceLoops;

public class LoanDetails {
	
	//Constructor use in calculating basic loan & intrest.
	
	private int term;
	private double rate;
	private double principle;
	
	public LoanDetails() {
		term = 180;
		rate = .0265;
		principle =0;
	}
	
	public void setPrinciple(double p) {
		principle = p;
	}
	
	public double monthlyPayment() {
		return(rate*principle/12) / (1.0 - Math.pow(((rate/12) + 1.0), (-term)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanDetails details = new LoanDetails();
		details.setPrinciple(200000);
		System.out.println("payment: " + details.monthlyPayment());
		

	}

}
