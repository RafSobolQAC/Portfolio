package com.qa.exercises;

public class Runner {
	public static void chickensAndRabbits(int heads, int legs) {
		int chickens = 2*heads-legs/2;
		int rabbits = legs/2 - heads;
		System.out.println("Chickens: "+chickens+" Rabbits: "+rabbits);
	}
	
	public static void main(String[] args) {
		chickensAndRabbits(3,10);
	}
}
