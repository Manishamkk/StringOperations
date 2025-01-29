package string.examples3;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str = "Java is more intresting language";
		char[]	 charArray  = str.toCharArray();
		System.out.println("The String is:" + str);
		System.out.println("Duplicate character in the string");
		for(int i = 0 ; i<str.length();i++) {
			for(int j = i+1;j<str.length();j++) {
				if(charArray[i] == charArray[j]) {
					System.out.println(charArray[j] + "");
					break;
				}
			}
		}
	}
	
}
