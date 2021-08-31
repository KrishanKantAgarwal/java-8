package com.bug.java8.stream.terminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamMappingExample {

	public static void main(String[] args) {
		
		List<String> nameList = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(nameList);
		System.out.println();
		
		Set<String> nameSet = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		
		System.out.println(nameSet);
	}
}
