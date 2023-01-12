package com.bug.java8.codingpractice;

import java.util.Arrays;
import java.util.List;

public class CountStringWhoseLengthIsGreaterThan3 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList
				("Hello","Interview","Questions","Answers","Ram","for");
		
		long count = stringList.stream().filter(s -> s.length() > 3).count();
		System.out.println("No. of string whose length is greater than 3 = " + count);
		
		System.out.println();
		
		System.out.println("Multiply 3 to each element");
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
		
		integerList.stream()
				.map(i -> i * 3).forEach(System.out::print);
		
	}
}
