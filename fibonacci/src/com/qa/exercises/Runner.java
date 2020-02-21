package com.qa.exercises;

public class Runner {
	public static int fibonacciFinder(int num) {
		int pprev = 0;
		int prev = 1;
		if (num==0) return pprev;
		if (num==1) return prev;
		int curr = -1;
		for (int i = 2; i <= num; i++) {
			curr = pprev+prev;
			pprev = prev;
			prev = curr;
		}
		return curr;
		
	}
	public static void main(String[] args) {
		System.out.println(fibonacciFinder(10));
	}
	
}
