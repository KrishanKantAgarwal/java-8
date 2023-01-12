package com.bug.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class StreamFlatMapExample {

	/**
	 * We are using flatMap here because Collectors.toList() 
	 * can't able to identify the Stream<List<String>>
	 * @return List<String>
	 */
	public static List<String> printStudentActivities(){
		List<String> studentList = StudentDataBase.getAllStudents()
						.stream()//Stream<Student>
						.map(Student::getActivities)//Stream<List<String>>
						.flatMap(List::stream)//Stream<String>
						.collect(Collectors.toList());//List<String>
		
		return studentList;
	}
	
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}
}
