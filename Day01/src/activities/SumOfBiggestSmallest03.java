package activities;

import java.util.Scanner;

public class SumOfBiggestSmallest03 {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First num");
			int num1 = sc.nextInt();
			System.out.println("Enter Second num");
			int num2 = sc.nextInt();
			System.out.println("Enter Third num");
			int num3 = sc.nextInt();
			
			
			int result = sumOfSmallestAndBiggest(num1,num2,num3);
			
			System.out.println("Larget Number is " + result );
		}

	}
	
	public static int sumOfSmallestAndBiggest(int num1,int num2 ,int num3) {
		int biggest=0;
		int smallest=0;
		
		if(num1 > num2 && num1 > num3) {
			biggest=num1;
		}else if(num2>num3) {
			biggest=num2;
		}else {
			biggest=num3;
		}
		
		if(num1 < num2 && num1 < num3) {
			smallest=num1;
		}else if(num2<num3) {
			smallest=num2;
		}else {
			smallest=num3;
		}
		
		return smallest + biggest;
	}

}
