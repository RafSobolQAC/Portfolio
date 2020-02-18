package com.qa.exercises;

public class Runner {
	public static boolean find(String s, int i, char c) {
		return s.toCharArray()[i-1] == c; 
//		return s.charAt(i-1) == c;
	}
	public static void main(String[] args) {
		System.out.println(find("Trash",4,'s'));
	}
}
 