package com0102;

public class Employee extends Person {

	private int empId;
	private double salary;

	public Employee(String name, String gender, int empId, double salary) {
		super(name, gender);
		this.empId = empId;
		this.salary = salary;
	}
	
	

	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public void display() {
		System.out.println("Employee Display.. empId " + empId + " Salary "+ salary +  " Name " + getName() + " Gender " + getGender());
	}
	
	

}
