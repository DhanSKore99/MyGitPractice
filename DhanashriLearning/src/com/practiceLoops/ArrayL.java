package com.practiceLoops;
import java.util.ArrayList;
public class ArrayL {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	    list.add(6);
	    
	   ArrayList<Integer> ans = ArrayL.remove(list);
	   
	   for(int i:ans) {
		   System.out.println(i);
	   }
	    
	}
	
	public static ArrayList<Integer> remove(ArrayList<Integer> a){
		
		ArrayList<Integer> newList = new ArrayList<>();
		int index=0;
		for(int i:a) {
			if(i % 2 !=0) {
				newList.add(i);
			}
		}
		return newList;
	}

}
