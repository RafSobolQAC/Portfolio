package com.qa.exercises;

public class Runner {
	public static int factorial(int input) {
		int ret = 1;
		for (int i = 1; i <= input; i++) {
			ret *= i;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
	
}
