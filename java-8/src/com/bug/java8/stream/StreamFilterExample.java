package com.bug.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamFilterExample {

	public static List<Student> filterStudentByGender(){
		List<Student> studentList = StudentDataBase.getAllStudents().stream()
						.filter((student) -> student.getGender().equals("female"))
						.collect(Collectors.toList());
		
		return studentList;
	}
	
	public static List<Student> filterStudentByGenderAndGradeLevel(){
		List<Student> studentList = StudentDataBase.getAllStudents().stream()
						.filter((student) -> student.getGender().equals("female"))
						.filter((student) -> student.getGradeLevel() >= 3)
						.collect(Collectors.toList());
		
		return studentList;
	}
	
	public static void main(String[] args) {
		filterStudentByGender().forEach(System.out::println);
		
		System.out.println();
		System.out.println("Filter student based on gender and grade level :");
		filterStudentByGenderAndGradeLevel().forEach(System.out::println);
	}
}
