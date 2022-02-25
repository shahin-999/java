package bd.com.basic;

import java.util.Scanner;

public class UserInput extends Method{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.println("Number : " +number);
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();
		
		addition(number, number1);
		
	}

}
