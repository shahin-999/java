package bd.com.basic;

import java.util.Scanner;

public class Inheritance extends Method{

	static int staticVaraible = 10;
	int nonStaticVaraible = 10;
	
	public static void Print() {
		System.out.println(staticVaraible);
//		System.out.println(nonStaticVaraible);
	}
	
	public static void main(String[] args) {
		System.out.println(staticVaraible);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter a number: ");
		int number2 = input.nextInt();
		
		addition(number1, number2);
		check(number1, number2);

	}

}
