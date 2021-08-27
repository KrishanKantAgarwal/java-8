package com.bug.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {
	
	public static int findMax(List<Integer> integerList) {
		int result = integerList.stream()
				.reduce(0, Integer::max);
		
		return result;
	}
	
	public static Optional<Integer> findMin(List<Integer> integerList) {
		Optional<Integer> result = integerList.stream()
				.reduce(Integer::min);
		
		return result;
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6,7,8,9);
		System.out.println("Finding max in List<Integer>");
		System.out.println(findMax(integerList));
		
		System.out.println();
		System.out.println("Finding min in List<Integer>");
		System.out.println(findMin(integerList));
	}
}
