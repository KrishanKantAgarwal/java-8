package com.bug.java8.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.bug.java8.models.Student;
import com.bug.java8.models.StudentDataBase;

public class BiConsumerExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		BiConsumer<String, String> biconsumer1 = (s1, s2) -> System.out.println(s1.concat(s2));
		biconsumer1.accept("Krishan", "Kant");
		
		System.out.println("**************************************");
		System.out.println();
		BiConsumer<String, List<String>> biconsumer2 = (name, activities) -> System.out.println(name + ":" + activities);
		students.forEach((student -> biconsumer2.accept(student.getName(), student.getActivities())));
		
		BiConsumer<Integer, Integer>  biconsumer3 = (i1, i2) -> System.out.println(i1 * i2);
		BiConsumer<Integer, Integer>  biconsumer4 = (i1, i2) -> System.out.println(i1 / i2);
		
		System.out.println("**************************************");
		System.out.println();
		biconsumer3.andThen(biconsumer4).accept(5,5);
		
	}
}
