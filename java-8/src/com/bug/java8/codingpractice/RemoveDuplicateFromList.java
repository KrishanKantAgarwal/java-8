package com.bug.java8.codingpractice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<Integer> integerList1 = Arrays.asList(1,2,3,4,1,2,3);
		System.out.println("Removing Duplicates using distinct().. ");
		integerList1.stream().distinct().forEach(System.out::print);//123
		
		System.out.println();
		
		List<Integer> integerList2 = Arrays.asList(4,5,6,7,1,2,3);
		System.out.println("Sorting the list using sorted().. ");
		integerList2.stream().sorted().forEach(System.out::print);
		
	}
}
