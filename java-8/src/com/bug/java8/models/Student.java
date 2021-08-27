package com.bug.java8.models;

import java.util.List;

public class Student {

	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	private List<String> activities;
	private int noteBook;
	
	public void printActivities() {
		System.out.println(activities);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
	}

	public int getNoteBook() {
		return noteBook;
	}

	public void setNoteBook(int noteBook) {
		this.noteBook = noteBook;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noteBook) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
		this.noteBook = noteBook;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + ", noteBook=" + noteBook + "]";
	}
	
	
	
	
}
