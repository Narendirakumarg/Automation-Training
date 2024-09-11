package com.MyAssignments;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int i = rnd.nextInt(6);
		System.out.println(i);
		
		String s = rnd.toString();
		System.out.println(s);
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWZYX";
	}

}