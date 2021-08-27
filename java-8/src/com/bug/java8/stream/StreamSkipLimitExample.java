package com.bug.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSkipLimitExample {

	/**
	 * Limit will take the first given maxSize, here maxSize = 3
	 * @param integerList
	 * @return
	 */
	public static int limit(List<Integer> integerList) {
		int result = integerList.stream()
					//6,7,8,9,10
					.limit(3)
					//6,7,8
					.reduce(0, Integer::sum);
		
		return result;
	}
	
	/**
	 * Skip will skip the first given maxSize, here maxSize = 3
	 * @param integerList
	 * @return
	 */
	public static int skip(List<Integer> integerList) {
		int result = integerList.stream()
					//6,7,8,9,10
					.skip(3) //skipped 6,7,8
					//9,10
					.reduce(0, Integer::sum);
		
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		System.out.println("Limit Operation");
		System.out.println(limit(integerList));
		
		System.out.println();
		System.out.println("Skip Operation");
		System.out.println(skip(integerList));
	}
}
