package com0102;

public class TestPolyInher {

	public static void main(String[] args) {
		Person per = new Person("Ajit", "Male");
		print(per);

		Employee emp = new Employee("rupesh", "Male", 101, 10092);
		print(emp);

		Student stud = new Student("Amit", "Male", 10946, 'A');
		print(stud);

		Customer cust = new Customer("Ashish", "Male", 1089, 73662525, 3763636);
		print(cust);

	}

	public static void print(Person p) {
		p.display();
	}

}
