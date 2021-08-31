package com.bug.java8.stream.terminalOperations;

import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamSummingIntAverageIntExample {

	public static int sum() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.summingInt(Student::getNoteBook));
	}
	
	public static double average() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.averagingInt(Student::getNoteBook));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());//81
		System.out.println(average());//13.5
	}
}
