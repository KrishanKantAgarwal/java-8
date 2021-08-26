package com.bug.java8.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class FunctionalExample2 {

	static Function<List<Student>, Map<String, List<String>>> studentFunction = (students -> {
		
		Map<String, List<String>> studentNameAndActivitiesMap = new HashMap<>();
		students.forEach((student -> {
			if(PredicateAndConsumer.p1.test(student)) {
				studentNameAndActivitiesMap.put(student.getName(), student.getActivities());
			}
		}));
		return studentNameAndActivitiesMap;
	});
	
	public static void main(String[] args) {
		
		Map<String, List<String>> result = studentFunction.apply(StudentDataBase.getAllStudents()); 
		System.out.println(result);
	}
}
