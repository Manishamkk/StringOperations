package string.examples;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		String input = "Welcome To Java Learning";
		StringBuilder input2 = new StringBuilder();
		input2.append(input);
		input2.reverse();
		System.out.println("Reversed String by using StringBuilder Class :" + input2);
		
		
	}
	
	
	
}
