package com.bug.java8.stream.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupByBasedOnGender() {
		Map<String, List<Student>> studentGroupedByGender = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentGroupedByGender);
	}
	
	public static void groupByBasedOnCustomized() {
		Map<String, List<Student>> studentGroupedByCustomized = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy((student) -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));
		
		System.out.println(studentGroupedByCustomized);
	}
	
	public static void main(String[] args) {
		System.out.println("Grouping Student based on Gender : ");
		groupByBasedOnGender();
		
		System.out.println();
		
		System.out.println("Grouping Student based on customized property : ");
		groupByBasedOnCustomized();
	}
}
