package com.qa.exercises;

public class Runner {
	public static String fizzBuzzPopSnap(int num) {
		String ret = "";
		if (num%3==0) ret+="Fizz";
		if (num%5==0) ret+="Buzz";
		if (num%7==0) ret+="Pop";
		if (num%11==0) ret+="Snap";
		if (ret.equals("")) ret+=num;
		return ret;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(fizzBuzzPopSnap(i));			
		}
	}
	
	
}
