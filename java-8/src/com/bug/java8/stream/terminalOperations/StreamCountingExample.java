package com.bug.java8.stream.terminalOperations;

import java.util.stream.Collectors;

import com.bug.java8.models.StudentDataBase;

public class StreamCountingExample {

	/**
	 * Counting returns the no. of count which satisfies the above Stream
	 * @return
	 */
	public static long getCount() {
		return StudentDataBase.getAllStudents()
				.stream()//Stream<Student>
				.filter((student) -> student.getGpa() >= 3.9)//Stream<Student>
				.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		System.out.println(getCount());
	}
}
