/**
 * 
 */
package com.practice.list;

import java.util.ArrayList;

/**
 * @author shash
 *
 */
public class HelloArrayList {


	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("cat");
		al.add("dog");
		al.add("bull");
		
		
		
		//al.set(0, al.get(0).toUpperCase());
		int index=0;
		for(String s:al) {
			String temp =s.toUpperCase();
			al.set(index, temp);
			index++;
		}
		
		System.out.println(al);
		
		
		/*
		 * ArrayList<String> newList = new ArrayList<>();
		 * 
		 * for(String s:al) { newList.add(s.toUpperCase()); }
		 * 
		 * System.out.println(newList);
		 */
		

	}

}
