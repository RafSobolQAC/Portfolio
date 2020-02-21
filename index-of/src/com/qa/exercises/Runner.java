package com.qa.exercises;

public class Runner {
	public static int indexOf(char c, String s) {
		int ret = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				ret = i;
				break;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(indexOf('c',"acetc"));
	}
}
