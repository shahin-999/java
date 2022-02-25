package bd.com.basic;

import java.util.ArrayList;

public class LOOP {

	public static void main(String[] args) {
		//Array
		String[] names = {"Samiha", "Arshad", "Asif", "Easin"};
		
		//Array List  Method: add, remove, get, clear, size
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println("Size : "+nameList.size());
		nameList.add("Asif");
		nameList.add("Arshad");
		System.out.println("Size : "+nameList.size());
		
		for(int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

		//for each loop
//		for (String value : nameList) {
//			
//			System.out.println(value);
//		}
		
	}

}
