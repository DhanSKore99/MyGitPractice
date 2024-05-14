package com.practiceLoops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 5;
		int column = 9;
		int k = 1;
		int mid = column/2;
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(j > mid-k && j <mid+k) {
					System.out.print("*");
				}
				else {
					System.out.print("-");
				}
			}
			k=k+1;
			System.out.println();
		}

	}

}
