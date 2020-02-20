package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	
	public static int powN(int num, int power) {
		return (int) Math.pow(num, power);
	}
		
	public static int sumAll(List<Integer> a) {
		int sum = 0;
		int power = a.size();
		for (int i : a) {
			sum+=powN(i, power);
		}
		return sum;
	}
	
	public static int isArmstrong(int toTest) {
		List<Integer> digits = new ArrayList<>();
		int origToTest = toTest;
		while (toTest!=0) {
			digits.add(toTest%10);
			toTest/=10;
		}
		if (sumAll(digits) == origToTest) return origToTest;
		
		else return -1;
	}
	
	public static List<Integer> armstrong(int max) {
		List<Integer> ret = new ArrayList<>();
		for (int i = 0; i <= max; i++) {
			int temp = isArmstrong(i);
			if (temp!=-1) ret.add(temp);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(armstrong(10000000));
	}
}
