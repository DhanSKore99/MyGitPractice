package com.practiceLoops;

import java.util.Arrays;

public class Remove2sMultiplesInArray {

	public static void main(String[] args) {
		// remove 2's multiples from given array
		
		int [] originalArray= {1,2,3,4,5,6,7,8,9};
		
		int[] result = remove(originalArray);
		
		System.out.println("Answer is : " + Arrays.toString(result));
		
		

	}
	
	public static int[] remove(int[]array) {
		
		int[] newArray = new int[5];
		int index=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				continue;			}
			else {
				newArray[index]=array[i];
				index++;

			}
		}
		return newArray;
	}

}
