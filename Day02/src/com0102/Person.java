package com0102;

public class Person {
	private String name;
	private String gender;

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void display() {
		System.out.println("Person Display..... Name " + name + " Gender " + gender);
	}
}
