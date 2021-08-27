package com.bug.java8.stream;

import java.util.Optional;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamFindAnyFindFirstExample {

	public static Optional<Student> findAny(){
		return StudentDataBase.getAllStudents().stream()
			.filter((student) -> student.getGpa()>=3.9)
			.findAny();
	}
	
	public static Optional<Student> findFirst(){
		return StudentDataBase.getAllStudents().stream()
			.filter((student) -> student.getGpa()>=3.9)
			.findFirst();
	}
	
	public static void main(String[] args) {
		System.out.println("Find Any :");
		System.out.println(findAny());
		
		System.out.println("Find First :");
		System.out.println(findFirst());
	}
}
