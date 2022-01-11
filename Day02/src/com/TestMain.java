package com;

public class TestMain {

	public static void main(String[] args) {
		Student stud1 = new Student(1012, "Rupesh", "GKP", 60, 70, 80, 450, true);
		Student stud2 = new Student(1098, "Amit", "Delhi", 54, 70, 20, 1450, false);
		Student stud3 = new Student(1012, "Ajit", "Noida", 70, 10, 80, 4350, true);
		String name = dispalyHigestMarks(stud1, stud2, stud3);
		System.out.println("Student with Highest Salary " + name);

		Student stu = dispalyLeastMonthlyFeee(stud1, stud2, stud3);
		System.out.println(
				"Student with Least Monthly Fee " + stu.getStudentName() + " Monthly Fee " + stu.getFeePerMonth());

		displayDetails(stud1, stud2, stud3);

	}

	public static String dispalyHigestMarks(Student st1, Student st2, Student st3) {
		float st1Avg = st1.getAverage();
		float st2Avg = st2.getAverage();
		float st3Avg = st3.getAverage();

		if (st1Avg > st2Avg && st1Avg > st3Avg) {
			return st1.getStudentName();
		} else if (st2Avg > st3Avg) {
			return st2.getStudentName();
		} else {
			return st3.getStudentName();
		}
	}

	public static Student dispalyLeastMonthlyFeee(Student st1, Student st2, Student st3) {
		float st1Fee = st1.getFeePerMonth();
		float st2Fee = st2.getFeePerMonth();
		float st3Fee = st3.getFeePerMonth();

		if (st1Fee < st2Fee && st1Fee < st3Fee) {
			return st1;
		} else if (st2Fee < st3Fee) {
			return st2;
		} else {
			return st3;
		}
	}

	public static void displayDetails(Student st1, Student st2, Student st3) {
		System.out.println("Student1 Details .. Name " + st1.getStudentName() + " Total Marks " + st1.getAverage()
				+ " Get Result " + st1.getResult() + " ScholarShip Available " + st1.isEligibleForScholarship());
		System.out.println("Student2 Details .. Name " + st2.getStudentName() + " Total Marks " + st2.getAverage()
				+ " Get Result " + st2.getResult() + " ScholarShip Available " + st2.isEligibleForScholarship());
		System.out.println("Student3 Details .. Name " + st3.getStudentName() + " Total Marks " + st3.getAverage()
				+ " Get Result " + st3.getResult() + " ScholarShip Available " + st3.isEligibleForScholarship());

	}
}
