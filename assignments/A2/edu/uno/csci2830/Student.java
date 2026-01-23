package edu.uno.csci2830;

public class Student {
	private final int id;
	private final String name;

	// TODO: static counter for all students ever created
	private static int totalStudentsCreated = 0;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		// TODO: increment totalStudentsCreated
		totalStudentsCreated++;
	}

	@Override
	public String toString() {
		return this.name;
	}

	// REQUIRED (autograder calls this)
	public static int getTotalStudentsCreated() {
		return totalStudentsCreated; // TODO
	}

	// Main method for testing
	/*
	 * public static void main(String[] args) {
	 * Student greg = new Student(100, "Gregory");
	 * System.out.println(greg.toString());
	 * System.out.println(greg.id);
	 * System.out.println(Student.getTotalStudentsCreated());
	 * Student fred = new Student(100, "Fred");
	 * System.out.println(fred.toString());
	 * System.out.println(fred.id);
	 * System.out.println(Student.getTotalStudentsCreated());
	 * Student bob = new Student(100, "Bob");
	 * System.out.println(bob.toString());
	 * System.out.println(bob.id);
	 * System.out.println(Student.getTotalStudentsCreated());
	 * }
	 */
}
