package string.examples2;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Army";
		String str2 = "Mary";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length()==str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result  = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println(str1 + "and" + str2 +  "are anagram string");
			}else {
				System.out.println(str1  +  "and" + str2 + "are not anagram string");
			} 
			}else {
				System.out.println("not vaild anagram string");
			}
		}
	}


