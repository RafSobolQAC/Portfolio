package com.qa.exercises;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {
	public static String uniqueString(String input) {
		
		return Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining(""));
		
		
//		String ret = "";
//		boolean isUnique = true;
//		for (int i = 0; i < input.length(); i++) {
//			for (int j = 0; j < ret.length(); j++) {
//				if (input.substring(i,i+1).equals(ret.substring(j,j+1))) {
//					isUnique = false;
//					break;
//				}
//			}
//			if (isUnique) ret+=input.substring(i,i+1);
//			isUnique = true;
//		}
//		return ret;
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(uniqueString("Hello Everyone"));
	}
}
