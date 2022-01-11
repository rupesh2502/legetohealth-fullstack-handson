package activities;

import java.util.Scanner;

public class FindLarget02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First num");
			int num1 = sc.nextInt();
			System.out.println("Enter Second num");
			int num2 = sc.nextInt();
			System.out.println("Enter Third num");
			int num3 = sc.nextInt();
			
			
			int result = findNumbsLargest(num1,num2,num3);
			
			System.out.println("Larget Number is " + result );
		}

	}
	
	
	public static int findNumbsLargest(int num1,int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}else if (num2 > num3 ) {
            return num2;			
		}else {
			return num3;
		}
	}
	

}
