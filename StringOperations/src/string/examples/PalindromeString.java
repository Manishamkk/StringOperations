package string.examples;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args){
	
		 String str1 = "SpringToolSuite";
	       String str2 = "";
	        for(int i = str1.length()-1;i>=0;i-- ) {
	        	
	        	str2 = str2+str1.charAt(i);
	        }
	        System.out.println("Reversed String:" + str2);
		
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println("Palindrome String");
	}else {
		System.out.println("Not palindrome String");
	}
}
	
}