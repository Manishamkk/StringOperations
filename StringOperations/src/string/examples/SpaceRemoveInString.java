package string.examples;

import java.util.Scanner;

public class SpaceRemoveInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		//String str = "Manisha Keshav Kadam";
		str = str.replaceAll("\\s", "");
		System.out.println("Remove the space of given string: "+  str);
		
		
		
		
	}
}
