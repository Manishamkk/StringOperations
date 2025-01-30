package string.examples4;

import java.util.Scanner;

public class TogglingOfString {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {  // Use < instead of <=
            char chr = str.charAt(i);

            if(chr >= 'A' && chr <= 'Z') {
                result.append((char)(chr + 32));
            }
            else if (chr >= 'a' && chr <= 'z') {
                result.append((char)(chr - 32));
            } else {
                result.append(chr);
            }
        }
        String answer = result.toString();  // Move this line outside the loop
        System.out.println("After toggling, the string " + str + " becomes " + answer);        
    }
	
}
