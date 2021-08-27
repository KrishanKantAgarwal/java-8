package com.bug.java8.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamMapExample {
	
	/**
	 * map in stream converts one form of data type to another form of data type
	 */

	public static List<String> printNamesList(){
		List<String> nameList = StudentDataBase.getAllStudents()
						.stream()
						.map(Student::getName)
						.collect(Collectors.toList());
		return nameList;
	}
	
	public static Set<String> printNamesSet(){
		Set<String> nameList = StudentDataBase.getAllStudents()
						.stream()
						.map(Student::getName)
						.collect(Collectors.toSet());
		return nameList;
	}	
	
	public static void main(String[] args) {
		System.out.println(printNamesList());
		System.out.println(printNamesSet());
	}
}
