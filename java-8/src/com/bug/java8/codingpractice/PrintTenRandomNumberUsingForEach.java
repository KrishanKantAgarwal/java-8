package com.bug.java8.codingpractice;

import java.util.Random;

public class PrintTenRandomNumberUsingForEach {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}

}
