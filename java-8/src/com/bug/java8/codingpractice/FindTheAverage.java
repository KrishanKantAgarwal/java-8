package com.bug.java8.codingpractice;

import java.util.Arrays;
import java.util.List;

public class FindTheAverage {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		double avg = integerList.stream().mapToInt(i -> i).average().getAsDouble();
		System.out.println(avg);
	}
}
