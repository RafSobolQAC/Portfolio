package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static List<Integer> oddity(int[] nums) {
		List<Integer> ret = new ArrayList<>();
		for (int i : nums) {
			if (i%2 != 0) ret.add(i);
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1,2,3,4,5,6};
		System.out.println(oddity(nums));
	}
}
