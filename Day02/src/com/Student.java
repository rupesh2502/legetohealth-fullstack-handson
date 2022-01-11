package com;

public class Student {
	/*
	 * getAnualFee() which returns the product of feePerMonth and 12 •
	 * getTotalmarks() which returns the sum of marks1, marks2 and marks3 •
	 * getAverage() which returns the average of marks1, marks2 and marks3 •
	 * getResult() which returns “pass” if the person has scored more than 60 in
	 * each subject, or returns “fail” otherwise
	 */

	private int studentId;
	private String studentName;
	private String city;
	private int marks1;
	private int marks2;
	private int marks3;
	private float feePerMonth;
	private boolean isEligibleForScholarship;

	public Student(int studentId, String studentName, String city, int marks1, int marks2, int marks3,
			float feePerMonth, boolean isEligibleForScholarship) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.feePerMonth = feePerMonth;
		this.isEligibleForScholarship = isEligibleForScholarship;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public float getFeePerMonth() {
		return feePerMonth;
	}

	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}

	public boolean isEligibleForScholarship() {
		return isEligibleForScholarship;
	}

	public void setEligibleForScholarship(boolean isEligibleForScholarship) {
		this.isEligibleForScholarship = isEligibleForScholarship;
	}

	public float getAnualFee() {
		return feePerMonth * 12;
	}

	public int getTotalmarks() {
		return marks1 + marks2 + marks3;
	}
	
	public float getAverage() {
		return getTotalmarks()/3;
	}
	
	public String getResult() {
		if(marks1 >=60 && marks2 >=60 && marks3 >=60)
			return "PASS";
		else
			return "FAIL";
	}

}
