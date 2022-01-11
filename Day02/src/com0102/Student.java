package com0102;

public class Student extends Person {
	private int rollNo;
	private char grade;

	public Student(String name, String gender, int rollNo, char grade) {
		super(name, gender);
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public void display() {
		System.out.println("Student Display.. rollNo " + rollNo + " Grade "+ grade +  " Name " + getName() + " Gender " + getGender());
	}

}
