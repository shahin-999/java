package bd.com.basic;

import java.util.Scanner;

public class IFELSE {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int number2 = input.nextInt();
		
		if (number1 == number2) {
			System.out.print("Numbers are same");
		}else if(number1>number2) {
			System.out.print("Number 1 is gratter than number 2");
		}else {
			System.out.print("Number 2 is gratter than number 1");
		}

	}

}
