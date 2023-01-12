package com.bug.java8.codingpractice;

import java.util.Arrays;

public class FindTheMinimumNumber {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6,7,-1};
		System.out.print(findMinimum(arr));
	}

	private static int findMinimum(int[] arr) {
		return Arrays.stream(arr).min().getAsInt();
	}
}
