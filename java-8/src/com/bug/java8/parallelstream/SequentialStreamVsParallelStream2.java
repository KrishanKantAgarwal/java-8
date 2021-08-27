package com.bug.java8.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class SequentialStreamVsParallelStream2 {

	public static List<String> sequentialPrintStudentActivities(){
		
		long startTime = System.currentTimeMillis();
		
		List<String> studentList = StudentDataBase.getAllStudents()
						.stream()//Stream<Student>
						.map(Student::getActivities)//Stream<List<String>>
						.flatMap(List::stream)//Stream<String>
						.sorted()
						.collect(Collectors.toList());//List<String>
		
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in sequential stream pipeline : " + (endTime - startTime));
		return studentList;
	}
	
	public static List<String> parallelPrintStudentActivities(){
		
		long startTime = System.currentTimeMillis();
		
		List<String> studentList = StudentDataBase.getAllStudents()
						.stream()//Stream<Student>
						.parallel()
						.map(Student::getActivities)//Stream<List<String>>
						.flatMap(List::stream)//Stream<String>
						.sorted()
						.collect(Collectors.toList());//List<String>
		
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in parallel stream pipeline : " + (endTime - startTime));
				
		return studentList;
	}
	
	public static void main(String[] args) {
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
	}
}
