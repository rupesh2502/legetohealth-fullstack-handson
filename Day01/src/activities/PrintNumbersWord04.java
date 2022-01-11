package activities;

import java.util.Scanner;

public class PrintNumbersWord04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First num");
			int num1 = sc.nextInt();
			System.out.println("Enter Second num");
			int num2 = sc.nextInt();
			System.out.println("Enter Third num");
			int num3 = sc.nextInt();

			 writeNumbesInWord(num1, num2, num3);

		}

	}

	public static void writeNumbesInWord(int num1, int num2, int num3) {
		int arr[] = new int[3];
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		for (int a : arr) {
			int num = a;
			switch (num) {
			case 1:
				System.out.println("One ");
				break;
			case 2:
				System.out.println("Two ");
				break;
			case 3:
				System.out.println("Three ");
				break;
			case 4:
				System.out.println("Four ");
				break;
			case 5:
				System.out.println("Five ");
				break;
			case 6:
				System.out.println("Six ");
				break;
			case 7:
				System.out.println("Seven ");
				break;
			case 8:
				System.out.println("Eight ");
				break;
			case 9:
				System.out.println("Nine ");
				break;
			case 0:
				System.out.println("Zero");
				break;

			}
		}

	}

}
