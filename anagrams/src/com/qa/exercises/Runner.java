package com.qa.exercises;

import java.util.Arrays;

public class Runner {
	public static boolean anagrams(String a, String b) {
		char[] arrayA = a.toLowerCase().toCharArray();
		char[] arrayB = b.toLowerCase().toCharArray();
		Arrays.parallelSort(arrayA);
		Arrays.parallelSort(arrayB);
		
		return (Arrays.equals(arrayA, arrayB));
		
	}
	public static void main(String[] args) {
		System.out.println(anagrams("Hello","Loleh"));
	}
	
}
