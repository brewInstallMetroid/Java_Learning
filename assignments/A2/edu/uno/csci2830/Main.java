package edu.uno.csci2830;

public class Main {
	public static void main(String[] args) {
		Course c1 = new Course(0, "CSCI 2830", "OO Software Engineering Fundamentals");

		for (int i = 0; i < 10; i++) {
			Student s = new Student(i, "Student" + i);
			c1.addStudent(s);
			// TODO: add to c1
		}

		// TODO: separate loop to print students from c1
		for (Student s : c1.getStudents()) {
			System.out.println(s);
		}

		Course c2 = new Course(1, "CSCI 2830", "Section 2");
		for (int i = 0; i < 15; i++) {
			Student s = new Student(100 + i, "StudentB" + i);
			// TODO: add to c2
			c2.addStudent(s);
		}

		// TODO: print counters::
		// c1 count, c2 count, total students created
		System.out.println(c1.getStudentCount());
		System.out.println(c2.getStudentCount());
		System.out.println(Student.getTotalStudentsCreated());
	}
}
