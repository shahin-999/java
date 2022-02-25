package bd.com.basic;

public class Method {
	
	public static int addition(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		return sum;
	}
	
	public static void check(int number1, int number2) {
		if (number1 == number2) {
			System.out.print("Numbers are same");
		}else if(number1>number2) {
			System.out.print("Number 1 is gratter than number 2");
		}else {
			System.out.print("Number 2 is gratter than number 1");
		}
	}
}
