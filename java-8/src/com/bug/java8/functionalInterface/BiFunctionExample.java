package com.bug.java8.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentBiFunction = ((students, studentPredicate) -> {
		Map<String, Double> studentNameAndGpaMap = new HashMap<>();
		students.forEach((student)->{
			if(studentPredicate.test(student)) {
				studentNameAndGpaMap.put(student.getName(), student.getGpa());
			}
		});
		return studentNameAndGpaMap;
	});
	
	public static void main(String[] args) {
		
		Map<String, Double> result = studentBiFunction.apply(StudentDataBase.getAllStudents(), PredicateAndConsumer.p2);
		System.out.println(result);
	}
}

