package com.org.controller;

import java.util.List;
import java.util.Scanner;

import com.org.dao.EmployeeStorage;
import com.org.dto.Employee;
import com.org.factory.EmployeeStorageFactory;

public class EmployeeController {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		EmployeeStorage empStorage = EmployeeStorageFactory.getInstance();
		while(true) {
        System.out.println("1.Store");
        System.out.println("2.Find By Id");
        System.out.println("3.Find All");
        System.out.println("4.Delete By Id");
        System.out.println("5.Exit");
        
        int option = sc.nextInt();
        
        switch (option) {
		case 1:
			System.out.println("Enter Employee Id");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Employee Salary");
			long salary = sc.nextLong();
			Employee emp = new Employee(id,name,salary);
			empStorage.save(emp);
			break;
		case 3:
		    List<Employee> listEmp = empStorage.findEmployees();
		    for (Employee employee : listEmp) {
				System.out.println(employee);
			}
		    break;
		case 5:
			System.exit(1);

		default:
			break;
		}
		}
	}
}
