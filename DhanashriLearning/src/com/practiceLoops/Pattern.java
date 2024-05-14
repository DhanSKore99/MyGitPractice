package com.practiceLoops;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print an array of 5 rows & 5 columns
		int r=5;
		int c=5;
		
		
		  //print outer loop 
		  for(int i=1;i<=r;i++) { //print inner loop 
		  for(int j=1;j<=c;j++) { System.out.print("*"); } 
		  System.out.println(); }
		 
		
		
		//print an array of stars in ascending order upto 5 rows
		
	//	*   
	//	**
	//	***
	//	****
	//	*****
		int row = 5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print reverse pyramid starts..
		// *****
		// ****
		// ***
		// **
		// *
		
		
		int row1 = 5;
		
		for(int i= 1;i<=row1;i++) {
			for(int j=row1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
