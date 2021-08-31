package com.bug.java8.stream.terminalOperations;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamThreeLevelGroupingByExample {

	public static void threeArgumentMap() {
		SortedMap<String, Set<Student>> studentMap= StudentDataBase.getAllStudents()
					.stream()
					.collect(Collectors.groupingBy(Student::getName,
							TreeMap::new,
							Collectors.toSet()));
		
		System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		threeArgumentMap();
	}
}
