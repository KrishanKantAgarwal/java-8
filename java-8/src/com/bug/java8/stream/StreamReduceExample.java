package com.bug.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integers) {
		int result = integers
						.stream()
						//5
						//12
						//13
						//4
						//1
						//6
						//3
						//i1 = 1(actual) i2 = 5(from stream) => result = 5
						//i1 = 5(from result) i2 = 12(from stream) => result = 60
						//i1 = 60 i2 = 4(from stream) => result = 240
						//.....
						.reduce(1, (i1, i2) -> i1 * i2);
		
		return result;
	}
	
	public static Optional<Student> getHighestGPAOfStudent() {
		Optional<Student> student = StudentDataBase.getAllStudents()
					.stream()
					.reduce((s1, s2) -> s1.getGpa()>s2.getGpa() ? s1 : s2);
		
		return student;
	}
	
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(5,12,13,4,1,6,3);
		System.out.println("Multiplication");
		System.out.println(performMultiplication(integerList));
		
		System.out.println();
		System.out.println("Highest GPA");
		Optional<Student> student = getHighestGPAOfStudent();
		if(student.isPresent())
			System.out.println(student);
	}
}
