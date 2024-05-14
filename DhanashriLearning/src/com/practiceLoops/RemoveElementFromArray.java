package com.practiceLoops;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
	
	

	public static void main(String[] args) {
		// Remove an element from an array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element which you want to be removed from an array:");
		int[] originalArray = {1,2,3,4,5};
		
		int elementToBeRemoved = sc.nextInt();
		
		int[] myNewArray = removeElement(originalArray, elementToBeRemoved);
		
		System.out.println("Origional array :" + Arrays.toString(originalArray));
		System.out.println("Modified Array :" + Arrays.toString(myNewArray));
		
		
		/*
		 * for(int i=0;i<myNewArray.length;i++){ System.out.print("My new Array : " +
		 * myNewArray[i]); }
		 */
		
		
	}
	
	public static int[] removeElement(int[]array,int element) {
		int[] newArray = new int[array.length-1];
		int index=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=element) {
				newArray[index]=array[i];
				index++;
			}
		}
		return newArray;
		
	}
	

}
