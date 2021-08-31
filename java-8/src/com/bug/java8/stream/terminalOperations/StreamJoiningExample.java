package com.bug.java8.stream.terminalOperations;

import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamJoiningExample {

	//Using joining without using delimiter, prefix and suffix
	public static String getNamesUsingJoining_1() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)//Stream<String>
				.collect(Collectors.joining());//String.append(String).append.... 
	}
	
	//Using delimiter. Used - as delimiter
	public static String getNamesUsingJoining_2() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)//Stream<String>
				.collect(Collectors.joining("-")); 
	}
	
	//Using delimiter, prefix and suffix. Used - as delimiter, { as prefix and } as suffix
	public static String getNamesUsingJoining_3() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)//Stream<String>
				.collect(Collectors.joining("-","(",")")); 
	}
	
	public static void main(String[] args) {
		System.out.println(getNamesUsingJoining_1());//AdamJennyEmilyDaveSophiaJames
		System.out.println(getNamesUsingJoining_2());//Adam-Jenny-Emily-Dave-Sophia-James
		System.out.println(getNamesUsingJoining_3());//(Adam-Jenny-Emily-Dave-Sophia-James)
	}
}
