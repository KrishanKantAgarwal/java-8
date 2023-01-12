package com.bug.java8.codingpractice;

import java.util.Arrays;
import java.util.List;

public class GetTheSumOfAllTheNumberPresentInList {

	public static void main(String[] args) {
		 List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		 int sum = integerList.stream().reduce(0, (x,y) -> x + y);
		 System.out.println(sum);

	}

}
