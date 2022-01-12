package com;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------Checking try catch finally concept-----");
		System.out.println("Enter x ");
		int x = sc.nextInt();
		System.out.println("Enter y ");
		int y = sc.nextInt();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		checkDivisibility(x, y, age);

	}

	public static void checkDivisibility(int x, int y, int age) throws ArithmeticException{
		try {
			@SuppressWarnings("unused")
			int z = x / y;
			if (age >= 18 && age <= 60) {
				System.out.println("-----Age in range----");
			}else {
				throw new AgeNotFoundException("Age is not in range");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("----Finally Block Executed-----");
		}
		System.out.println("----checkDivisibility is completed----");
	}
}
