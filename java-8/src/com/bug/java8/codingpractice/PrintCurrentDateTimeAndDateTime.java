package com.bug.java8.codingpractice;

public class PrintCurrentDateTimeAndDateTime {

	public static void main(String[] args) {
		System.out.println("Current Date: " + java.time.LocalDate.now());
		System.out.println("Current Time: " + java.time.LocalTime.now());
		System.out.println("Current Date Time: " + java.time.LocalDateTime.now());
	}
}
