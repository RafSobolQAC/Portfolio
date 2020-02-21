package com.qa.exercises;

public class Runner {
	public static int primeNums(int max) {
		int ret = 0;
		boolean breaker = false;
		if (max < 2) return ret;
		if (max >= 2) ret++;
		for (int i = 3; i <= max; i+=2) {
			for (int j = 3; j <= (int) Math.sqrt(i); j+=2) {
				if (i%j == 0) breaker=true;
			}
			if(!breaker) ret++;
			breaker=false;
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(primeNums(11));
	}
}
