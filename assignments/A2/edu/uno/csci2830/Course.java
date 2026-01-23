package edu.uno.csci2830;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
	private final int id;
	private final String name;
	private final String title;

	private final ArrayList<Student> students = new ArrayList<>();
	private int studentCount = 0; // TODO: track students in THIS course

	public Course(int id, String name, String title) {
		this.id = id;
		this.name = name;
		this.title = title;
	}

	// REQUIRED
	public void addStudent(Student s) {
		students.add(s);
		this.studentCount++;
		// TODO: add to list + increment studentCount
	}

	// REQUIRED
	public int getStudentCount() {
		return studentCount;
	}

	// REQUIRED
	public java.util.List<Student> getStudents() {
		return Collections.unmodifiableList(students);
	}

	// main method for testing
	/*
	 * public static void main(String[] args) {
	 * Student greg = new Student(1, "Gregory");
	 * Student bob = new Student(1, "Bob");
	 * Student frank = new Student(1, "Frank");
	 * Course c1 = new Course(1, "Java!", "csci2830");
	 * Course c2 = new Course(2, "Algorithms", "csci3660");
	 * 
	 * c1.addStudent(greg);
	 * c2.addStudent(bob);
	 * c2.addStudent(frank);
	 * 
	 * int c1Students = c1.getStudentCount();
	 * int c2Students = c2.getStudentCount();
	 * 
	 * System.out.println(c1.getStudents());
	 * System.out.println(c2.getStudents());
	 * 
	 * System.out.printf("%d\n", c1Students);
	 * System.out.printf("%d\n", c2Students);
	 * }
	 */

}
