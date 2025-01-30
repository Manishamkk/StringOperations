package string.examples4;

public class StringContainVowels {
	
	public static void main(String[] args) {
		System.out.println(stringContainVowels("Hello"));
		System.out.println(stringContainVowels("SB"));
	}
		public static boolean stringContainVowels(String input) {
			return input.toLowerCase().matches(".*[aeiou].*");
		
	}
}
