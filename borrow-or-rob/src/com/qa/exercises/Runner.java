package com.qa.exercises;

public class Runner {

	public static boolean palindrome(String input) {
		String forwards = "";
		for (int i = 0; i < input.length(); i++) {
			if (!input.substring(i,i+1).equals(" ")) {
				forwards+=input.substring(i,i+1);
			}
		}
		
		String rev = "";
		for (int i = forwards.length()-1; i >= 0; i--) {
			rev+=forwards.substring(i,i+1);
		}
		
		return (forwards.equalsIgnoreCase(rev));
	}
	public static void main(String[] args) {
		System.out.println(palindrome("K ayak"));
		System.out.println(palindrome("hello"));
	}
}
