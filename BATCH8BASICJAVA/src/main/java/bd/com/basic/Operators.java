package bd.com.basic;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int number2 = input.nextInt();
		
		int sum = number1+number2;
		int multi = number1*number2;
		System.out.println("SUM: " +sum);
		System.out.println("Multiplication : "+multi);
	}
}
